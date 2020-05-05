package com.wlj.design.interpreter.app;

import com.wlj.design.interpreter.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 18:22
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为："+expStr+"="+calculator.run(var));
    }

    public static String getExpStr() throws IOException{
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer> map = new HashMap<>();
        for(char ch:expStr.toCharArray()){
            if(ch!='+'&&ch!='-'){
                //解决重复参数的问题
                if(!map.containsKey(String.valueOf(ch))){
                    String in = (new BufferedReader(new InputStreamReader(System.in)).readLine());
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
