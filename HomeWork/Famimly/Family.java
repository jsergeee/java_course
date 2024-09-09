package HomeWork.Famimly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Family extends Human {

    public Family(String first_name, String last_name, String sex, int age, int weight, int height, String status_of_job, int income) {
        super(first_name, last_name, sex, age, weight, height, status_of_job, income);
    }


    public static void main (String[]args){
        Set<Family> family = new HashSet<>(Arrays.asList(
                new Family("a","b","c",46,100,178,"Meg",100)
        ));

        System.out.println(family);
    }
}
