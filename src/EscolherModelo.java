import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class EscolherModelo{
  public static ArrayList<ModeloCicloVida> escolherModelo(
                         ArrayList<ModeloCicloVida> m_list)
                         throws IOException{
    Screen scr = new Screen(); 
    // implementar o Set
    HashSet<ModeloCicloVida> modelos = new HashSet<ModeloCicloVida>();
    ModeloCicloVida mod = null;
    scr.setTitulo("Escolha dos modelos disponiveis");
    scr.setOp("prox","mostra proximo item");
    scr.setOp("incluir", "inclui modelo como disponivel");
    scr.setOp("termina","conclui selecao de modelos");
    String input;
    Iterator<ModeloCicloVida> iter = m_list.iterator();
    if (iter.hasNext()){
      mod = iter.next();
    }
    while (true){
      scr.zeraMsg();
      scr.addMsg(String.format("Modelo selecionado: %s\n %s", 
                 mod.getNome(),
                 mod.getDesc()));
      if (modelos.size() > 0){
        scr.addMsg("Modelos ja escolhidos:");
      }
      Iterator<ModeloCicloVida> modelosIter= modelos.iterator();
      while (modelosIter.hasNext()){
        ModeloCicloVida atual = modelosIter.next();
        scr.addMsg(String.format("%s", atual.getNome()));
      } 
      scr.display();
      input = UserInterface.getUserInput();
      if (input.toUpperCase().equals("ABORTAR")){
        return null;
      }
      else if (input.toUpperCase().equals("PROX")){
        if (iter.hasNext()){
          mod = iter.next();
        }
        else{
          iter = m_list.listIterator(); mod = iter.next();
        }
      }
      else if (input.toUpperCase().equals("INCLUIR")){
        modelos.add(mod);
      }  
      else if (input.toUpperCase().equals("TERMINA")){
        if (modelos.size() > 0) {
          ArrayList<ModeloCicloVida> ret_list = new ArrayList<ModeloCicloVida>();
          modelosIter= modelos.iterator();
          while (modelosIter.hasNext()){
            ModeloCicloVida atual = modelosIter.next();
            ret_list.add(atual);
          }
          return ret_list;
        } 
        else{
          return null;
        }
      }  
    }
  }
}
