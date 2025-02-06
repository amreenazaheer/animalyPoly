public class App {
    public static void main(String[] args) throws Exception {
        Shelter shelter = new Shelter();

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();
        Animal cow = new Cow();
        Animal duck = new Duck();
        Animal lion = new Lion();
        
        Animal[] animals = {dog, cat, bird, cow, duck, lion};
        shelter.makeAllAnimalsSound(animals);
        cat.sleep();
    }
}
