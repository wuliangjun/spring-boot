package com.wlj.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 14:07
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class ConcreteFlyweight2 extends Flyweight {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        logger.info("ConcreteFlyweight2 执行业务方法");
    }
}
