package main.scala.spark;

import main.scala.spark.Module.CommonModle;
import main.scala.spark.Module.FrontProgramer;
import main.scala.spark.Module.IModule;

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
