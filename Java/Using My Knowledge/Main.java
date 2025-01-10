public class Main {

    // New method with a return type of a string array, takes in two values
    static String[] stringMethod(String a, String b) {
        String[] output = {a, b};
        return output;
    }

    // New method with a return type of a float array, takes in three values
    static float[] xyz(float x, float y, float z) {
        float[] output = {x, y, z};
        return output;
    }

    static void iterateArrayToOutput(String[] array, String output) {
        int i = 0;
        for (String out : array) {
            switch (output.toLowerCase()) {
                case "console":
                    if (i == array.length - 1) {
                        System.out.print(out + "\n");
                    } else {
                        System.out.print(out + ", ");
                    }
                    break;
            
                default:
                    break;
            }

            i++;
        }
    }

    // Required for Java code, runs automatically
    public static void main(String[] args) {
        String[] array = {"Test", "array", "lol", ":)"};
        iterateArrayToOutput(array, "Console");
    }
}
