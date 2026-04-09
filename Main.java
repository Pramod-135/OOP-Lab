class Calculator {

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    protected void display() {
        System.out.println("This is Calculator class");
    }

    private void show() {
        System.out.println("Private show() method in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}


class AdvancedCalculator extends Calculator {

    @Override
    public void add(int a, int b) {
        System.out.println("Advanced Addition: " + (a + b + 10));
    }

    @Override
    protected void display() {
        System.out.println("This is Advanced Calculator class");
    }

    public void show() {
        System.out.println("show() in AdvancedCalculator");
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.add(5, 3);
        c.display();
        c.accessPrivate();

        System.out.println();

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add(5, 3);
        ac.display();
        ac.show();

        System.out.println();

        Calculator ref = new AdvancedCalculator();
        ref.add(5, 3);
        ref.display();
        ref.accessPrivate();
    }
}