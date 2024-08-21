package Lesson2;

public class Less2_stringsDemo {
    public static void main(String[]args){
        String[] name = {"С","Е","Р","Г","Е","Й","Я","К","О","В"};
        String sk = "СЕРГЕЙ ЯКОВ";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join("",name));
        System.out.println(String.join(" ", "С","Е","Р","Г","Е","Й","Я","К","О","В"));
        System.out.println(String.join(",", "С","Е","Р","Г","Е","Й","Я","К","О","В"));
    }
}
