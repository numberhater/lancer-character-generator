package com.example.minnewman.lancercharactergenerator;

/**
 * Created by knotm on 1/8/2018.
 */

public class Background {
    String name;
    String field1;
    String field2;
    String field3;

    public Background(String name, String field1, String field2, String field3) {
        this.name = name;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }


}
