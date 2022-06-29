import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeter {
    public static void main(String[] args) throws IOException {
        greet();
    }

    public static void greet() throws IOException {
        String name = getName();
        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.printf("Howdy, %s! Welcome to the Wild West!", name);
        } else {
            System.out.println("Howdy, you unworthy of named greeting shmuck! Welcome to the Wild West!");
        }
    }

    private static String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name: ");
        String name = reader.readLine();
        return name;
    }
}
