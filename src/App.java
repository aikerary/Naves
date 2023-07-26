public class App {
    public static void main(String[] args) throws Exception {
        // Create a new asker and reader
        AskerAndReader anr = new AskerAndReader();
        // Ask the user for their name
        String name = anr.ask("What is your name? ");
        // Print the user's name
        anr.print("Hello, " + name + "!");
        // Ask the user for their age as an integer using parseInt
        int age = Integer.parseInt(anr.ask("How old are you? "));
        // Print the user's age
        anr.print("You are " + age + " years old.");
    }
}
