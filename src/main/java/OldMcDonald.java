public class OldMcDonald {
    public static void main(String[] args) {

        Animal[] animals = new Animal[] {
                new Cat(),  new Chicken(),
                new Cow(), new Dog(), new Goat(),
                new Pig(), new Sheep()
        };

        for (Animal s : animals) {
            System.out.println(s);
        }
    }
}