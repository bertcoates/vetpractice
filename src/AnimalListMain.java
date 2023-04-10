import java.util.ArrayList;

public class AnimalListMain {
    public static void main (String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Budgie tweetypie = new Budgie("Tweetypie");
        Horse pancho = new Horse("Pancho");
        Snake kai = new Snake("Kai");
        Animal mochi = new Animal("Mochi", "Dog", 4);
        Animal bagheera = new Animal("Bagheera", "Cat", 4);

        animals.add(tweetypie);
        animals.add(pancho);
        animals.add(kai);
        animals.add(mochi);
        animals.add(bagheera);

        for (Animal animal : animals) {
            animal.describe();
        }
    }
}
