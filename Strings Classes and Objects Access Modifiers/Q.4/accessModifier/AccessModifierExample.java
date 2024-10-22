public class AccessModifierExample {
  // public method
  public void publicMethod() {
    System.out.println("Public Method in AccessModifierExample");
  }

  // protected method
  protected void protectedMethod() {
    System.out.println("Protected Method in AccessModifierExample");
  }

  // private method
  private void privateMethod() {
    System.out.println("Private Method in AccessModifierExample");
  }

  // default method
  void defaultMethod() {
    System.out.println("Default Method in AccessModifierExample");
  }

  public static void main(String[] args) {
    AccessModifierExample modifier = new AccessModifierExample();

    // --> accessible methods
    modifier.publicMethod();
    modifier.protectedMethod();
    modifier.privateMethod();
    modifier.defaultMethod();
  }
}