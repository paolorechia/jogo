import java.io.*;

public class EscolherModelo{
  public ArrayList<ModeloCicloVida> escolherModelo(
                         ArrayList<ModeloCicloVida> m_list)
                         throws IOException{
    Screen scr = new Screen(); 
    // implementar o Set
    ModeloCicloVida mod = null;
    scr.setTitulo("Escolha dos modelos disponiveis");
    scr.setOp("prox","mostra proximo item");
    scr.setOp("incluir", "inclui modelo como disponivel");
    scr.setOp("termina","conclui selecao de modelos");
    String input;
    Iterator<ModeloCicloVida> iter = m_list.listIterator();
    while (true){
      scr.display();
      input = UserInterface.getUserInput();
      if (input.toUpperCase().equals("ABORTAR")){
        return null;
      }
      else if (input.toUpperCase().equals("PROX"){
        if (iter.hasNext(){
          mod = iter.next();
        }
        else{
          iter = m_list.listIterator();
          mod = iter.next();
        }
      }
      else if (input.toUpperCase().equals("INCLUIR"){
        // implementar Set data structure de modelos
  
      }  
      else if (input.toUpperCase().equals("TERMINA"){
        // implementar Set data structure de modelos
        // if Set.size > 0 {
//          return Set
//        } 
      }  
    }
  }
  // retornar Set
}
