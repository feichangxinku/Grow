package main.scala.spark;

/**
 * 别人调用你的服务
 */
public class BieRendechengxu {
    public static void main(String[] args) {
        Request request = new Request();
        request.setModuleType("front");
        IModuleEvaluator moduleEvaluator = new ModuleEvaluatorImpl();
        Response response = moduleEvaluator.getSkill1(request);
        System.out.println(response.getSkill1Score());
    }
}
