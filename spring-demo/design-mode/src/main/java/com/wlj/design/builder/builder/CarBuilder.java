package com.wlj.design.builder.builder;

import com.wlj.design.builder.product.CarModel;

import java.util.ArrayList;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 23:01
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public abstract class CarBuilder {

   public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
