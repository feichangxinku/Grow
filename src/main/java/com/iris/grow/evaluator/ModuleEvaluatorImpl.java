package com.iris.grow.evaluator;

import com.iris.grow.Item;
import com.iris.grow.Score;
import com.iris.grow.module.CommonModle;
import com.iris.grow.module.FrontProgramer;
import com.iris.grow.module.IModule;

public class ModuleEvaluatorImpl implements IModuleEvaluator{
    @Override
    public Score getSkill1(Item item) {
        IModule module;
        switch (item.getModuleType()) {
            case "front":
                module = new FrontProgramer(item);
                break;
            default:
                module = new CommonModle(item);
        }
        Score score = new Score();
        score.setSkill1Score(module.getKill1());
        return score;
    }

    @Override
    public Score getSkill2(Item item) {
        IModule module;
        switch (item.getModuleType()) {
            case "front":
                module = new FrontProgramer(item);
                break;
            default:
                module = new CommonModle(item);
        }
        Score score = new Score();
        score.setSkill1Score(module.getKill2());
        return score;
    }

    @Override
    public Score getSkill3(Item item) {
        IModule module;
        switch (item.getModuleType()) {
            case "front":
                module = new FrontProgramer(item);
                break;
            default:
                module = new CommonModle(item);
        }
        Score score = new Score();
        score.setSkill1Score(module.getKill2());
        return score;
    }
}
