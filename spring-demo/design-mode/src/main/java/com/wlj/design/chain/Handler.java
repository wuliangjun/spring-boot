package com.wlj.design.chain;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 15:08
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public abstract class Handler {

    //下一个处理者
    private Handler nextHandler;
    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();
    //具体处理的任务
    protected abstract Response doSomething(Request request);

    //每个处理者都必须对请求做出处理
    public final Response handleMessage(Request request){

        Response response = null;
        if(this.getHandlerLevel().getLevel().equals(request.getRequestLevel().getLevel())){
            response = this.doSomething(request);
        }else {
            //不属于自己的处理级别
            //判断是否有下一个处理者
            if(this.nextHandler!=null){
                response = this.nextHandler.handleMessage(request);
            }else {
                //没有适当的处理者，业务自行处理
            }
        }
        return response;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
