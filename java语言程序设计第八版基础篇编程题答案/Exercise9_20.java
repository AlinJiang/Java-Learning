import java.io.*;
import java.util.*;

class Exercise9_20 {
  public static void main(String[] args) throws Exception {
    // Check command line parameter usage
    if (args.length != 3) {
      System.out.println(
        "Usage: java Exercise9_20 sourceFile oldStr newStr");
      System.exit(0);
    }

    // Check if source file exists
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
       System.out.println("Source file " + args[0] + " not exist");
       System.exit(0);
    }

    // Read text from the file and save it in a string builder
    Scanner input = new Scanner(sourceFile);
    StringBuilder sb = new StringBuilder();

    while (input.hasNext()) {
      String s1 = input.nextLine();
      String s2 = s1.replaceAll(args[1], args[2]);
      sb.append("\r\n" + s2);
    }

    input.close();

    // Write back to the file
    PrintWriter output = new PrintWriter(sourceFile);
    output.printf("%s\r\n", sb.toString());
    output.close();
  }
}
