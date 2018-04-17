package com.iris.grow.module;

import com.iris.grow.Item;

public class FrontProgramer implements IModule {
    private Item item;
    public FrontProgramer(Item item) {
        this.item = item;
    }

    @Override
    public String getKill1() {
        return item.getItem1()  + item.getItem2();
    }

    @Override
    public String getKill2() {
        return item.getItem1()  + '|' +  item.getItem2();
    }

    @Override
    public Long getKill3() {
        return Long.parseLong(item.getItem1())  * Long.parseLong(item.getItem2());
    }
}
