package com.qf.Hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.*;
import java.net.URI;

//java连接虚拟机的hadoop，并读取hdfs文件系
public class HdfsTest {
    public static void main(String[] args) throws IOException {
        FSDataInputStream is  = null;
        OutputStream out = null;

        try {
            Configuration conf = new Configuration();

            // 不设置该代码会出现错误：java.io.IOException: No FileSystem for scheme: hdfs
            conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");

            String filePath = "hdfs://192.168.25.132:9000/test/test.txt";
            Path path = new Path(filePath);

            // 这里需要设置URI，否则出现错误：java.lang.IllegalArgumentException: Wrong FS: hdfs://127.0.0.1:9000/test/test.txt, expected: file:///
            FileSystem fs = FileSystem.get(new URI(filePath), conf);

            System.out.println( "READING ============================" );
            is = fs.open(path);


            out = new FileOutputStream(new File("D:\\hadoop_hdfs_test\\test01.txt"));
            IOUtils.copyBytes(is,out,4096,true);
         /*   BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 示例仅读取一行
            String content = br.readLine();
            System.out.println(content);
            br.close();


            System.out.println("WRITING ============================");
            byte[] buff = "this is helloworld from java api!\n".getBytes();
            FSDataOutputStream os = fs.create(path);
            os.write(buff, 0, buff.length);
            os.close();
            fs.close();*/
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            is.close();
            out.close();
        }
    }
}
