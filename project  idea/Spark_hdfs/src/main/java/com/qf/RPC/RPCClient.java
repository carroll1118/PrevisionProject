package com.qf.RPC;

import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.net.InetSocketAddress;
/*
* RPC的客户端
* */
public class RPCClient {
    public static void main(String[] args){
        try {
            while (true){
                Hello hello = RPC.getProxy(Hello.class, 1,new InetSocketAddress("127.0.0.1",6666),new Configuration());
                String res = hello.say("i am datanode01,i am live");
                System.out.println(res);
                Thread.sleep(3000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
