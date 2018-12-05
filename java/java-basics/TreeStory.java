import java.io.Console;

public class TreeStory {
  public static void main(String[] args) {
    Console console = System.console();

  //__Name is a __adjective__ __noun__. They are always __adverb__ __verb__.
  String ageAsString = console.readLine("How old are you? ");
  int age = Integer.parseInt(ageAsString);
  if (age < 13) {
      //Insert exit code
      console.printf("Sorry homie \n");
      System.exit(0);
  }

  String name = console.readLine("Enter a name: ");
  String adjective = console.readLine("Enter an adjective: ");
  String noun;
  boolean isInvalidWord;
  do {
    noun = console.readLine("Enter a noun: ");
     isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
    if (isInvalidWord) {
    console.printf("Check yourself. Try again. \n\n");
    }
  } while (isInvalidWord);
  String adverb = console.readLine("Enter an adjective: ");
  String verb = console.readLine("Enter a verb ending in -ing: ");

  console.printf("Your TreeStory:\n-----------\n");
  console.printf("%s is a %s %s. ", name, adjective, noun);
  console.printf("He is always %s %s. \n", adverb, verb);
  }
}
