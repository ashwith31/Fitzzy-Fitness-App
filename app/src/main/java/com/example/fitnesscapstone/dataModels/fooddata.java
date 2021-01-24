package com.example.fitnesscapstone.dataModels;

public class fooddata {

    String food;
    int calories;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public fooddata(String food, int calories) {
        this.food = food;
        this.calories = calories;
    }

    public fooddata() {
    }
}
