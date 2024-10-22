public class Person {
  String firstName = "Sai";
  String lastName = "Kumar";

  // full name
  static String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // reverse name
  static String reverseName(String name) {
    String reversedName = "";
    int n = name.length();

    for (int i = n - 1; i >= 0; i--) {
      reversedName += name.charAt(i);
    }

    return reversedName;
  }

  // compare names
  static boolean compareNames(String person, String anotherPerson) {
    if (person.equals(anotherPerson)) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    Person obj1 = new Person();

    Person obj2 = new Person();
    obj2.firstName = "John";
    obj2.lastName = "Doe";

    // getFullName method
    String person = getFullName(obj1.firstName, obj1.lastName);
    String anotherPerson = getFullName(obj2.firstName, obj2.lastName);
    System.out.println(person);
    System.out.println(anotherPerson);

    // reverseName method
    System.out.println(reverseName(person));
    System.out.println(reverseName(anotherPerson));

    // compareNames method
    boolean result = compareNames(person, anotherPerson);
    
    if (result) {
      System.out.println("Same");
    } else {
      System.out.println("Not Same");
    }
  }
}
