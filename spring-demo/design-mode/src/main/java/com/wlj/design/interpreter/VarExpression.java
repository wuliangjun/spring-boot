package com.wlj.design.interpreter;

import java.util.HashMap;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description: 终结符类
 * @author: liangjun.wu
 * @since: 2020/5/5 18:09
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
