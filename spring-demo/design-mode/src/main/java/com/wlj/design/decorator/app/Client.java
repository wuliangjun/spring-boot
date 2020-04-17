package com.wlj.design.decorator.app;

import com.wlj.design.decorator.Component;
import com.wlj.design.decorator.ConcreteComponent;
import com.wlj.design.decorator.ConcreteDecorator1;
import com.wlj.design.decorator.ConcreteDecorator2;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/17 17:14
 * @history: 1.2020/4/17 created by liangjun.wu
 */
public class Client {
    public static void main(String[] args){
        Component ballBat = new ConcreteComponent();
        //第一次装饰球拍
        ballBat = new ConcreteDecorator1(ballBat);
        //第二次装饰球拍
        ballBat = new ConcreteDecorator2(ballBat);
        //装饰完球拍开始打球了
        ballBat.playBall();
    }
}
