package com.wlj.design.interpreter;

import java.util.HashMap;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 18:07
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public abstract class Expression {
    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
