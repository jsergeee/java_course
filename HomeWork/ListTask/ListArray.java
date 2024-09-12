package HomeWork.ListTask;

import HomeWork.Famimly.Family;

public class ListArray {
    String name, last_name, work;
    int age;

public ListArray(String name,String last_name, int age, String work){
    this.name = name;
    this.last_name = last_name;
    this.work = work;
    this.age = age;

}

@Override
    public String toString(){
    return "Name: " + name  + " Last name: " + last_name + " Age: " + age + " Work: " + work;
    }


}
