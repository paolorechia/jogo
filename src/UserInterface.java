import java.io.*;


public class UserInterface {
  private static  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  private static String s;
	public static String getUserInput() throws IOException {
    System.out.print("Please enter your input:");
    s = in.readLine();
		return String.format(s);
  }
}