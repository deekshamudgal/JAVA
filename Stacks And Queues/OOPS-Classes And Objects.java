import java.util.*;


public class Main {

  //class Person
  public static class Person {
    //data members
    int age;
    String name;

    //function
    void saysHi() {
      System.println(name + "[" + age + "] says hi");
    }
  }

  public static void main(String[] args) {
    //object p1
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "A";
    p1.saysHi();

    //object p2
    Person p2 = new Person();
    p2.age = 20;
    p2.name = "B";
    p2.saysHi();

  }
}
