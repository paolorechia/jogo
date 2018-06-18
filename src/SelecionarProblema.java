import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SelecionarProblema {
  public Problema selecionarProblema() throws IOException,
                                       ClassNotFoundException{
    Arquivo a = new Arquivo();
    ArrayList<Problema> p_list = a.carregarProblemas();
    Problema p = null;
    Screen scr = new Screen(); 
    scr.setTitulo("Selecionar Problema - passo 0");
    scr.setOp("prox","mostra proximo problema");
    scr.setOp("escolher", "escolhe o problema atual para solucionar");
    scr.setOp("abortar", "retorna ao menu principal");
    String input;
    Iterator<Problema> iter = p_list.iterator();
    while (true){
      if (p != null){
        scr.zeraMsg();
        scr.addMsg(p.getDescricao()); 
      } 
      scr.display();
      input = UserInterface.getUserInput();
      if (input.toUpperCase().equals("ABORTAR")){
        return null;
      }
      else if (input.toUpperCase().equals("PROX")){
        if (iter.hasNext()){
          p = iter.next();
        }
        else{
          iter = p_list.iterator();
          p= iter.next();
        }
      }
      else if (input.toUpperCase().equals("ESCOLHER")){
        return p;
      }
    }
  }
}
