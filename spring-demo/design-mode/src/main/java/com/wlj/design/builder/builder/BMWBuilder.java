package com.wlj.design.builder.builder;

import com.wlj.design.builder.product.BMWModel;
import com.wlj.design.builder.product.CarModel;

import java.util.ArrayList;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 23:04
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
