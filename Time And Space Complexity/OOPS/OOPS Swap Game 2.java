import java.util.*;


public class Main {

  public static class Person {
    int age;
    String name;

    void saysHi() {
      System.out.println(name + "[" + age + "] says hi");
    }
  }

  public static void main(String[] args) throws Exception {

    Person p1 = new Person();
    p1.age = 10;
    p1.name = "A";

    Person p2 = new Person();
    p2.age = 20;
    p2.name = "B";

    p1.saysHi();
    p2.saysHi();

    swap2(p1, p2);

    p1.saysHi();
    p2.saysHi();
  }

  public static void swap2(Person psn1, Person psn2) {
    int age = psn1.age;
    psn1.age = psn2.age;
    psn2.age = age;

    String name = psn1.name;
    psn1.name = psn2.name;
    psn2.name = name;
  }

}
