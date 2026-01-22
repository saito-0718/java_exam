package exam2;

public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Sheep sheep = new Sheep();
        Horse horse = new Horse();
        Goat goat = new Goat();
        animals[0] = sheep;
        animals[1] = horse;
        animals[2] = goat;

        for (Animal animal : animals) {
            animal.cry();
        }
    }

}
