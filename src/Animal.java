public class Animal {
    protected String name;
    protected String species;
    protected int numLegs;

    public Animal(String name, String species, int numLegs) {
        this.name = name;
        this.species = species;
        this.numLegs = numLegs;
    }

    public void describe() {
        String message;
        if (numLegs != 0) {
            message = "My name is " + this.name + ", I am a " + this.species.toLowerCase() + " and I have " + this.numLegs + " legs.";
        } else {
            message = "My name is " + this.name + ", I am a " + this.species.toLowerCase() + " and I have no legs.";
        }
        System.out.println(message);
    }
}
