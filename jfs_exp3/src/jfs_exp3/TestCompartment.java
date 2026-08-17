package jfs_exp3;
import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

// First Class compartment
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "You are travelling in First Class. Enjoy your journey!";
    }
}

// Ladies compartment
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "You are travelling in the Ladies compartment.";
    }
}

// General compartment
class General extends Compartment {

    @Override
    public String notice() {
        return "You are travelling in the General compartment.";
    }
}

// Luggage compartment
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "You are travelling in the Luggage compartment.";
    }
}

public class TestCompartment {

    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int choice = random.nextInt(4) + 1;
            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
            System.out.println(compartments[i].notice());
        }
    }
}
