package HomeWork.Famimly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pet extends Human {
    String nikname, breed;
    int age;
    public Pet(String first_name, String last_name, String sex, int age, int weight, int height, String status_of_job, int income){
        super(first_name, last_name, sex, age, weight, height, status_of_job, income);

    }
    public Pet(String nikname, String breed, int age){
        this.nikname = nikname;
        this.breed = breed;
        this.age = age;
    }

    public static void main (String[]args){
//        Pet pet = new Pet("a","d","c",10,20,30,"f",10);
        Pet pet = new Pet("Cat","Siam",5);
        System.out.println(pet);
    }

@Override
public String toString(){
    return String.format("%s %s %d", nikname, breed, age);
}

}
