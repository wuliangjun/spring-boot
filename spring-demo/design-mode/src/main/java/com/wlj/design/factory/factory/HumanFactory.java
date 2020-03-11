package com.wlj.design.factory.factory;

import com.wlj.design.factory.product.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/3/11 16:01
 * @history: 1.2020/3/11 created by liangjun.wu
 */
public class HumanFactory extends AbstractHumanFactory{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
            logger.error("人种生成错误");
        }
        return (T)human;
    }
}
