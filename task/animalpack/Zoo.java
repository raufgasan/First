package task.animalpack;

public class Zoo {
    public static void main(String[] args) {

        Tiger t1 = new Tiger();
        Tiger[] tiger = {t1, new Tiger()};

        Octopus o1 = new Octopus();
        Octopus[] octopus = {o1, new Octopus()};



        Animal a1 = new Animal();
        Animal a2 = new Tiger();
        Animal a3 = new Octopus();
        Animal [] animals = {t1,o1,a1,a2,a3};

        for (Animal each:animals   ) {
            each.Talk();

        }
    }
}