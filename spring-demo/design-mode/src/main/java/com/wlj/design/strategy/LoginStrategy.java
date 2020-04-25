package com.wlj.design.strategy;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 11:45
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public interface LoginStrategy {

    boolean before();

    boolean login();

    boolean after();
}
