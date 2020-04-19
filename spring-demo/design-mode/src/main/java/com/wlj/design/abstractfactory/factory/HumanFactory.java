package com.wlj.design.abstractfactory.factory;

import com.wlj.design.abstractfactory.product.Human;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 16:32
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public interface HumanFactory {

    Human createYellowHuman();

    Human createBlackHuman();

    Human createWhiteHuman();
}
