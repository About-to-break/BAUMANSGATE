package world;

public abstract class TerrainTypeGeneric {
    protected float meleeSpeedPenalty;
    protected float archerySpeedPenalty;
    protected float cavalrySpeedPenalty;
    protected String designation;
    protected String icon;
    protected boolean isOccupied;

    public TerrainTypeGeneric() {
        this.exemptByEntity();
    }
    public void occupyByEntity(String icon) {
        this.icon = icon;
        this.isOccupied = true;
    }
    public void exemptByEntity() {
        this.icon = this.designation;
        this.isOccupied = false;
    }

    @Override
    public String toString() {
        return this.icon;
    }
    public float getMeleeSpeedPenalty() {
        return meleeSpeedPenalty;
    }

    public float getArcherySpeedPenalty() {
        return archerySpeedPenalty;
    }

    public float getCavalrySpeedPenalty() {
        return cavalrySpeedPenalty;

    }

    public float getPenalty(String unitType) {
        return switch (unitType) {
            case "Melee" -> meleeSpeedPenalty;
            case "Archery" -> archerySpeedPenalty;
            case "Cavalry" -> cavalrySpeedPenalty;
            default -> 0.0f;
        };
    }

    public String getDesignation() {
        return designation;
    }
}

class Swamp extends TerrainTypeGeneric {
    public Swamp() {
        super();
        this.meleeSpeedPenalty = 1.5f;
        this.archerySpeedPenalty = 1.8f;
        this.cavalrySpeedPenalty = 2.2f;
        this.designation = "🌊";
    }
}

class Hills extends TerrainTypeGeneric {
    public Hills() {
        super();
        this.meleeSpeedPenalty = 2f;
        this.archerySpeedPenalty = 2.2f;
        this.cavalrySpeedPenalty = 1.2f;
        this.designation = "⛰";
    }
}

class Forest extends TerrainTypeGeneric {
    public Forest() {
        super();
        this.meleeSpeedPenalty = 1.2f;
        this.archerySpeedPenalty = 1f;
        this.cavalrySpeedPenalty = 1.5f;
        this.designation = "🌲";
    }
}

class Plains extends TerrainTypeGeneric {
    public Plains() {
        super();
        this.meleeSpeedPenalty = 1f;
        this.archerySpeedPenalty = 1f;
        this.cavalrySpeedPenalty = 1f;
        this.designation = "🌾";
    }
}
