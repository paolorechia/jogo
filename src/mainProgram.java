import java.io.*;

public class mainProgram{
  public static void main(String[] args) throws IOException{
    Screen screen = new MainScreen();
    screen.display();
    String input = UserInterface.getUserInput();
    System.out.println(input);
  }
}
