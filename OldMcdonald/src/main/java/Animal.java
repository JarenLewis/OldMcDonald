public abstract class Animal implements Singing, Bio {

    private String type;
    private String name;
    private String sound;
    private int numberOfLegs;
    private boolean isFarmAnimal;

    public Animal(){
        this.numberOfLegs = 4;
        this.isFarmAnimal = true;
    }

    public Animal(String type, String name, String sound, int numberOfLegs, boolean isFarmAnimal) {
        this.type = type;
        this.name = name;
        this.sound = sound;
        this.numberOfLegs = numberOfLegs;
        this.isFarmAnimal = true;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSound() {
        return sound;
    }
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    @Override
    public boolean isFarmAnimal() {
        return isFarmAnimal;
    }

    @Override
    public String toString() {
        return "Old MacDonald had a farm. " +
                "E-I-E-I-O. And on that farm he had a " + this.getType() +
                "E-I-E-I-O. With a " + this.getSound() + " here. And a " +
                this.getSound() + " there.";
    }
}