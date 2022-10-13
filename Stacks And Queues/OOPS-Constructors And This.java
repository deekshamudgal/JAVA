import java.util.*;

public class Main {
  public static class Person {
    int age;
    String name;
    void saysHi() {
      System.out.println(name + "[" + age + "] says Hi");
    }
    Person() { //1 Default constructor

    }
    Person(int age, String name) { //2 Parameterized constructor
      this.age = age;
      this.name = name;
    }
  }
  public static void main(String[]args) {
    Person p1 = new Person(); //3
    p1.age = 10;
    p1.name = "A";
    p1.saysHi();
    Person p2 = new Person(20, "B"); //4
    p2.saysHi();
  }
}
