public class Artifact {
    String  name;
    String culture;
    int number;
    static int count = 1;

public void PrintA(){
    System.out.println(count++);
    }

    public Artifact(String name, String culture, int number){
        this.name = name;
        this.culture = culture;
        this.number = number;


    }


    public static void main(String[] args){
       Artifact a = new Artifact("Stek", "Romany", 12345);
       Artifact b = new Artifact("", "Incas", 12346);
       Artifact c = new Artifact("", "", 123457);
        System.out.println("Номер по порядку " + count++ + " " + a.name + a.culture + " " + a.number);
        System.out.println("Номер по порядку " + count++ + " " + b.name + b.culture + " " + b.number);
        System.out.println("Номер по порядку " + count++ + " " + c.name + c.culture + " " + c.number);
        a.PrintA();
        a.PrintA();
        b.PrintA();
    }

}

