package Task_1;

import java.util.Scanner;

public class Dog {
    private String dogName;
    DogBreed breed;
    public int age;

    public Dog(String dogName, DogBreed breed, int age){
        this.dogName=dogName;
        this.breed=breed;
        this.age=age;
    }

    public Dog(String dogName, DogBreed breed) {
        this.dogName = dogName;
        this.breed = breed;
        this.age = 1;
    }

    void eat() // prints message: “dogName is eating now...”
    {
        System.out.println(dogName + " is eating now…");
    }
    void bark() //prints bark sound. Sound depends on the breed and age of the dog.
    // If the dog age is less than 5 then print the sound with lowercase letters,
    // otherwise with uppercase letters. Also for different breeds print different sounds.
    {
        switch (breed){
            case BULLDOG:
                if (this.age>=5){
                    System.out.println("bulldogffff bulldogffff");
                }else {
                    System.out.println("BULLDOGFFFF BULLDOGFFFF");
                }
                break;
            case RETRIEVER:
                if (this.age>=6){
                    System.out.println("retrieverffff retrieverffff");
                }else {
                    System.out.println("RETRIEVERFFFF RETRIEVERFFFF");
                }
                break;
            case POODLE:
                if (this.age>=7){
                    System.out.println("poodleffff ppodleffff");
                }else {
                    System.out.println("POODLEFFFF POODLEFFFF");
                }
                break;
            case CHIHUAHUA:
                if (this.age>=8){
                    System.out.println("chihuahuaffff chihuahuaffff");
                }else {
                    System.out.println("CHIHUAHUAFFFF CHIHUAHUAFFFF");
                }
                break;
        }
    }
}
