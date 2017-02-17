import java.io.*;
import java.util.*;
public class Person {
  private int initialAge;

  public Person (int initialAge) {
    if () {
      
    } 
    this.initialAge = initialAge;
  }

  public void yearPasses() {
    initialAge += 1;
  }

  public void amIOld() {

  }
  // setter for age
  public int setAge(int age) {

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int age = sc.nextInt();
      Person p = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++) {
        p.yearPasses();
      }
      p.amIOld();
      System.out.println();
        }
    sc.close();
  }
}
