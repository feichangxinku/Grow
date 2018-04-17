package com.iris.grow.module;

import com.iris.grow.Item;

public class CommonModle implements IModule {
    private Item item;
    public CommonModle(Item item) {
        this.item = item;
    }

    @Override
    public String getKill1() {
        return null;
    }

    @Override
    public String getKill2() {
        return null;
    }

    @Override
    public Long getKill3() {
        return null;
    }
}
