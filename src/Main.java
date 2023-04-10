public class Main {
    public static void main (String[] args) {
        Budgie tweetypie = new Budgie("Tweetypie");
        Horse pancho = new Horse("Pancho");
        Snake kai = new Snake("Kai");
        Animal mochi = new Animal("Mochi", "Dog", 4);
        Animal bagheera = new Animal("Bagheera", "Cat", 4);

        tweetypie.describe();
        pancho.describe();
        kai.describe();
        mochi.describe();
        bagheera.describe();
    }
}
