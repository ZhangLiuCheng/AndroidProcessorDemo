package com.innotect.annotationdemo.model;

import com.innotech.api.Factory;

/**
 * Created by sunyuqin on 16/8/26.
 */

@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {

    @Override public float getPrice() {
        return 8.5f;
    }
}
