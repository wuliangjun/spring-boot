package com.wlj.design.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 22:44
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class StaticGamePlayerProxy implements IGamePlayer{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private IGamePlayer gamePlayer = null;

    public StaticGamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    public void playGame() {
        logger.info("正在代理打游戏");
        this.gamePlayer.playGame();
        logger.info("代理打游戏结束");
    }

    public void playBoss() {
        logger.info("正在代理打boss");
        this.gamePlayer.playBoss();
        logger.info("代理打boss结束");
    }
}
