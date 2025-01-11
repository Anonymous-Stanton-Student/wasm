import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Second {

    public static void main(String[] args) {

      ExternalClass externalClass = new ExternalClass();
      Random rand = new Random();
      String[] alphabet = {"a", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
      ArrayList<String> arrayList = new ArrayList<String>();
      for (int index = 0; index < 50; index++) {
        arrayList.add(alphabet[rand.nextInt(alphabet.length)]);
      }
      Collections.sort(arrayList);
      externalClass.iterateArrayList(arrayList);

    }

}