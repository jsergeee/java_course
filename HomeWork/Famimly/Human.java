package HomeWork.Famimly;



public class Human {
    protected String first_name, last_name, sex, status_of_job;
    protected int age, weight, height, income;


    public Human(String first_name, String last_name, String sex, int age, int weight, int height, String status_of_job, int income){
        this.first_name = first_name;
        this.last_name = last_name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.income = income;
        this.status_of_job = status_of_job;
    }
    public Human(){

    }


    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }

    public int getIncome(){
        return income;
    }
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }


    @Override
    public String toString(){
        return String.format("%s %s %s %d %d %d %s %d", first_name, last_name, sex, age, weight, height, status_of_job, income);
    }


}


