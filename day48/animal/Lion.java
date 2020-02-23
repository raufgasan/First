package day48.animal;

public class Lion extends Mammals{
    @Override
    public void drinkMilk() {
        System.out.println("Lion drink Milk");

    }

    @Override
    public void makeNoise() {
        System.out.println("Lion say roooooooo");
    }

    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        Animal a1 = new Lion();
        a1.makeNoise();
    }
}


