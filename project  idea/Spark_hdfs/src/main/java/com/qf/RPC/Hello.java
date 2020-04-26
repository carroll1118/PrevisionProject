package com.qf.RPC;
/*
*  RPC中的协议
* */
public interface Hello {
    public static final long versionID = 1;
    //协议
    public String say(String words);
}
