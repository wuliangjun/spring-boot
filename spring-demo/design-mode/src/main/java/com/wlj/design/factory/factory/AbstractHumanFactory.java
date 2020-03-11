package com.wlj.design.factory.factory;

import com.wlj.design.factory.product.Human;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/3/11 15:56
 * @history: 1.2020/3/11 created by liangjun.wu
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
