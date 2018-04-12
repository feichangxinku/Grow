package com.iris.grow.module;

public class FrontProgramer implements IModule {
    //不同的子项
    private String skill1;
    private String specialSkill;

    @Override
    public String getKill1() {
        return skill1 + specialSkill;
    }
}
