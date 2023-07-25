import java.util.Scanner;

/**
 * A utility class for reading input from the user and printing output to the console.
 */
public class AskerAndReader {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user with the given question and reads an integer from the console.
     * @param question the question to ask the user
     * @return the integer entered by the user
     */
    public int askInt(String question) {
        System.out.print(question);
        return scanner.nextInt();
    }

    /**
     * Prompts the user with the given question and reads a float from the console.
     * @param question the question to ask the user
     * @return the float entered by the user
     */
    public float askFloat(String question) {
        System.out.print(question);
        return scanner.nextFloat();
    }

    /**
     * Prompts the user with the given question and reads a string from the console.
     * @param question the question to ask the user
     * @return the string entered by the user
     */
    public String askString(String question) {
        System.out.print(question);
        return scanner.next();
    }

    /**
     * Prompts the user with the given question and reads a boolean from the console.
     * @param question the question to ask the user
     * @return the boolean entered by the user
     */
    public boolean askBoolean(String question) {
        System.out.print(question);
        return scanner.nextBoolean();
    }

    /**
     * Prints the given message to the console.
     * @param message the message to print
     */
    public void print(String message) {
        System.out.println(message);
    }

    /**
     * Prints the given integer to the console.
     * @param message the integer to print
     */
    public void print(int message) {
        System.out.println(message);
    }

    /**
     * Prints the given float to the console.
     * @param message the float to print
     */
    public void print(float message) {
        System.out.println(message);
    }

    /**
     * Prints the given boolean to the console.
     * @param message the boolean to print
     */
    public void print(boolean message) {
        System.out.println(message);
    }
}