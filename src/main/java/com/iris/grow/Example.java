package com.iris.grow;

import com.iris.grow.evaluator.IModuleEvaluator;
import com.iris.grow.evaluator.ModuleEvaluatorImpl;

public class Example {
    public static void main(String[] args) {
        Request request = new Request();
        request.setModuleType("front");
        IModuleEvaluator moduleEvaluator = new ModuleEvaluatorImpl();
        Response response = moduleEvaluator.getSkill1(request);
        System.out.println(response.getSkill1Score());
    }
}
