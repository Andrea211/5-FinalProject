package com.udacity.gradle.builditbigger.backend;
import com.example.jokeslib.MyJokesClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new MyJokesClass().getJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}