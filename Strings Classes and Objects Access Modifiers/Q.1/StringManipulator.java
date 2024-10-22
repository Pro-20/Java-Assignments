public class StringManipulator {
  // concatenate strings
  static String concatenate(String str1, String str2) {
    return str1 + " " + str2;
  }

  // get length of string
  static int getLength(String str) {
    return str.length();
  }

  // string convert to UpperCase
  static String convertToUpper(String str) {
    return str.toUpperCase();
  }

  public static void main(String[] args) {
    String str1 = "Masai";
    String str2 = "School";

    // concatenate method
    String concatenate = concatenate(str1, str2);
    System.out.println(concatenate);

    // getLength method
    int length = getLength(concatenate);
    System.out.println(length);

    // convertToUpper method
    String upperStr = convertToUpper(concatenate);
    System.out.println(upperStr);
  }
}