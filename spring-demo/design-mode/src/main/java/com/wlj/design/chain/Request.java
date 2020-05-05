package com.wlj.design.chain;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 15:14
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class Request {

    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Request(String level) {
        this.level = level;
    }

    public Level getRequestLevel(){return new Level(this.level);}
}
