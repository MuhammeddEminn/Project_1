package Task_1;

public class Main {
    public static void main(String[] args) {

        Dog d2 = new Dog("Auddy",DogBreed.BULLDOG, 5 );
        d2.eat();
        d2.bark();

        Dog d1 = new Dog("Buddy", DogBreed.BULLDOG);
        d1.eat();
        d1.bark();

        d1.age=5;
        d1.bark();

        Dog d3 = new Dog("Cuddy",DogBreed.RETRIEVER, 6 );
        d2.eat();
        d2.bark();

        Dog d4 = new Dog("Duddy", DogBreed.RETRIEVER);
        d1.eat();
        d1.bark();

        d1.age=6;
        d1.bark();

        Dog d5 = new Dog("Kuddy",DogBreed.POODLE, 7 );
        d2.eat();
        d2.bark();

        Dog d6 = new Dog("Luddy", DogBreed.POODLE);
        d1.eat();
        d1.bark();

        d1.age=7;
        d1.bark();

        Dog d7 = new Dog("Muddy",DogBreed.CHIHUAHUA, 8 );
        d2.eat();
        d2.bark();

        Dog d8 = new Dog("Nuddy", DogBreed.CHIHUAHUA);
        d1.eat();
        d1.bark();

        d1.age=8;
        d1.bark();

        }
    }