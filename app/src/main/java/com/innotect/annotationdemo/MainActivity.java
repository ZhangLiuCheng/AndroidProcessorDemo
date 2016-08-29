package com.innotect.annotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.innotect.annotationdemo.model.Meal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import com.innotect.annotationdemo.model.MealFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
//        MealFactory meal = MealFactory.create("Calzone");
//        System.out.println("price  " + meal.getPrice());

        try {
            Class<?> clazz = Class.forName("com.innotect.annotationdemo.model.MealFactory");
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("create", String.class);
            method.setAccessible(true);
            Meal result = (Meal) method.invoke(obj, "Calzone");
            Toast.makeText(this, "result = " + result.getPrice(), Toast.LENGTH_SHORT).show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
