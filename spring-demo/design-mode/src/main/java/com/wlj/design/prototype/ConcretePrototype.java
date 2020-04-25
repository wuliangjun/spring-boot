package com.wlj.design.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 11:01
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class ConcretePrototype implements Cloneable{

    private String code;

    private String name;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ConcretePrototype(){
        logger.info("执行构造函数");
    }


    @Override
    public ConcretePrototype clone(){
        ConcretePrototype concretePrototype = null;
        try{
            concretePrototype = (ConcretePrototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return concretePrototype;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
