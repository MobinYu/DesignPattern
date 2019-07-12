package com.yu.gof.actionpattern.strategy;

public class Context {

	//构造函数，你要使用哪种打折模式
    private IDiscountStrategy straegy;
    public Context(IDiscountStrategy strategy){
        this.straegy = strategy;
    }
    
    //根据不同模式不同折扣
    public void operate(){
        this.straegy.discount();
    }  
}
