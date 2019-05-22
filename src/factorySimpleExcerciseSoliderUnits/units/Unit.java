package factorySimpleExcerciseSoliderUnits.units;

public abstract class Unit {

    private int livePoints;
    private int experience;
    private int dmgDone;

    Unit(int livePoints, int experience, int dmgDone) {
        this.livePoints = livePoints;
        this.experience = experience;
        this.dmgDone = dmgDone;
    }

    public int getLivePoints() {
        return livePoints;
    }

    public int getExperience() {
        return experience;
    }

    public int getDmgDone() {
        return dmgDone;
    }
}
