package com.wlj.design.prototype.app;

import com.wlj.design.prototype.ConcretePrototype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 11:04
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class Client {

    private static Logger logger = LoggerFactory.getLogger("client");

    public static void main(String[] args){
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setCode("1");
        concretePrototype.setName("2");
        //拷贝对象
        ConcretePrototype concretePrototype2 = concretePrototype.clone();
        //设置属性
        concretePrototype2.setName("clone");
        //通过打印可以看到：
        //1.clone没有执行构造函数
        //2.由于属性是不可变引用（String） ，所以浅拷贝确实拷贝成功了，两个对象间不会互相影响
        logger.info(concretePrototype.toString());
        logger.info(concretePrototype2.toString());
        logger.info(concretePrototype.toString());
    }

}
