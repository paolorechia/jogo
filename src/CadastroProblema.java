import java.io.*;

public class CadastroProblema{
  public Jogo cadastrarProblema() throws IOException{
    Screen scr = new Screen(); 
    scr.setTitulo("Cadastrar Problema - passo 0");
    scr.setOp("", "");
    scr.setOp("","");
    scr.setOp("abortar", "retorna ao menu principal");
    String input;
    while (true){
      scr.display();
      input = UserInterface.getUserInput();
      if (input.equals("abortar")){
        return null;
      }
    }
  }
}
