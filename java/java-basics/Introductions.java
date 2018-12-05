import java.io.Console;

public class Introductions {

  public static void main(String[] args) {
    Console console = System.console();
    //Hi My Name is
    String firstName = console.readLine("What is your name? ");
    //thisIsCamelCasing
    console.printf("Hi My Name is, what, my name is who, my name is...chka chka %s\n", firstName);
  }
}
