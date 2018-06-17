import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class CriarEtapas{
  public ArrayList<Etapa> criarEtapas(
                         ArrayList<Objetivo> list_obj)
                         throws IOException{
    ArrayList<Etapa> etapas = new ArrayList<Etapa>();
    
    String input;
    Objetivo obj = null;
    Iterator<Objetivo> iter = list_obj.listIterator();
    Screen scr = new Screen(); 
    scr.setTitulo("CRIACAO DE ETAPAS");
    scr.setPrompt("Digite o numero de etapas:");
    scr.display();
    int num_etapas = UserInterface.getNumeric();
    while (num_etapas > 0){
      Etapa e = new Etapa();
      scr = new Screen(); 
      scr.setTitulo("CRIACAO DE ETAPAS");
      scr.setPrompt("Digite o numero de etapas:");
      scr.display();
      while (true){
        scr.setTitulo("INCLUIR OBJETIVOS NA ETAPA");
        scr.setPrompt("Digite a opcao desejada: ");
        scr.setOp("prox","mostra proximo objetivo disponivel");
        scr.setOp("ligar", "ligar objetivo a etapa atual");
        scr.setOp("termina", "termina atribuicao de obj. p/ etapa atual");
        scr.setOp("abortar", "cancela criacao de etapas");
        input = UserInterface.getUserInput();
        scr.display();
        if (input.toUpperCase().equals("ABORTAR")){
          return null;
        }
        else if (input.toUpperCase().equals("PROX")){
          if (iter.hasNext()){
            obj = iter.next();
            System.out.println(obj.getNome());
            System.out.println(obj.getCusto().getString());
          }
          else{
            iter = list_obj.listIterator();
            obj = iter.next();
          }
        }
        else if (input.toUpperCase().equals("LIGAR")){
          e.adicionarObj(obj);
        }  
        else if (input.toUpperCase().equals("TERMINA")){
          break;
        }  
        etapas.add(e);
      }
    }
    return etapas;
  }
}
