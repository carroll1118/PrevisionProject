package com.qf.MapReduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/*
* map阶段
* 行偏移量：每一行的第一个字母距离该文件的首位置的距离
* Mapper<KEYIN , VALUEIN , KEYOUT ,VALUEOUT>
* KEYIN   ：   map阶段输入的key的类型
* VALUEIN ：  map阶段输入的value的类型
* KEYOUT  ：   map阶段输出的key的类型
* VALUEOUT： map阶段输出的value的类型
*
* Reducer<Text, IntWritable,Text,IntWritable>

*
*
*
 * */
public class MyWordCount {
    public static class MyMapper extends Mapper<LongWritable, Text,Text,IntWritable>{
        public static Text k = new Text();
        public static IntWritable v = new IntWritable();
        @Override
        protected void map(LongWritable key,Text value,Context context)
            throws IOException,InterruptedException{
            //1.从输入数据中获取每一个文件中的每一行的值
            String line = value.toString();
            //2.对每一行的数据进行切分(有的不需要)
            String[] words = line.split(" ");
            //3.循环处理
            for (String word : words){
                k.set(word);
                v.set(1);
                context.write(k,v);
            }
        }
    }
    public static class MyReducer extends Reducer<Text, IntWritable,Text,IntWritable>{
        @Override
        protected void reduce(Text key,Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
            int counter = 0;
            for (IntWritable i : values){
                counter += i.get();
            }
            context.write(key,new IntWritable(counter));
        }
    }
    //驱动
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //1.获取配置对象信息
        Configuration conf = new Configuration();
        //2.对conf进行设置
        //3.获取job对象
        Job job = Job.getInstance(conf,"mywordcount");
        //4.设置job的运行主类
        job.setJarByClass(MyWordCount.class);

        //5.对map阶段进行设置
        job.setMapperClass(MyMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job,new Path(args[0]));

        //6.对reduce阶段设置
        job.setReducerClass(MyReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        FileOutputFormat.setOutputPath(job,new Path(args[0]));

        //7.提交jobbin,并打印信息
        int  isok = job.waitForCompletion(true)? 0:1;
        System.exit(isok);
    }

}
