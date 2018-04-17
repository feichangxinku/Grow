package com.iris.grow;

import com.iris.grow.evaluator.IModuleEvaluator;
import com.iris.grow.evaluator.ModuleEvaluatorImpl;

public class Example {
    public static void main(String[] args) {
        Item item = new Item();
        item.setModuleType("front");
        IModuleEvaluator moduleEvaluator = new ModuleEvaluatorImpl();
        Score score = moduleEvaluator.getSkill1(item);
        System.out.println(score.getSkill1Score());
    }
}
