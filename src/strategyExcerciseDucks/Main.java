package strategyExcerciseDucks;

public class Main {
    public static void main(String[] args) {
        Duck duck= new Duck(new FlyStrategy());
        duck.executeBehaviour();

    }
}
