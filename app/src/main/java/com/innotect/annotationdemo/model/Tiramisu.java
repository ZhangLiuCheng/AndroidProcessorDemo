package com.innotect.annotationdemo.model;

import com.innotech.api.Factory;

/**
 * Created by sunyuqin on 16/8/26.
 */

@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {
    @Override
    public float getPrice() {
        return 4.5f;
    }
}
