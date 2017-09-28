package labfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class WordHide {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare the starting file and scanner
    File wordInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      wordInputsFile = new File("input/wordhide_inputs.txt");
      scanner = new Scanner(wordInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen word
    String word = scanner.nextLine();

    // Step Two: Use substring and charAt to extract parts of the word

    // Step Three: Assemble the word by declaring ten new String variables

    // Step Four: Use ten println statements to display the 20 x 20 grid

    // Step Five: Display a final thankyou message

  }

}
