package com.example.minnewman.lancercharactergenerator;

/**
 * Created by knotm on 1/8/2018.
 */

public class Mod {
    String License;
    Integer Level;
    String Name;
    Integer EP;
    Integer IP;

    public Mod(String license, Integer level, String name, Integer EP, Integer IP) {
        License = license;
        Level = level;
        Name = name;
        this.EP = EP;
        this.IP = IP;
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
