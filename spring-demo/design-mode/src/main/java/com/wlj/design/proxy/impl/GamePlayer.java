package com.wlj.design.proxy.impl;

import com.wlj.design.proxy.IGamePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 22:41
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class GamePlayer implements IGamePlayer {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name = "";

    public GamePlayer(String name){
        this.name = name;
    }

    public void playGame() {
        logger.info(this.name+"正在打游戏");
    }

    public void playBoss() {
        logger.info(this.name+"正在打boss");
    }
}
