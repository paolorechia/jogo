import java.io.*;

public class SelecionarProblema {
  public Jogo selecionarProblema() throws IOException{
    Jogo jogo = null;
    Screen scr = new Screen(); 
    scr.setTitulo("Selecionar Problema - passo 0");
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
