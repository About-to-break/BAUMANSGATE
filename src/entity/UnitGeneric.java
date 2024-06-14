package entity;


public abstract class UnitGeneric {
    protected String type;
    protected int price;
    protected int healthPoints;
    protected int armorPoints;
    protected int staminaPoints;
    protected int damage;
    protected int attackRange;
    protected String bio;
    protected boolean isNPC;
    protected boolean isAlive;
    protected String designation;

    public UnitGeneric(String designation) {
        this.designation = designation;
    }

    void spawn() {};
    void despawn() {};
    void attack() {};
    void move() {};
    void viewStats() {};
    void viewBio() {};
    void viewDesignation() {
        System.out.println("Designation: " + designation);
    };
}

abstract class Melee extends UnitGeneric {
    public Melee(String designation) {
        super(designation);
        this.type = "Melee";
        this.attackRange = 1;
    }
}

abstract class Archery extends UnitGeneric {
    public Archery(String designation) {
        super(designation);
        this.type = "Archery";
    }
}

abstract class Cavalry extends UnitGeneric {
    public Cavalry(String designation) {
        super(designation);
        this.type = "Cavalry";
    }
}

class Swordsman extends Melee {
    public Swordsman(String designation) {
        super(designation);
        this.healthPoints = 50;
        this.damage = 5;
        this.attackRange = 1;
        this.armorPoints = 8;
        this.staminaPoints = 3;
        this.price = 10;
        this.bio = "A Swordsman, clad in heavy armor and wielding a mighty blade. He is a steadfast guardian, standing firm against the tides of darkness.";
    }
}

class Spearman extends Melee {
    public Spearman(String designation) {
        super(designation);
        this.healthPoints = 35;
        this.damage = 3;
        this.attackRange = 1;
        this.armorPoints = 4;
        this.staminaPoints = 6;
        this.price = 15;
        this.bio = "A Spearman, agile and precise with his strikes. He dances across the battlefield, striking down foes with his spear.";
    }
}

class Axeman extends Melee {
    public Axeman(String designation) {
        super(designation);
        this.healthPoints = 45;
        this.damage = 9;
        this.attackRange = 1;
        this.armorPoints = 3;
        this.staminaPoints = 4;
        this.price = 20;
        this.bio = "An Axeman, wielding a massive axe with deadly precision. He cleaves through enemies with unmatched ferocity.";
    }
}

class Sharpshooter extends Archery {
    Sharpshooter(String designation) {
        super(designation);
        this.healthPoints = 30;
        this.damage = 6;
        this.attackRange = 5;
        this.armorPoints = 8;
        this.staminaPoints = 2;
        this.price = 15;
        this.bio = "A Sharpshooter, a master of the bow from afar. With keen eyes and steady hands, he strikes down his enemies with deadly accuracy.";
    }
}

class Scout extends Archery {
    Scout(String designation) {
        super(designation);
        this.healthPoints = 25;
        this.damage = 3;
        this.attackRange = 3;
        this.armorPoints = 4;
        this.staminaPoints = 4;
        this.price = 19;
        this.bio = "A Scout, swift and agile, moving unseen through the shadows. With his trusty bow, he deals death from a distance.";
    }
}

class Crossbowman extends Archery {
    Crossbowman(String designation) {
        super(designation);
        this.healthPoints = 40;
        this.damage = 7;
        this.attackRange = 6;
        this.armorPoints = 3;
        this.staminaPoints = 2;
        this.price = 23;
        this.bio = "A Crossbowman, wielding a powerful crossbow with deadly force. He pierces through armor and flesh alike with his deadly bolts.";
    }
}

class Knight extends Cavalry {
    Knight(String designation) {
        super(designation);
        this.healthPoints = 30;
        this.damage = 5;
        this.attackRange = 1;
        this.armorPoints = 3;
        this.staminaPoints = 6;
        this.price = 20;
        this.bio = "A Knight, a noble warrior mounted upon a mighty steed. Clad in armor, he charges into battle, his lance ready to skewer his foes.";
    }
}

class Hussar extends Cavalry {
    Hussar(String designation) {
        super(designation);
        this.healthPoints = 50;
        this.damage = 2;
        this.attackRange = 1;
        this.armorPoints = 7;
        this.staminaPoints = 5;
        this.price = 23;
        this.bio = "A Hussar, a swift and daring horseman. With his trusty sabre, he dances around his enemies, delivering swift strikes with deadly precision.";
    }
}

class HorseArcher extends Cavalry {
    HorseArcher(String designation) {
        super(designation);
        this.healthPoints = 25;
        this.damage = 3;
        this.attackRange = 3;
        this.armorPoints = 2;
        this.staminaPoints = 5;
        this.price = 25;
        this.bio = "A Horse Archer, a master of ranged combat from horseback. With speed and agility, he rains arrows down upon his foes, striking from unexpected angles.";
    }
}

