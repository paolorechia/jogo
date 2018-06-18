import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

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
        Problema p = sp.selecionarProblema();
        if (p != null){
          Projeto proj = new CriarProjeto().criarProjeto(p);
          if (proj != null){
            IniciarJogo ij = new IniciarJogo();
            ij.iniciarJogo(p, proj);
            return;
          }
        }
        else input = "";
      }
      else if (input.toUpperCase().equals("SAIR")){
        return;
      }
    }
  }
}
