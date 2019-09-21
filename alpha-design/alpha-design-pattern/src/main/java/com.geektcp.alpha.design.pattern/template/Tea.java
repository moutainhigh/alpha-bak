package com.geektcp.alpha.design.pattern.template;

/**
 * Created by TangHaiyang on 2019/9/21.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
