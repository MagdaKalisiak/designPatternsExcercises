package strategyExcerciseDucks;

public class FlyStrategy implements BehaviourStrategy{
    @Override
    public void act() {
        System.out.println("I am flying");
    }
}
