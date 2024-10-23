public class Person {
  private String name;
  private int age;

  // default constructor
  public Person() {
    this.name = "Unknown";
    this.age = 0;
  }

  // parameterized constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // method to get person's details
  public void getDetails() {
    System.out.println("Name: " + name + " & Age: " + age);
  }

  public static void main(String[] args) {
    // Creating an object using the default constructor
    Person defPerson = new Person();

    // Creating an object using the parameterized constructor
    Person paramPerson = new Person("Abhishek", 23);

    // access details of both objects
    defPerson.getDetails();
    paramPerson.getDetails();
  }
}