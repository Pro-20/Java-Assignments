package accessModifiers;

public class TestAccess {
  public static void main(String[] args) {
    System.out.println("Accessing ParentClass from same package: ");

    ParentClass parent = new ParentClass();
    // --> accessible
    parent.publicMethod();
    parent.protectedMethod();
    parent.defaultMethod();
    // parent.privateMethod(); // --> not accessible

    System.out.println();

    System.out.println("Accessing ParentClass from same package: ");

    ChildClass child = new ChildClass();
    // --> accessible overridden method in ChildClass
    child.publicMethod();
    child.protectedMethod();
    child.defaultMethod(); /* The default method can be accessed in ChildClass, both are in the same package. */

    // child.privateMethod(); // --> can't access
  }
}
