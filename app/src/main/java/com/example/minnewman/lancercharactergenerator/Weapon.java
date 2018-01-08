package com.example.minnewman.lancercharactergenerator;

/**
 * Created by knotm on 1/8/2018.
 */

public class Weapon {
    String Name;
    String License;
    Integer Level;
    String Size;
    String Type;
    String Range;
    String Damage_1;
    String Damage_Type_1;
    String Damage_2;
    String Damage_Type_2;
    String Tags;
    Integer EP;
    Integer IP;



    public Weapon(String license, Integer level, String name, String size, String type, String range, String damage_1, String damage_Type_1, String damage_2, String damage_Type_2, String tags, Integer EP, Integer IP) {
        Name = name;
        License = license;
        Level = level;
        Size = size;
        Type = type;
        Range = range;
        Damage_1 = damage_1;
        Damage_Type_1 = damage_Type_1;
        Damage_2 = damage_2;
        Damage_Type_2 = damage_Type_2;
        Tags = tags;
        this.EP = EP;
        this.IP = IP;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String license) {
        License = license;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    public String getDamage_1() {
        return Damage_1;
    }

    public void setDamage_1(String damage_1) {
        Damage_1 = damage_1;
    }

    public String getDamage_Type_1() {
        return Damage_Type_1;
    }

    public void setDamage_Type_1(String damage_Type_1) {
        Damage_Type_1 = damage_Type_1;
    }

    public String getDamage_2() {
        return Damage_2;
    }

    public void setDamage_2(String damage_2) {
        Damage_2 = damage_2;
    }

    public String getDamage_Type_2() {
        return Damage_Type_2;
    }

    public void setDamage_Type_2(String damage_Type_2) {
        Damage_Type_2 = damage_Type_2;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public Integer getEP() {
        return EP;
    }

    public void setEP(Integer EP) {
        this.EP = EP;
    }

    public Integer getIP() {
        return IP;
    }

    public void setIP(Integer IP) {
        this.IP = IP;
    }
}
