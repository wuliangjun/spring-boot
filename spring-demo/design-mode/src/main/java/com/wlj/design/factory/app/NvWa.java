package com.wlj.design.factory.app;

import com.wlj.design.factory.factory.AbstractHumanFactory;
import com.wlj.design.factory.factory.HumanFactory;
import com.wlj.design.factory.product.BlackHuman;
import com.wlj.design.factory.product.Human;
import com.wlj.design.factory.product.WhiteHuman;
import com.wlj.design.factory.product.YellowHuman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/3/11 17:25
 * @history: 1.2020/3/11 created by liangjun.wu
 */
public class NvWa {

    private static Logger logger = LoggerFactory.getLogger("NvWa");

    public static void main (String[] args){
        logger.info("==========工厂模式举例==========");
        //声明工厂
        AbstractHumanFactory factory = new HumanFactory();
        //生产白种人
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑种人
        Human blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        //生产黄种人
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
