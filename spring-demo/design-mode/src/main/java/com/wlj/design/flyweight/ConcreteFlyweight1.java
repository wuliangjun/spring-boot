package com.wlj.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 14:05
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class ConcreteFlyweight1 extends Flyweight {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //进行业务处理
        logger.info("ConcreteFlyweight1 执行业务方法");
    }
}
