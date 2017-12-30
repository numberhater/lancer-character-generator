package com.example.minnewman.lancercharactergenerator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase mydatabase = openOrCreateDatabase("background.db", Context.MODE_PRIVATE, null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS background(name VARCHAR, field1 VARCHAR, field2 VARCHAR, field3 VARCHAR ); ");
        mydatabase.execSQL("INSERT INTO background values ('AI Specialist', 'Artificial Intellegence', 'Research', 'Electronics (repair, invention, maintenance)');");
        mydatabase.execSQL("INSERT INTO background values ('Assassin', 'Infiltration (stealth, marksmanship, demolition)', 'Weapons (military, exotic, concealed, melee)', 'Martial Arts');");
        mydatabase.execSQL("INSERT INTO background values ('Bodyguard', 'Weapons (melee, concealed, non-lethal, civilian)', 'Intimidation', 'Perception');");
        mydatabase.execSQL("INSERT INTO background values ('Celebrity', 'Pop Culture', 'Etiquette (cultural, class)', 'Persuasion (charisma, reputation)');");
        mydatabase.execSQL("INSERT INTO background values ('Criminal', 'Criminal (forgery, deception, disguise)', 'Survival (urban)', 'Intimidation');");
        mydatabase.execSQL("INSERT INTO background values ('Colonist', 'Mechanics (terrestrial)', 'Survival (terrestrial, frontier)', 'Weapons (civilian, hunting)');");
        mydatabase.execSQL("INSERT INTO background values ('Detective', 'Infiltration (stealth, disguise)', 'Weapons (civilian, concealed, non-lethal)', 'Perception');");
        mydatabase.execSQL("INSERT INTO background values ('Doctor', 'Biology', 'Medicine', 'Persuasion (diplomacy, professional)');");
        mydatabase.execSQL("INSERT INTO background values ('Star Drive Technician', 'Starships (Drives, Reactors, Maintenance)', 'Physics', 'Electronics (repair, improvisition)');");
        mydatabase.execSQL("INSERT INTO background values ('Farmer', 'Biology', 'Medicine (animal, plant, holistic)', 'Mechanics (space, terrestrial)');");
        mydatabase.execSQL("INSERT INTO background values ('Spacer', 'Mechanics (space)', 'Survival (Space, asteroid, habitats)', 'Etiquette (Habitats)');");
        mydatabase.execSQL("INSERT INTO background values ('Hacker', 'Hacking', 'Research', 'Criminal (forgery, deception)');");
        mydatabase.execSQL("INSERT INTO background values ('Marine', 'Weapons (military, close quarters)', 'Survival (space, terrestrial, frontier)', 'Starships (maintenance, weapons)');");
        mydatabase.execSQL("INSERT INTO background values ('Mechanic', 'Mechanics (starship, space, terrestrial)', 'Electronics (Invention, Improvisation)', 'Information Systems');");
        mydatabase.execSQL("INSERT INTO background values ('Mercenary', 'Martial Arts', 'Intimidation', 'Weapons (military, melee, personalized, concealed)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Mercenary','Martial Arts','Intimidation','Weapons (military, melee, personalized, concealed)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Miner','Mechanics (space)','Demolition','Survival (space, asteroid, habitats)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Noble','Etiquette (class, cultural, political)','History','Persuasion (privilege, charisma, diplomacy, reputation)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Officer','Weapons (military)','Etiquette (military, cultural)','Persuasion (charisma, reputation, rank)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Outlander','Xenobiology','Weapons (military, exotic)','Survival (frontier, space)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Penal Colonist','Athletics','Survival (space, terrestrial, frontier, urban)','Intimidation');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Pirate','Intimidation','Starships (piloting, weapons, maintenance)','Weapons (military, melee, archaic, personalized)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Politician','Etiquette (political, cultural)','Persuasion (charisma, reputation, diplomacy, ideological)','History');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Priest','History (religion)','Persuasion (charisma, religious)','Survival (space, terrestrial, frontier)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Rebel','Infiltration (stealth, demolitions, disguise, marksmanship)','Persuasion (ideological)','Weapons (military, concealed)');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Security','Weapons (civilian)','Perception','Martial Arts');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Scientist','Biology','Physics','Engineering');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Smuggler','Starships (piloting, maintenance)','Criminal (forgery, deception)','Perception');");
        mydatabase.execSQL("INSERT INTO background VALUES ('Soldier','Weapons (military, heavy, melee)','Athletics','Martial Arts');\n" +
                "        INSERT INTO background VALUES ('Spy','Infiltration (deception, disguise, forgery, stealth)','Persuasion (charisma)','Hacking');\n" +
                "        INSERT INTO background VALUES ('Spec Ops','Infiltration (demolition, stealth)','Survival (terrestrial, space, frontier, urban)','Weapons (military, melee, close quarters, heavy)');\n" +
                "        INSERT INTO background VALUES ('Super Soldier','Martial Arts (extraordinary)','Athletics (extraordinary)','Perception (extraordinary)');\n" +
                "        INSERT INTO background VALUES ('Survey Corps','Survival (terrestrial, frontier)','Biology','Xenobiology');\n" +
                "        INSERT INTO background VALUES ('Starship Pilot','Starships (Piloting, weapons, maintenance)','Survival (space)','Electronics');");
       mydatabase.execSQL("CREATE TABLE IF NOT EXISTS talents(name VARCHAR, Rank_1 VARCHAR,Rank_2 VARCHAR,Rank_3 VARCHAR);");
       mydatabase.execSQL("INSERT INTO talents(name,Rank_1,Rank_2,Rank_3) VALUES ('Ace','Strafing Run','Acrobatics','Supersonic');\n"+
                "INSERT INTO talents VALUES ('Bonded','I''ll Be Your Huckleberry','Still Only Counts as One','Cover Me!');\n" +
                "INSERT INTO talents VALUES ('Brawler','Hold and Lock','Suplex','Sledgehammer');\n" +
                "INSERT INTO talents VALUES ('Crack Shot','Accurate and Precise','Stable, Steady','Watch This');\n" +
                "INSERT INTO talents VALUES ('Combined Arms','CQC Training','Lightning Reflexes','Storm of Violence');\n" +
                "INSERT INTO talents VALUES ('Duelist','Man-At-Arms','Blademaster','Flurry');\n" +
                "INSERT INTO talents VALUES ('Drone Commander','Hivemaster','Memories of Egregoria','Martyr Host');\n" +
                "INSERT INTO talents VALUES ('Executioner','Backswing Cut','Wide Arc Cleave','No Escape');\n" +
                "INSERT INTO talents VALUES ('Gunslinger','Truth and Justice','From The Hip','I Kill With My Heart');\n" +
                "INSERT INTO talents VALUES ('Grease Monkey','Machine Bond','Hidden Stash','Favors From Above');\n" +
                "INSERT INTO talents VALUES ('Hacker','Snow_Crash','MINOTAUR Protocol','Safe_Cracker');\n" +
                "INSERT INTO talents VALUES ('Infiltrator','Defilade Navigator','Dummy Switch','Steel Assassin');\n" +
                "INSERT INTO talents VALUES ('Lancer','Momentum','Afterburner Charge','Unstoppable Force');\n" +
                "INSERT INTO talents VALUES ('Leader','Field Commander','Open Channels','Inspiring Presence');\n" +
                "INSERT INTO talents VALUES ('Martial Artist','Claws Out','Arterial Cut','Hands Free');\n" +
                "INSERT INTO talents VALUES ('Nuclear Cavalier','Aggressive Heat Dispersion','Fusion Pulse','Here, Catch!');\n" +
                "INSERT INTO talents VALUES ('Siege Specialist','Shaped Charges','Select Fire Gunner','Self-Propelled Apocalypse');\n" +
                "INSERT INTO talents VALUES ('Scrapper','Scrounge','Unsanctioned Weight Reduction','Jury Rig');\n" +
                "INSERT INTO talents VALUES ('Skirmisher','Open Sight Targeting','Integrated Chaff Launchers','Lockbreaker');\n" +
                "INSERT INTO talents VALUES ('Tactician','Reach Out and Touch Someone','Fire From The Sun','Corrective Fire');\n" +
                "INSERT INTO talents VALUES ('Technophile','Servant Fragment','Assume Direct Control','Friend Of My Friend');\n" +
                "INSERT INTO talents VALUES ('Uncanny Reflexes','Shrug It Off','Heads Up!','FUBAR/ALL CLEAR');\n" +
                "INSERT INTO talents VALUES ('Veteran','Not Dead Yet','True Grit','Unshakeable');\n" +
                "INSERT INTO talents VALUES ('Vanguard','Handshake Etiquette','See-Through Seeker','BREACH And Clear');");

        //mydatabase.execSQL("DROP TABLE mechs;");
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS mechs(Brand VARCHAR, Mech VARCHAR, Hull INTEGER, Agility INTEGER, Systems INTEGER, Engineering  INTEGER, Size NUMERIC, Storage INTEGER, EP INTEGER, IP INTEGER, HP INTEGER, Repair_Rate  INTEGER, Repair_Cap INTEGER, Heat INTEGER, Aim  BIT, Armor BIT, Melee INTEGER, Evasion INTEGER, Speed INTEGER,Invasion INTEGER, Scan INTEGER, EDefense INTEGER, Lock_On INTEGER, Sensor_Range INTEGER, Cooling_Rate INTEGER);");
        mydatabase.execSQL("INSERT INTO Mechs VALUES (NULL,'Hard Suit',8,15,8,8,.5,0,0,0,8,2,4,8,1,0,-2,15,8,-2,-2,8,-2,8,4);\n" +
                "INSERT INTO Mechs VALUES ('GMS','Everest',10,10,10,10,1,3,8,5,10,3,5,10,0,0,0,10,5,0,0,10,0,10,5);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','Drake',12,10,10,10,2,3,10,7,12,3,5,10,0,0,2,10,5,0,0,10,0,10,5);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','Blackbeard',13,12,8,10,2,3,10,7,13,4,5,10,0,0,3,12,6,-2,0,8,-2,8,5);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','Tortuga',13,9,9,11,2,3,10,7,13,4,6,11,0,0,3,9,5,-1,1,9,-1,9,6);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','Nelson',12,12,10,9,1,3,10,7,12,3,5,9,0,0,2,12,6,0,-1,10,0,10,5);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','Lancaster',11,10,10,11,1,3,10,7,11,3,6,11,0,0,1,10,5,0,1,10,0,10,6);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','VLAD',12,10,11,10,1,3,10,7,12,3,5,10,0,0,2,10,5,1,0,11,1,11,5);\n" +
                "INSERT INTO Mechs VALUES ('IPS-N','Raleigh',12,11,10,10,1,3,10,7,12,3,5,10,0,0,2,11,6,0,0,10,0,10,5);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Swallowtail',9,13,11,10,1,3,9,8,9,3,5,10,0,0,-1,13,7,1,0,11,1,11,5);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Monarch',10,12,11,10,1,3,9,8,10,3,5,10,0,0,0,12,6,1,0,11,1,11,5);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Mourning Cloak',11,12,11,10,1,3,9,8,11,3,5,10,0,0,1,12,6,1,0,11,1,11,5);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Death''s Head',9,12,12,10,1,3,9,8,9,3,5,10,0,0,-1,12,6,2,0,12,2,12,5);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Dusk Wing',10,12,10,11,.5,3,9,8,10,3,6,11,0,0,0,12,6,0,1,10,0,10,6);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Metalmark',11,12,10,10,1,3,9,8,11,3,5,10,0,0,1,12,6,0,0,10,0,10,5);\n" +
                "INSERT INTO Mechs VALUES ('SSC','Black Witch',10,12,11,10,1,3,9,8,10,3,5,10,0,0,0,12,6,1,0,11,1,11,5);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Balor',11,10,12,10,1,3,8,9,11,3,5,10,0,0,1,10,5,2,0,12,2,12,5);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Goblin',9,12,13,9,.5,3,7,10,9,3,5,9,0,0,-1,12,6,3,-1,13,3,13,5);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Hydra',11,10,12,10,2,3,8,9,11,3,5,10,0,0,1,10,5,2,0,12,2,12,5);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Medusa',10,10,12,10,1,3,8,9,10,3,5,10,0,0,0,10,5,2,0,12,2,12,5);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Manticore',11,10,12,10,1,3,8,9,11,3,5,10,0,0,1,10,5,2,0,12,2,12,5);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Minotaur',10,10,12,11,1,3,7,10,10,3,6,11,0,0,0,10,5,2,1,12,2,12,6);\n" +
                "INSERT INTO Mechs VALUES ('Horus','Pegasus',9,12,12,10,1,3,8,9,9,3,5,10,0,0,-1,12,6,2,0,12,2,12,5);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Tokugawa',11,10,10,12,2,3,9,8,11,3,6,12,0,0,1,10,5,0,2,10,0,10,6);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Barbarossa',11,9,10,13,3,3,9,8,11,3,7,13,0,0,1,9,5,0,3,10,0,10,7);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Napoleon',10,10,11,12,1,3,9,8,10,3,6,12,0,0,0,10,5,1,2,11,1,11,6);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Sherman',10,11,10,12,1,3,9,8,10,3,6,12,0,0,0,11,6,0,2,10,0,10,6);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Patton',10,10,11,12,2,3,9,8,10,3,6,12,0,0,0,10,5,1,2,11,1,11,6);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Saladin',11,9,11,12,1,3,9,8,11,3,6,12,0,0,1,9,5,1,2,11,1,11,6);\n" +
                "INSERT INTO Mechs VALUES ('Harrison','Genghis',10,10,10,13,2,3,9,8,10,3,7,13,0,0,0,10,5,0,3,10,0,10,7);\n");


        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS weapons(License VARCHAR, Level INTEGER, Name VARCHAR, Size VARCHAR, Type VARCHAR, Range VARCHAR, Damage_1 VARCHAR, Damage_Type_1 VARCHAR, Damage_2 VARCHAR, Damage_Type_2 VARCHAR, Tags VARCHAR, EP INTEGER, IP INTEGER);");
        mydatabase.execSQL("INSERT INTO Weapons VALUES ('Hardsuit',1,'Pilot Weapon','None','Pilot Weapon','5','1d3','Any',NULL,NULL,NULL,0,0);\n" +
                "INSERT INTO Weapons VALUES ('Hardsuit',1,'Pilot Melee','None','Pilot Weapon','Reach','1d6','Any',NULL,NULL,NULL,0,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'20mm Hardpoint Anti-Material Rifle','Heavy','Rifle','30','2d6+2','Kinetic',NULL,NULL,'Loading, Ordnance',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'Howitzer','Heavy','Cannon','20','2d6','Explosive',NULL,NULL,'Indirect, blast 2, Loading, Ordnance',4,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-AR','Main','Rifle','12','1d6','Kinetic',NULL,NULL,NULL,2,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-BR','Main','Rifle','15','2d6','Kinetic',NULL,NULL,'unreliable',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-MG','Heavy','Rifle','15','2d6','Kinetic',NULL,NULL,'inaccurate',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-TL','Main','Rifle','8','1d6e','Energy','1','Heat',NULL,2,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'High-Arc Mortar','Main','Launcher','15','1d6+1','Explosive',NULL,NULL,'Indirect, blast 1, inaccurate',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-P','Auxiliary','CQB','10','1d3','Kinetic',NULL,NULL,NULL,1,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-TP','Auxiliary','CQB','8','1d3','Energy',NULL,NULL,NULL,1,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-RPG','Main','Launcher','15','1d6+1','Explosive',NULL,NULL,'Blast 2, Loading',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-SG','Main','CQB','5','1d6+1','Kinetic',NULL,NULL,NULL,2,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-HB','Heavy','Melee','Reach','2d6','Kinetic',NULL,NULL,NULL,4,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-BLD','Main','Melee','Reach','1d6','Kinetic',NULL,NULL,NULL,2,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'MC-TK','Auxiliary','Melee','Reach','1d3','Kinetic',NULL,NULL,NULL,1,0);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'Pattern-A \"Apple\" High Explosive Grenades','None','None','5','1d6','Explosive',NULL,NULL,'Blast 2, Thrown, Limited (3), Special',0,1);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'\"Pancake\" Anti-Vehicular Mine','None','None','Reach','2d6','Explosive',NULL,NULL,'Blast 1, Limited (5), Plant, Special',0,1);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'Pattern-A Smoke Grenade','None','None','10','0','Any',NULL,NULL,'Blast 3, Limited (3), Thrown, Plant, Special',0,1);\n" +
                "INSERT INTO Weapons VALUES ('Everest',1,'PanOpticon Drone Nexus','Drone','Drone System','Sensor','1d3','Kinetic',NULL,NULL,'End of Round Action, Requires Lock On, Smart',0,2);\n" +
                "INSERT INTO Weapons VALUES ('Drake',1,'Assault Cannon','Heavy','Cannon','15','2d6+1','Kinetic',NULL,NULL,'unreliable',3,1);\n" +
                "INSERT INTO Weapons VALUES ('Drake',1,'\"Barrier\" Assault Shield','Auxiliary','Melee','Reach','1d3','Kinetic',NULL,NULL,'+1 armor',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Drake',3,'Leviathan Heavy Assault Cannon','Heavy','Cannon','15','2d6','Kinetic',NULL,NULL,'1d3 heat (self)',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Drake',3,'Argonaut Shield','Main','Melee','Reach','1d6','Kinetic',NULL,NULL,'+2 armor, plant, Unique, Special',1,0);\n" +
                "INSERT INTO Weapons VALUES ('Blackbeard',1,'Nano-Carbon Sword','Heavy','Melee','Reach + 1','2d6','Kinetic',NULL,NULL,'inaccurate, vulnerable',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Blackbeard',2,'Flechette Launcher','Auxiliary','CQB','Reach','1d3','Kinetic',NULL,NULL,'Blast 1 (self), Special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Blackbeard',3,'Nano-Carbon Axe','Main','Melee','Reach','1d6+3','Kinetic',NULL,NULL,'vulnerable',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Tortuga',1,'Sweeper Automatic Shotgun','Main','CQB','10','2d6 + 2','Kinetic',NULL,NULL,'inaccurate',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Tortuga',1,'Siege Ram','Main','Melee','Reach',NULL,'Kinetic',NULL,NULL,'special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Tortuga',2,'Daisy Cutter','Heavy','CQB','Cone 7','3d6','Kinetic',NULL,NULL,'limited (2), special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Tortuga',3,'Solid Core Hammer','Main','Melee','Reach','2d6 + 2','Kinetic',NULL,NULL,'AP, Loading, special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Nelson',1,'War Pike','Main','Melee','Reach + 1','1d6','Kinetic',NULL,NULL,'Thrown (10)',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Nelson',2,'Fire Pike','Main','Melee','Reach + 1','3d6','Explosive','1d6','Kinetic','Limited (1), Thrown (10), Special',2,1);\n" +
                "INSERT INTO Weapons VALUES ('Nelson',3,'Power Knuckles','Auxiliary','Melee','Reach','1d3 + 1','Explosive',NULL,NULL,'Special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Lancaster',3,'Plasma Cutter','Auxiliary','Melee','Reach','1d3','Energy','1d6','Heat','1d6 heat (self), Unique, AP',1,0);\n" +
                "INSERT INTO Weapons VALUES ('Vlad',1,'Imapler','Main','CQB Launcher','Line 10','1d6','Kinetic',NULL,NULL,'1d3 heat (self), Special',2,1);\n" +
                "INSERT INTO Weapons VALUES ('Vlad',2,'Nailgun','Main','Rifle','12','1d6','Kinetic',NULL,NULL,'ap, special',2,1);\n" +
                "INSERT INTO Weapons VALUES ('Vlad',3,'Combat Drill','Superheavy','Melee','Reach + 1','3d6','Kinetic',NULL,NULL,'unreliable, ap',5,0);\n" +
                "INSERT INTO Weapons VALUES ('Raleigh',1,'Hand Cannon','Auxiliary','CQB','10','1d6 + 1','Kinetic',NULL,NULL,'Loading, Ordnance',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Raleigh',1,'Breaching Charge','None','None','5','2d6E + 1d6H','Energy, Heat',NULL,NULL,'Blast 1, Limited (3),  AP, Thrown, special',0,2);\n" +
                "INSERT INTO Weapons VALUES ('Raleigh',2,'Bolt Thrower','Heavy','Rifle','12','1d6','Kinetic','1d6','Explosive',NULL,4,0);\n" +
                "INSERT INTO Weapons VALUES ('Raleigh',3,'Kinetic Hammer','Heavy','Melee','Reach','2d6','Explosive',NULL,NULL,'special',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Swallowtail',2,'Scout Drone Nexus','Drone','Drone System','2x sensor range','0','Any',NULL,NULL,'Smart, Special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Monarch',1,'Kodandam Missiles','Auxiliary','Launcher','15','1d6+1','Explosive',NULL,NULL,'Limited(5), blast 3',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Monarch',2,'Vijaya Rockets','Auxiliary','Launcher','12','1d3','Explosive',NULL,NULL,NULL,1,0);\n" +
                "INSERT INTO Weapons VALUES ('Monarch',2,'Pinaka Missiles','Heavy','Launcher','25','2d6','Explosive',NULL,NULL,'1d6 heat (self), Blast 2, Unreliable',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Monarch',3,'Gandiva Missiles','Heavy','Launcher','Sensor','2d6','Explosive','1d6','Energy','End of Round Action, Requires Lock On, Special',3,4);\n" +
                "INSERT INTO Weapons VALUES ('Mourning Cloak',2,'Variable Knife','Auxiliary','Melee','Reach','1d3+1','Kinetic',NULL,NULL,'AP, special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Mourning Cloak',3,'Variable Sword','Main','Melee','Reach','1d6+3','Kinetic',NULL,NULL,'AP, special',4,0);\n" +
                "INSERT INTO Weapons VALUES ('Death''s Head',3,'Railgun','Heavy','Rifle','Line 30','2d6','Kinetic',NULL,NULL,'AP, ordnance',4,0);\n" +
                "INSERT INTO Weapons VALUES ('Dusk Wing',2,'Vulture Battle Rifle','Main','Rifle','20','1d6+2','Kinetic',NULL,NULL,'Unreliable',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Metalmark',3,'Rail Rifle','Main','Rifle','Line 15','1d6+1','Kinetic',NULL,NULL,NULL,3,0);\n" +
                "INSERT INTO Weapons VALUES ('Black Witch',1,'Mag Cannon','Main','Cannon','Line 20','1d3e=','Energy','1d6','Heat',NULL,2,0);\n" +
                "INSERT INTO Weapons VALUES ('Black Witch',3,'Mag Field Generator','None','None','5','0','Any',NULL,NULL,'Blast 4, Limited (1), Plant, Special',0,2);\n" +
                "INSERT INTO Weapons VALUES ('Balor',3,'Nanobot Whip','Heavy','Melee','Reach + 2','2d6','Kinetic',NULL,NULL,'special',3,2);\n" +
                "INSERT INTO Weapons VALUES ('Balor',3,'Swarm Drone Nexus','Drone','Drone System','Sensor','1d6','Kinetic',NULL,NULL,'End of Round Action, Requires Lock On, AP, Vulnerable, Smart',1,2);\n" +
                "INSERT INTO Weapons VALUES ('Hdyra',1,'Hunter Killer Drone Nexus','Drone','Drone System','Sensor','1d6','kinetic',NULL,NULL,'End of Round Action, Requires Lock On, Smart',1,2);\n" +
                "INSERT INTO Weapons VALUES ('Hydra',1,'Ghoul Drone Nexus','Drone','Drone System','Sensor','2d6','Explosive',NULL,NULL,'End of Round Action, Requires Lock On, Smart',1,4);\n" +
                "INSERT INTO Weapons VALUES ('Manticore',3,'Arc Projector','Main','Energy CQB','Cone 7','2d6','Heat',NULL,NULL,'1d6 heat (self)',3,1);\n" +
                "INSERT INTO Weapons VALUES ('Manticore',3,'EMP Pusle','Heavy','Energy System','Blast 3 (self)','3d6','Heat',NULL,NULL,'special',2,2);\n" +
                "INSERT INTO Weapons VALUES ('Pegasus',1,'Autogun','Auxiliary','CQB','15','1d3','Kinetic',NULL,NULL,'AP, special',1,1);\n" +
                "INSERT INTO Weapons VALUES ('Pegasus',2,'Smart Gun','Main','Rifle','15','1d6 +1','Kinetic',NULL,NULL,'Focus, Smart',2,3);\n" +
                "INSERT INTO Weapons VALUES ('Tokugawa',2,'Annihilator','Main','Energy CQB','Cone 5','1d6','Energy','1d6','Heat','Ap',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Tokugawa',3,'Torch','Main','Energy Melee','Reach','1d6','Energy','1d6','Heat','Ap',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Barbarossa',3,'Siege Cannon','Superheavy','Cannon','30','2d6','Explosive',NULL,NULL,'Indirect, Blast 3, 2d6 heat (self), Ordnance, Loading',5,0);\n" +
                "INSERT INTO Weapons VALUES ('Napoleon',3,'Displacer','Superheavy','Rifle','15','15','Energy',NULL,NULL,'Blast 2, AP, Loading, 2d6 heat (self), Unique',5,0);\n" +
                "INSERT INTO Weapons VALUES ('Sherman',1,'Laser Rifle','Main','Energy Rifle','15','1d6','Energy','1d6','Heat','1d3 heat (self)',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Sherman',2,'Heavy Laser','Heavy','Energy Cannon','15','2d6','Energy',NULL,NULL,'Focus, 1d6+3 heat (self)',4,0);\n" +
                "INSERT INTO Weapons VALUES ('Sherman',3,'Tachyon Lance','Superheavy','Energy Cannon','30','3d6','Energy','2d6','Heat','Ordnance, Focus',4,2);\n" +
                "INSERT INTO Weapons VALUES ('Patton',1,'Thermite mines','None','None','Reach','2d6x','Explosive','2d6','Heat','Limited(3), Plant',0,1);\n" +
                "INSERT INTO Weapons VALUES ('Patton',11,'Combat Shotgun','Main','CQB','Cone 5','1d6+1','Kinetic',NULL,NULL,'loading',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Patton',2,'Assault Launcher','Auxiliary','Launcher','15','0','Any',NULL,NULL,'Special',1,0);\n" +
                "INSERT INTO Weapons VALUES ('Patton',2,'Thumper','Superheavy','Melee','Reach','1d6','Kinetic',NULL,NULL,'Blast 5, Special',2,0);\n" +
                "INSERT INTO Weapons VALUES ('Patton',3,'Sticky Bomb Launcher','Main','Launcher','15','2d6','Explosive',NULL,NULL,'Blast 1, special',3,0);\n" +
                "INSERT INTO Weapons VALUES ('Ghengis',1,'Flamethrower','Heavy','Energy CQB','Cone 6','1d6','Energy','2d6','Heat',NULL,3,0);\n" +
                "INSERT INTO Weapons VALUES ('Ghengis',3,'Plasma Thrower','Superheavy','Energy CQB','Cone 8','2d6','Energy','3d6','Heat','2d6 heat (self)',4,1);");

        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS mods(License VARCHAR, Level INTEGER, Name VARCHAR, EP INTEGER, IP INTEGER);");
        mydatabase.execSQL("INSERT INTO mods VALUES ('Everest',1,'20mm Hardpoint Anti-Material Rifle',3,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Howitzer',4,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-AR',2,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-BR',3,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-MG',3,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-TL',2,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'High-Arc Mortar',2,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-P',1,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-TP',1,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-RPG',2,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-SG',2,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-HB',4,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-BLD',2,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'MC-TK',1,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Grapplers',1,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Stable Structure',1,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Remove Arms',-3,-3);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Treads',0,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Expanded Storage',0,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Manipulators',1,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Custom Paint Job',1,0);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Pattern-A \"Apple\" High Explosive Grenades',0,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Pattern-A \"Jericho\" Deployable Cover',0,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'\"Pancake\" Anti-Vehicular Mine',0,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Pattern-A Smoke Grenade',0,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Companion/Concierge-Class Dummy Plug',0,2);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Eva Module',0,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Burst'' Jump Jet System',1,1);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'PanOpticon Drone Nexus',0,2);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Shield Type-1',0,2);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Shield Type-2',0,3);\n" +
                "INSERT INTO mods VALUES ('Everest',1,'Modular Ceramo/Ferrous Plated Armor',1,2);\n" +
                "INSERT INTO mods VALUES ('Drake',1,'Assault Cannon',3,1);\n" +
                "INSERT INTO mods VALUES ('Drake',1,'\"BARRIER\" Assault Shield',2,0);\n" +
                "INSERT INTO mods VALUES ('Drake',2,'Aegis Shield Generator',0,2);\n" +
                "INSERT INTO mods VALUES ('Drake',2,'\"BASTION\" Siege Shield',0,2);\n" +
                "INSERT INTO mods VALUES ('Drake',3,'Leviathan Heavy Assault Cannon',3,0);\n" +
                "INSERT INTO mods VALUES ('Drake',3,'Argonaut Shield',1,0);\n" +
                "INSERT INTO mods VALUES ('Blackbeard',1,'Synthetic Muscle Netting',0,1);\n" +
                "INSERT INTO mods VALUES ('Blackbeard',1,'Nano-Carbon Sword',3,0);\n" +
                "INSERT INTO mods VALUES ('Blackbeard',2,'Flechette Launcher',2,0);\n" +
                "INSERT INTO mods VALUES ('Blackbeard',2,'Assault Grapples',2,1);\n" +
                "INSERT INTO mods VALUES ('Blackbeard',2,'KALI class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Blackbeard',2,'Nano-Carbon Axe',3,0);\n" +
                "INSERT INTO mods VALUES ('Tortuga',1,'Sweeper Automatic Shotgun',3,0);\n" +
                "INSERT INTO mods VALUES ('Tortuga',1,'Siege Ram',2,0);\n" +
                "INSERT INTO mods VALUES ('Tortuga',2,'HA Bunker Buster Rounds',0,1);\n" +
                "INSERT INTO mods VALUES ('Tortuga',2,'Daisy Cutter',2,0);\n" +
                "INSERT INTO mods VALUES ('Tortuga',3,'Solid Core Hammer',2,0);\n" +
                "INSERT INTO mods VALUES ('Tortuga',3,'Hyper Dense Armor',0,2);\n" +
                "INSERT INTO mods VALUES ('Nelson',1,'War Pike',2,0);\n" +
                "INSERT INTO mods VALUES ('Nelson',1,'Bulwark',1,0);\n" +
                "INSERT INTO mods VALUES ('Nelson',2,'Fire Pike',2,1);\n" +
                "INSERT INTO mods VALUES ('Nelson',2,'Armor Lock System',0,1);\n" +
                "INSERT INTO mods VALUES ('Nelson',3,'Power Knuckles',2,0);\n" +
                "INSERT INTO mods VALUES ('Nelson',3,'Adaptive Armor',2,1);\n" +
                "INSERT INTO mods VALUES ('Lancaster',1,'Cable Winch System',1,0);\n" +
                "INSERT INTO mods VALUES ('Lancaster',1,'Emergency Cutter',0,1);\n" +
                "INSERT INTO mods VALUES ('Lancaster',2,'Ablative Shielding',1,2);\n" +
                "INSERT INTO mods VALUES ('Lancaster',2,'Repair Drone Nexus',1,1);\n" +
                "INSERT INTO mods VALUES ('Lancaster',3,'Plasma Cutter',1,0);\n" +
                "INSERT INTO mods VALUES ('Lancaster',3,'Network Swarm Nexus',1,1);\n" +
                "INSERT INTO mods VALUES ('Vlad',1,'Snub Impaler',0,1);\n" +
                "INSERT INTO mods VALUES ('Vlad',1,'Imapler',2,1);\n" +
                "INSERT INTO mods VALUES ('Vlad',2,'Nailgun',2,1);\n" +
                "INSERT INTO mods VALUES ('Vlad',2,'Over-Penetration Modificaiton',0,2);\n" +
                "INSERT INTO mods VALUES ('Vlad',3,'Combat Drill',5,0);\n" +
                "INSERT INTO mods VALUES ('Vlad',3,'Shock Armor',1,1);\n" +
                "INSERT INTO mods VALUES ('Raleigh',1,'Hand Cannon',2,0);\n" +
                "INSERT INTO mods VALUES ('Raleigh',1,'Breaching Charge',0,2);\n" +
                "INSERT INTO mods VALUES ('Raleigh',1,'Explosive Weapon Modification',0,1);\n" +
                "INSERT INTO mods VALUES ('Raleigh',2,'Impact Shielding',1,2);\n" +
                "INSERT INTO mods VALUES ('Raleigh',2,'Bolt Thrower',4,0);\n" +
                "INSERT INTO mods VALUES ('Raleigh',3,'UNCLE class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Raleigh',3,'Kinetic Hammer',3,0);\n" +
                "INSERT INTO mods VALUES ('Swallowtail',1,'Adaptive Paint',0,1);\n" +
                "INSERT INTO mods VALUES ('Swallowtail',1,'Signal Booster',0,1);\n" +
                "INSERT INTO mods VALUES ('Swallowtail',2,'Scout Drone Nexus',2,0);\n" +
                "INSERT INTO mods VALUES ('Swallowtail',2,'Low Profile',1,0);\n" +
                "INSERT INTO mods VALUES ('Swallowtail',3,'ATHENA-class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Swallowtail',3,'Cloaking Field',0,3);\n" +
                "INSERT INTO mods VALUES ('Monarch',1,'Climbing Gear',1,1);\n" +
                "INSERT INTO mods VALUES ('Monarch',1,'Kodandam Missiles',2,0);\n" +
                "INSERT INTO mods VALUES ('Monarch',2,'Vijaya Rockets',1,0);\n" +
                "INSERT INTO mods VALUES ('Monarch',2,'Pinaka Missiles',3,0);\n" +
                "INSERT INTO mods VALUES ('Monarch',3,'Gandiva Missiles',3,4);\n" +
                "INSERT INTO mods VALUES ('Monarch',3,'SHIVA class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',1,'Miniaturized Weapon Mod',0,0);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',1,'Tactical Webbing',0,1);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',1,'Fuel Injector',0,1);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',2,'Variable Knife',2,0);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',2,'Agility Mods',0,1);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',3,'SS EX Slipstream Module',0,3);\n" +
                "INSERT INTO mods VALUES ('Mourning Cloak',3,'Variable Sword',4,0);\n" +
                "INSERT INTO mods VALUES ('Death'' Head',1,'Tracer Ammunition',0,1);\n" +
                "INSERT INTO mods VALUES ('Death'' Head',1,'Tracking Drone',0,1);\n" +
                "INSERT INTO mods VALUES ('Death'' Head',2,'Veil Generator',0,2);\n" +
                "INSERT INTO mods VALUES ('Death'' Head',2,'Stabilizer Weapon Mod',0,2);\n" +
                "INSERT INTO mods VALUES ('Death'' Head',3,'Precognitive Trageting Module',0,3);\n" +
                "INSERT INTO mods VALUES ('Death'' Head',3,'Railgun',4,0);\n" +
                "INSERT INTO mods VALUES ('Dusk Wing',1,'Core Siphon',0,1);\n" +
                "INSERT INTO mods VALUES ('Dusk Wing',1,'Overcharge Modification',0,2);\n" +
                "INSERT INTO mods VALUES ('Dusk Wing',2,'SSC Flight System',1,2);\n" +
                "INSERT INTO mods VALUES ('Dusk Wing',2,'Vulture Battle Rifle',2,0);\n" +
                "INSERT INTO mods VALUES ('Dusk Wing',3,'SSC EX Hover Propulsion System',2,4);\n" +
                "INSERT INTO mods VALUES ('Dusk Wing',3,'SSC Advanced Shield',0,3);\n" +
                "INSERT INTO mods VALUES ('Metalmark',1,'Extended Barrel',0,1);\n" +
                "INSERT INTO mods VALUES ('Metalmark',1,'Armor Piercing Ammo',0,1);\n" +
                "INSERT INTO mods VALUES ('Metalmark',2,'Active Camo',0,2);\n" +
                "INSERT INTO mods VALUES ('Metalmark',2,'Mark Ammo',0,1);\n" +
                "INSERT INTO mods VALUES ('Metalmark',3,'Rail Rifle',3,0);\n" +
                "INSERT INTO mods VALUES ('Metalmark',3,'Tactical Cloak',0,3);\n" +
                "INSERT INTO mods VALUES ('Black Witch',1,'ICE-OUT Module',0,1);\n" +
                "INSERT INTO mods VALUES ('Black Witch',1,'Mag Cannon',2,0);\n" +
                "INSERT INTO mods VALUES ('Black Witch',2,'Mag Buckler',2,1);\n" +
                "INSERT INTO mods VALUES ('Black Witch',2,'Mag Shield',1,1);\n" +
                "INSERT INTO mods VALUES ('Black Witch',3,'Mag Field Generator',0,2);\n" +
                "INSERT INTO mods VALUES ('Black Witch',3,'SSC advanced flight system',2,2);\n" +
                "INSERT INTO mods VALUES ('Balor',1,'Scan Swarm',0,1);\n" +
                "INSERT INTO mods VALUES ('Balor',1,'Relay Drone Nexus',0,2);\n" +
                "INSERT INTO mods VALUES ('Balor',2,'Boost Swarm Nexus',1,2);\n" +
                "INSERT INTO mods VALUES ('Balor',2,'Nanite Ammo',0,2);\n" +
                "INSERT INTO mods VALUES ('Balor',3,'Nanobot Whip',3,2);\n" +
                "INSERT INTO mods VALUES ('Balor',3,'Swarm Drone Nexus',1,2);\n" +
                "INSERT INTO mods VALUES ('Goblin',1,'HORUS Invasion Rig',0,1);\n" +
                "INSERT INTO mods VALUES ('Goblin',1,'HR OSRv56 System Upgrade 1',0,1);\n" +
                "INSERT INTO mods VALUES ('Goblin',1,'HORUS Scan 1',0,1);\n" +
                "INSERT INTO mods VALUES ('Goblin',2,'HR OSRv56 System Upgrade 2',0,1);\n" +
                "INSERT INTO mods VALUES ('Goblin',2,'//MONGOOSE v3.4',0,2);\n" +
                "INSERT INTO mods VALUES ('Goblin',2,'HORUS Scan 2',0,3);\n" +
                "INSERT INTO mods VALUES ('Goblin',3,'HR OSRv56 System Upgrade 3',0,2);\n" +
                "INSERT INTO mods VALUES ('Goblin',3,'OSIRIS Class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Hydra',1,'Hunter Killer Drone Nexus',1,2);\n" +
                "INSERT INTO mods VALUES ('Hydra',1,'HR OS-Rv60 Exp Puppet Master 1',0,1);\n" +
                "INSERT INTO mods VALUES ('Hydra',2,'Ghoul Drone Nexus',1,4);\n" +
                "INSERT INTO mods VALUES ('Hydra',2,'Turrent Drone Nexus',1,2);\n" +
                "INSERT INTO mods VALUES ('Hydra',3,'OROCHI Class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Hydra',3,'Assassin Drone Nexus',2,2);\n" +
                "INSERT INTO mods VALUES ('Medusa',1,'Sentinel Drone Nexus',1,2);\n" +
                "INSERT INTO mods VALUES ('Medusa',1,'Point Defense Weapon',1,2);\n" +
                "INSERT INTO mods VALUES ('Medusa',2,'//SCORPION v70.1',0,2);\n" +
                "INSERT INTO mods VALUES ('Medusa',2,'Overwatch Module',0,2);\n" +
                "INSERT INTO mods VALUES ('Medusa',3,'RA Class AI',0,2);\n" +
                "INSERT INTO mods VALUES ('Medusa',3,'BLACK-ICE Module',0,3);\n" +
                "INSERT INTO mods VALUES ('Manticore',1,'EMP Charge',0,2);\n" +
                "INSERT INTO mods VALUES ('Manticore',1,'Haywire Ammo',0,1);\n" +
                "INSERT INTO mods VALUES ('Manticore',2,'HEAT Ammo',0,1);\n" +
                "INSERT INTO mods VALUES ('Manticore',2,'Ram Drive',0,1);\n" +
                "INSERT INTO mods VALUES ('Manticore',3,'Arc Projector',3,1);\n" +
                "INSERT INTO mods VALUES ('Manticore',3,'EMP Pusle',2,2);\n" +
                "INSERT INTO mods VALUES ('Minotaur',1,'MINOTAUR System Kicker',0,1);\n" +
                "INSERT INTO mods VALUES ('Minotaur',1,'MINOTAUR Crusher',0,2);\n" +
                "INSERT INTO mods VALUES ('Minotaur',2,'Emergency Vent',0,2);\n" +
                "INSERT INTO mods VALUES ('Minotaur',2,'MINOTAUR Reactor bootstrap',0,1);\n" +
                "INSERT INTO mods VALUES ('Minotaur',3,'HR OS-Rv?? Exp puppet Masster III',0,2);\n" +
                "INSERT INTO mods VALUES ('Minotaur',3,'Last Argument of Kings',0,1);\n" +
                "INSERT INTO mods VALUES ('Pegasus',1,'Eye of Horus',0,2);\n" +
                "INSERT INTO mods VALUES ('Pegasus',1,'Autogun',1,1);\n" +
                "INSERT INTO mods VALUES ('Pegasus',2,'Smart Gun',2,3);\n" +
                "INSERT INTO mods VALUES ('Pegasus',2,'Aim-Assist Module',2,3);\n" +
                "INSERT INTO mods VALUES ('Pegasus',3,'Smart weapon mod',0,1);\n" +
                "INSERT INTO mods VALUES ('Pegasus',3,'Hunter Lock',0,2);\n" +
                "INSERT INTO mods VALUES ('Tokugawa',1,'External batteries',1,0);\n" +
                "INSERT INTO mods VALUES ('Tokugawa',1,'Experimental heat',0,1);\n" +
                "INSERT INTO mods VALUES ('Tokugawa',2,'Annihilator',3,0);\n" +
                "INSERT INTO mods VALUES ('Tokugawa',2,'Supercharger',0,1);\n" +
                "INSERT INTO mods VALUES ('Tokugawa',3,'Torch',3,0);\n" +
                "INSERT INTO mods VALUES ('Tokugawa',3,'AMATERASU class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Barbarossa',1,'Siege Stabilizers',1,1);\n" +
                "INSERT INTO mods VALUES ('Barbarossa',1,'External Ammo Feed',1,1);\n" +
                "INSERT INTO mods VALUES ('Barbarossa',2,'Auto-Loader',0,2);\n" +
                "INSERT INTO mods VALUES ('Barbarossa',2,'Molded Armor',1,2);\n" +
                "INSERT INTO mods VALUES ('Barbarossa',3,'Siege Cannon',5,0);\n" +
                "INSERT INTO mods VALUES ('Barbarossa',3,'Juggernaut Armor',1,2);\n" +
                "INSERT INTO mods VALUES ('Napoleon',1,'Phasing Ammo',0,1);\n" +
                "INSERT INTO mods VALUES ('Napoleon',1,'Stasis Barrier',0,2);\n" +
                "INSERT INTO mods VALUES ('Napoleon',2,'Stasis Field',0,1);\n" +
                "INSERT INTO mods VALUES ('Napoleon',2,'Dispersal Shield',1,1);\n" +
                "INSERT INTO mods VALUES ('Napoleon',3,'Blackshield',0,4);\n" +
                "INSERT INTO mods VALUES ('Napoleon',3,'Displacer',5,0);\n" +
                "INSERT INTO mods VALUES ('Sherman',1,'Redundant Systems',0,1);\n" +
                "INSERT INTO mods VALUES ('Sherman',1,'Laser Rifle',2,0);\n" +
                "INSERT INTO mods VALUES ('Sherman',2,'Heavy Laser',4,0);\n" +
                "INSERT INTO mods VALUES ('Sherman',2,'Reactor Stabilizer',0,1);\n" +
                "INSERT INTO mods VALUES ('Sherman',3,'ASURA Class AI',0,2);\n" +
                "INSERT INTO mods VALUES ('Sherman',3,'Tachyon Lance',4,2);\n" +
                "INSERT INTO mods VALUES ('Patton',1,'Thermite mines',0,1);\n" +
                "INSERT INTO mods VALUES ('Patton',1,'Combat Shotgun',2,0);\n" +
                "INSERT INTO mods VALUES ('Patton',2,'Assault Launcher',1,0);\n" +
                "INSERT INTO mods VALUES ('Patton',2,'Thumper',2,0);\n" +
                "INSERT INTO mods VALUES ('Patton',3,'Sticky Bomb Launcher',3,0);\n" +
                "INSERT INTO mods VALUES ('Patton',3,'Grounding Charge',0,1);\n" +
                "INSERT INTO mods VALUES ('Saladin',1,'Support Shield',1,3);\n" +
                "INSERT INTO mods VALUES ('Saladin',1,'Emergency Repair System',0,1);\n" +
                "INSERT INTO mods VALUES ('Saladin',2,'Paracausal Ammo',0,1);\n" +
                "INSERT INTO mods VALUES ('Saladin',2,'Hardlight Defense System',0,3);\n" +
                "INSERT INTO mods VALUES ('Saladin',3,'Projected Shield',1,1);\n" +
                "INSERT INTO mods VALUES ('Saladin',3,'Warp Shield',0,3);\n" +
                "INSERT INTO mods VALUES ('Saladin',3,'VISHNU-Class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Genghis',1,'Flamethrower',3,0);\n" +
                "INSERT INTO mods VALUES ('Genghis',1,'Explosive Vent',0,2);\n" +
                "INSERT INTO mods VALUES ('Genghis',2,'Auto-Cooler',0,1);\n" +
                "INSERT INTO mods VALUES ('Genghis',2,'HAVOK Ammunition',0,1);\n" +
                "INSERT INTO mods VALUES ('Genghis',3,'AGNI Class AI',0,3);\n" +
                "INSERT INTO mods VALUES ('Genghis',3,'Plasma Thrower',4,1);");

        Cursor resultSet = mydatabase.rawQuery("Select * from mods", null);
        resultSet.moveToFirst();
        String name = resultSet.getString(0);
        TextView thebox = (TextView) findViewById(R.id.testtext);
        thebox.setText(name.toString());

    }
}
