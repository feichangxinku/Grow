package com.iris.grow.evaluator;

import com.iris.grow.Request;
import com.iris.grow.Response;
import com.iris.grow.module.CommonModle;
import com.iris.grow.module.FrontProgramer;
import com.iris.grow.module.IModule;

public class ModuleEvaluatorImpl implements IModuleEvaluator{
    @Override
    public Response getSkill1(Request request) {
        IModule module;
        switch (request.getModuleType()) {
            case "front":
                module = new FrontProgramer();
                break;
            default:
                module = new CommonModle();
        }
        Response response = new Response();
        response.setSkill1Score(module.getKill1());
        return response;
    }
}
