package com.iris.grow.evaluator;

import com.iris.grow.Item;
import com.iris.grow.Score;

public interface IModuleEvaluator {
    Score getSkill1(Item item);
    Score getSkill2(Item item);
    Score getSkill3(Item item);
}
