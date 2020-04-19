package com.wlj.design.abstractfactory.factory;

import com.wlj.design.abstractfactory.product.FemaleBlackHuman;
import com.wlj.design.abstractfactory.product.FemaleWhiteHuman;
import com.wlj.design.abstractfactory.product.FemaleYellowHuman;
import com.wlj.design.abstractfactory.product.Human;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 16:35
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class FemaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
