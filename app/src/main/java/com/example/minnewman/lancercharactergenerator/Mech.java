package com.example.minnewman.lancercharactergenerator;

/**
 * Created by knotm on 12/30/2017.
 */

public class Mech {
    String Name;
    String Brand;
    String Model;
    Integer Hull;
    Integer Agility;
    Integer Systems;
    Integer Engineering;
    double Size;
    Integer Storage;
    Integer EP;
    Integer IP;
    Integer HP;
    Integer RepairRate;
    Integer RepairCap;
    Integer Heat;
    Integer Aim;
    Integer Armor;
    Integer Melee;
    Integer Evasion;
    Integer Speed;
    Integer Invasion;
    Integer Scan;
    Integer EDefense;
    Integer LockOn;
    Integer SensorRange;
    Integer CoolingRate;
    Integer HPMod = 0;
    Integer RepairRateMod = 0;
    Integer RepairCapMod = 0;
    Integer HeatMod = 0;
    Integer MeleeMod = 0;
    Integer EvasionMod = 0;
    Integer SpeedMod = 0;
    Integer InvasionMod = 0;
    Integer ScanMod = 0;
    Integer EDefenseMod = 0;
    Integer LockOnMod = 0;
    Integer SensorRangeMod = 0;
    Integer CoolingRateMod = 0;


    public Mech(String brand, String model, Integer hull, Integer agility, Integer systems, Integer engineering, double size, Integer storage, Integer EP, Integer IP) {
        Brand = brand;
        Model = model;
        Hull = hull;
        Agility = agility;
        Systems = systems;
        Engineering = engineering;
        Size = size;
        Storage = storage;
        this.EP = EP;
        this.IP = IP;
        this.HP = hull;
        this.Evasion = agility;
        this.Melee = (hull-10);
        this.Speed = (int)(Math.ceil(agility/2));
        this.EDefense = systems;
        this.SensorRange = systems;
        this.Invasion = systems-10;
        this.Scan = systems -10;
        this.LockOn = systems - 10;
        this.Heat = engineering;
        this.CoolingRate = (int)(Math.ceil(engineering/2));
        this.RepairCap = (int)(Math.ceil(engineering/2));
        this.RepairRate = (int)(Math.ceil(engineering/4));
    }

    public void modStats(Integer HPMod, Integer repairRateMod, Integer repairCapMod, Integer heatMod, Integer meleeMod, Integer evasionMod, Integer speedMod, Integer invasionMod, Integer scanMod, Integer EDefenseMod, Integer lockOnMod, Integer sensorRangeMod, Integer coolingRateMod) {
        this.HPMod = HPMod;
        this.RepairRateMod = repairRateMod;
        this.RepairCapMod = repairCapMod;
        this.HeatMod = heatMod;
        this.MeleeMod = meleeMod;
        this.EvasionMod = evasionMod;
        this.SpeedMod = speedMod;
        this.InvasionMod = invasionMod;
        this.ScanMod = scanMod;
        this.EDefenseMod = EDefenseMod;
        this.LockOnMod = lockOnMod;
        this.SensorRangeMod = sensorRangeMod;
        this.CoolingRateMod = coolingRateMod;
    }
}
