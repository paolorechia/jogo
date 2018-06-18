import java.io.*;

public class mainProgram{
  public static void main(String[] args) throws IOException,
                                         ClassNotFoundException{
    Screen screen = new MainScreen();
    while(true){
      screen.display();
      String input = UserInterface.getUserInput();
      System.out.println(input);
      if (input.toUpperCase().equals("CADASTRAR")){
        CadastroProblema cp = new CadastroProblema();
        cp.cadastrarProblema();
      }
      else if(input.toUpperCase().equals("SELECIONAR")){
        SelecionarProblema sp = new SelecionarProblema();
        Jogo jogo = sp.selecionarProblema();
        if (jogo != null){
          jogo.iniciar();
        }
        else input = "";
      }
      else if (input.toUpperCase().equals("SAIR")){
        return;
      }
    }
  }
}
