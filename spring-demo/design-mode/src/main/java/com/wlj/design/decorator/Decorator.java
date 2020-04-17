package com.wlj.design.decorator;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/17 17:06
 * @history: 1.2020/4/17 created by liangjun.wu
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void playBall() {
        this.component.playBall();
    }
}
