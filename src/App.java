public class App {
    public static void main(String[] args) throws Exception {
        // Create a new asker and reader
        AskerAndReader askerAndReader = new AskerAndReader();
        // Use this to ask the user for their name
        String name = (String) askerAndReader.ask("What is your name? ");
        // Use this to print the user's name
        askerAndReader.print("Hello, " + name + "!");
        // Use this to ask the user for their age as an integer
        int age = (int) askerAndReader.ask("What is your age? ");
        // Use this to print the user's age
        askerAndReader.print("You are " + age + " years old.");
    }
}
