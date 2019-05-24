package strategyExcerciseDucks;

public class Duck {
    private BehaviourStrategy behaviourStrategy;

    public Duck(BehaviourStrategy behaviourStrategy) {
        this.behaviourStrategy = behaviourStrategy;
    }

    public void executeBehaviour() {
        behaviourStrategy.act();
    }
}
