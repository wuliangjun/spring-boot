package com.wlj.design.builder.builder;

import com.wlj.design.builder.product.BenzModel;
import com.wlj.design.builder.product.CarModel;

import java.util.ArrayList;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 23:02
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benzModel;
    }
}
