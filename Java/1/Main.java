public class Main {
  public static void main(String[] args) {
    // These are variables, requires the type, name, then value
    String name = "Astralis";
    int age = 18;
    char letter = 'a'; // Char variables are special, they require single quotes instead of doubles tp signify it isn't a string
    boolean booleanVar = true;
    float myFloat = 1.33f;

    // You can also declare multiple of the same variable type like this
    int a = 1, b = 2, c = 3;


    // This is a "final" variable, which is like a variable that can't be changed
    String name2 = "Kai";
    int myNum2 = 13;
    char letter2 = 'a';
    boolean booleanVar2 = true;
    float myFloat2 = 1.33f;

    // This prints a line consisting of the entered values, the + concats variables together with strings or eachother
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("IsAdult: " + booleanVar);
  }
}