package com.innotect.annotationdemo.model;

import com.innotech.api.Factory;

/**
 * Created by sunyuqin on 16/8/26.
 */

@Factory(
        id = "Margherita",
        type = Meal.class
)
public class MargheritaPizza implements Meal {

    @Override
    public float getPrice() {
        return 6.0f;
    }
}
