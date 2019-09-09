public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        Quackable gooseDuck = new GooseAdapter(new Goose());

        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        Quackable testEcho = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable testEcho2 = new QuackCounter(new QuackEcho(new MallardDuck()));

        System.out.println("\nDuck Simulator: With Goose Adapter");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

        System.out.println("\nECHO");
        simulate(testEcho);
        simulate(testEcho2);
    }




    void simulate(Quackable duck) {
        duck.quack();
    }
}