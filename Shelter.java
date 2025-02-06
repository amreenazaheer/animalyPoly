public class Shelter {
    public void makeAllAnimalsSound(Animal[] animals){
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
