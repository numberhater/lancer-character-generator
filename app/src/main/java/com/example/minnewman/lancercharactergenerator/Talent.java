package com.example.minnewman.lancercharactergenerator;

/**
 * Created by knotm on 1/8/2018.
 */

public class Talent {
    String name;
    String rank1;
    String rank2;
    String rank3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank1() {
        return rank1;
    }

    public void setRank1(String rank1) {
        this.rank1 = rank1;
    }

    public String getRank2() {
        return rank2;
    }

    public void setRank2(String rank2) {
        this.rank2 = rank2;
    }

    public String getRank3() {
        return rank3;
    }

    public void setRank3(String rank3) {
        this.rank3 = rank3;
    }

    public Talent(String name, String rank1, String rank2, String rank3) {
        this.name = name;
        this.rank1 = rank1;
        this.rank2 = rank2;
        this.rank3 = rank3;
    }
}
