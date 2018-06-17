import java.io.*;


public class UserInterface {
  private static  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  private static String s;
  private static int num;
	public static String getUserInput() throws IOException {
    System.out.print("Digite a opcao desejada: ");
    s = in.readLine();
		return String.format(s);
  }
  public static int getNumeric() throws IOException {
    System.out.print("Digite a opcao desejada: ");
    boolean sucesso = false;
    while (!sucesso){
      try {
          num = Integer.parseInt(in.readLine());
          sucesso = true;
        } catch (NumberFormatException e) {
          System.out.println("Por favor digite um numero");
        }
    }
    return num;
  }
}
