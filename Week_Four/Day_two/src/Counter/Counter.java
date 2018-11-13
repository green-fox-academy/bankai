package Counter;

public class Counter {
    int counter;
    int reset;

    @Override
    public String toString() {
        return "Counter{" +
                "counter = " + counter +
                ", reset = " + reset +
                '}';
    }

    public Counter() {
        counter = 0;
        reset = 0;
    }

    public Counter(int number) {
        counter = number;
        reset = number;
    }

    public void add() {counter++;}

    public void  add(int number) {counter += number;}

    public int get() {return counter;}

    public void reset() {counter = reset;}

    public static void main(String[] args) {
        Counter abacus = new Counter(85960);
        Counter calculator = new Counter(899964);

        abacus.add();
        System.out.println(abacus);
        calculator.add();
        System.out.println(calculator);
        abacus.get();
        System.out.println(abacus);
        calculator.get();
        System.out.println(calculator);
        abacus.reset();
        System.out.println(abacus);
        calculator.reset();
        System.out.println(calculator);
    }
}
