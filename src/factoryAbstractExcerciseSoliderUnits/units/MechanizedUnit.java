package factoryAbstractExcerciseSoliderUnits.units;

public abstract class MechanizedUnit {

    private int livePoints;
    private int experience;
    private int dmgDone;
    private String name;

    MechanizedUnit(int livePoints, int experience, int dmgDone,String name) {
        this.livePoints = livePoints;
        this.experience = experience;
        this.dmgDone = dmgDone;
        this.name=name;
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
    @Override
    public String toString() {
        return "MechanizedUnit{" +
                "livePoints=" + livePoints +
                ", experience=" + experience +
                ", dmgDone=" + dmgDone +
                ", name='" + name + '\'' +
                '}';
    }
}
