package com.wlj.design.builder.product;

import java.util.ArrayList;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 22:48
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run(){
        for(String actionName : sequence){
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    public final void setSequence(ArrayList sequence){
        this.sequence = sequence;
    }
}
