package com.qf.Hdfs;


import org.apache.commons.math3.stat.inference.GTest;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

//java连接虚拟机的hadoop，并上传文件到hdfs
public class HdfsTest2 {
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
            fs.copyFromLocalFile(new Path("D:\\hadoop_hdfs_test\\test01.txt"),new Path("/test"));
            System.out.println("finshed ******************fighting-----------");


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            is.close();
            out.close();
        }
    }
}
