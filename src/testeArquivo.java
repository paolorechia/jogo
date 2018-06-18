import java.io.*;
import java.util.ArrayList;

public class testeArquivo{
  public static void main(String[] args) throws IOException,
                                         ClassNotFoundException{
    Arquivo a = new Arquivo();
    ArrayList<Problema> p_list = a.carregarProblemas();
    if (p_list == null){
      p_list = new ArrayList<Problema>();
    }
    ArrayList<ModeloCicloVida> m_list = a.carregarModelos();
    Problema p = new Problema(m_list);
    p.setaDescricao("Problema teste");
    for (ModeloCicloVida mod: m_list){
      System.out.printf("%s: %s\n", mod.getNome(), mod.getDesc());
    }
    p.setaObjetivos();
    p.escolheModelos();
    for (ModeloCicloVida mod: p.getModelos()){
      System.out.printf("%s: %s\n", mod.getNome(), mod.getDesc());
    }
    
  }
}
