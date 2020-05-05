package com.wlj.design.flyweight;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 14:02
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    private final String Extrinsic;
    //要求享元角色必须接受外部状态

    public Flyweight(String extrinsic) {
        this.Extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    //内部状态的get/set

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
