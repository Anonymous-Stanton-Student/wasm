import java.util.ArrayList;

public class ExternalClass {

    public void iterateArrayList(ArrayList<String> array) {
        for (String string : array) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        System.out.println("Running ExternalClass...");
    }
}