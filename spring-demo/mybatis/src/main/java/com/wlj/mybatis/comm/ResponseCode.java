package com.wlj.mybatis.comm;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/2/17 16:14
 * @history: 1.2020/2/17 created by liangjun.wu
 */
public enum ResponseCode {
    ok("ok"),
    error("error");

    private String code;

    private ResponseCode(String code) {
        this.code = code;
    }
}
