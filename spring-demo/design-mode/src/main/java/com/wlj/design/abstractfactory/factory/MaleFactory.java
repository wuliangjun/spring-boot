package com.wlj.design.abstractfactory.factory;

import com.wlj.design.abstractfactory.product.Human;
import com.wlj.design.abstractfactory.product.MaleBlackHuman;
import com.wlj.design.abstractfactory.product.MaleWhiteHuman;
import com.wlj.design.abstractfactory.product.MaleYellowHuman;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 16:36
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class MaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
