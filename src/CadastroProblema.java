import java.io.*;
import java.util.ArrayList;

public class CadastroProblema{
  public Jogo cadastrarProblema() throws IOException,
                                  ClassNotFoundException{

    Arquivo arq = new Arquivo();
    ArrayList<Problema> p_list = arq.carregarProblemas();
    if (p_list == null){
      p_list = new ArrayList<Problema>();
    } 
    Screen scr = new Screen(); 
    scr.setTitulo("Cadastrar Problema - passo 0");
    scr.setOp("", "");
    scr.setOp("","");
    scr.setOp("abortar", "retorna ao menu principal");
    String input;
    while (true){
      scr.display();
      input = UserInterface.getUserInput();
      if (input.toUpperCase().equals("ABORTAR")){
        return null;
      }
    }
  }
  public Problema criarProblema() throws IOException{
    return null;
  }
}
