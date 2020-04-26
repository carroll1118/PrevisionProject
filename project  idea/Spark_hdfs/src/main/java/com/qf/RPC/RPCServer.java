package com.qf.RPC;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.Server;

/*
* RPC中的server
* */
public class RPCServer implements Hello {

    @Override
    public String say(String words) {
        System.out.println("i am server....");
        System.out.println(words);
        //逻辑代码下面编写

        return "recived datanode01 heartbeats!";
    }

    public static void main(String[] args) {
        try {
            //获取一个服务
            Server server = new RPC.Builder(new Configuration())
              .setInstance(new RPCServer())
              .setProtocol(Hello.class)
              .setBindAddress("127.0.0.1")
              .setPort(6666)
              .build();

            //启动服务
            server.start();
            System.out.println("Server is started.....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
