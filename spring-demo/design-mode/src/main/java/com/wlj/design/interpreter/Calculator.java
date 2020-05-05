package com.wlj.design.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 18:14
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expStr){
        //定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分为字符数组
        char[] chars = expStr.toCharArray();
        //运算
        Expression left = null;
        Expression right = null;
        for(int i=0;i<chars.length;i++){
            switch (chars[i]){
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));

            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
