package HomeWork.Various;



public class Human{
        private String name;
        public Human(String name) {
            this.name = name;
        }


        String a = "новая переменная ";
        @Override
        public String toString(){
            return "Человек с именем:" + name + a;
        }
    }

