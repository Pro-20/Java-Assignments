import accessModifiers.ChildClass;
import accessModifiers.ParentClass;

public class AnotherClass {
  public static void main(String[] args) {
    System.out.println("Accessing ParentClass from outside the package: ");

    ParentClass parent = new ParentClass();
    // --> accessible methods
    parent.publicMethod();

    /*
     * --> can't access
     * parent.protectedMethod();
     * parent.privateMethod();
     * parent.defaultMethod();
     */

    System.out.println();

    System.out.println("Accessing ChildClass from outside the package:");

    ChildClass child = new ChildClass();
    // --> accessible methods
    child.publicMethod();

    /*
     * --> can't access
     * child.protectedMethod();
     * child.privateMethod();
     * child.defaultMethod();
     */
  }
}
