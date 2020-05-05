package com.wlj.design.chain.app;

import com.wlj.design.chain.*;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 15:23
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler1.handleMessage(new Request("2"));
    }
}
