public class CountingAbstractFactory extends DuckAbstractFactory {

    public void quack() {
    }

    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() { return new QuackCounter(new DuckCall()); }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }


}
