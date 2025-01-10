public class Main {

  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    // These are variables, requires the type, name, then value
    String name = "Astralis";
    String[] people = {"Me", "Myself", "I"}; // Array, uses "[]" after variable type
    int age = 18;
    char letter = 'a'; // Char variables are special, they require single quotes instead of doubles tp signify it isn't a string
    boolean booleanVar = true;
    float myFloat = 1.33f;

    // You can also declare multiple of the same variable type like this
    int a = 1, b = 2, c = 3;


    // This is a "final" variable, which is like a variable that can't be changed
    final String stringFinal = "Kai";
    final int intFinal = 13;
    final char charFinal = 'a';
    final boolean boolFinal = true;
    final float floatFinal = 1.33f;

    // This prints a line consisting of the entered values, the + concats variables together with strings or eachother
    System.out.println(Math.floor(Math.random() * 101));

    // This is an if statement, similar to JS

    double randomNum = Math.floor(Math.random() * 10);
    boolean value;

    if (randomNum > 5d) {
      value = true;
    } else {
      value = false;
    }

    if ( value /* Condition */ ) {
      /* Code */
      System.out.println("True!\t" + randomNum);
    } else {
      System.out.println("False!\t" + randomNum);
    }

    /* Numerical for-loop */
    // for (int i = 0; i < 5; i++) {
    //   System.out.println(i);
    // }

    // for (String item : people) {
    //   System.out.println(item);
    // }

    myMethod();
  }
}