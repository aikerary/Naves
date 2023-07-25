import java.util.Scanner;

/**
 * A utility class for reading input from the user and printing output to the
 * console.
 */
public class AskerAndReader {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * The function asks a question and returns the user's input as an Object.
     * 
     * @param question A string representing the question that will
     *                 be displayed to the user.
     * @return The method is returning an Object.
     */
    public Object ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Prints the given object to the console.
     * 
     * @param message the object to print
     */
    public void print(Object message) {
        System.out.println(message.toString());
    }
}