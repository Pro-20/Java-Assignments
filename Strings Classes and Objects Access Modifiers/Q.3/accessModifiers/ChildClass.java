package accessModifiers;

public class ChildClass extends ParentClass {
  // override public method
  @Override
  public void publicMethod() {
    System.out.println("Public Method in Child");
  }

  // override protected method
  @Override
  protected void protectedMethod() {
    System.out.println("Protected Method in Child");
  }
}
