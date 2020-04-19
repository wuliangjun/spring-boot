package com.wlj.design.builder.director;

import com.wlj.design.builder.builder.BMWBuilder;
import com.wlj.design.builder.builder.BenzBuilder;
import com.wlj.design.builder.product.BenzModel;

import java.util.ArrayList;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 23:05
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     *  A类型奔驰车，先start，后stop
     * @return
     */
    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    /**
     *  B类型奔驰车，engine boom ,start，stop
     * @return
     */
    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }
}
