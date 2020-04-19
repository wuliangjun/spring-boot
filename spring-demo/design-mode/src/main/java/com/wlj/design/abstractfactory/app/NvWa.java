package com.wlj.design.abstractfactory.app;

import com.wlj.design.abstractfactory.factory.FemaleFactory;
import com.wlj.design.abstractfactory.factory.HumanFactory;
import com.wlj.design.abstractfactory.factory.MaleFactory;
import com.wlj.design.abstractfactory.product.Human;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 16:37
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class NvWa {
    public static void main(String[] args){
        //男性工厂
        HumanFactory maleHumanFactory = new MaleFactory();
        //女性工厂
        HumanFactory femaleHumanFactory = new FemaleFactory();

        //生产男性的各种人种
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        maleBlackHuman.getColor();
        maleBlackHuman.getSex();
        maleBlackHuman.talk();

        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        maleWhiteHuman.getColor();
        maleWhiteHuman.getSex();
        maleWhiteHuman.talk();

        Human maleYellowHuman =maleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

    }
}
