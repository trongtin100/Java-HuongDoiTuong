import animal.Animal;
import animal.Checken;
import animal.Tiger;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger() ;
        animal[1] = new Chicken ();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
