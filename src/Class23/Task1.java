package Class23;

public class Task1 {
    /*Create a class named 'Programming'. While creating an object of the class,
     if nothing is passed to it, then the message "I love programming languages"
     should be printed. If some String is passed to it, then in place of "programming
     languages" the value variable should be printed. Example, if we pass "Java",
     then "I love Java" should be printed.
     */
    public static void main(String[] args) {
        Programing programing=new Programing();
        new Programing("Java");
    }
}
class Programing {
    Programing() { // this is a constructor
        System.out.println("I love programing languages");
    }

    Programing(String str) { // this is a constructor
        System.out.println("I love"+str);
    }
}