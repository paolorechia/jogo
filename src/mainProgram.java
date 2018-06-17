import java.io.*;

public class mainProgram{
  public static void main(String[] args) throws IOException{
    Screen screen = new MainScreen();
    while(true){
      screen.display();
      String input = UserInterface.getUserInput();
      System.out.println(input);
      if (input.equals("cadastrar")){
        CadastroProblema cp = new CadastroProblema();
        cp.cadastrarProblema();
      }
      else if(input.equals("selecionar")){
        SelecionarProblema sp = new SelecionarProblema();
        sp.selecionarProblema();
      }
      else if (input.equals("sair")){
        return;
      }
    }
  }
}
