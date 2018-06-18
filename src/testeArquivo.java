import java.io.*;
import java.util.ArrayList;

public class testeArquivo{
  public static void main(String[] args) throws IOException,
                                         ClassNotFoundException{
    Arquivo a = new Arquivo();
    ArrayList<ModeloCicloVida> m_list = a.carregarModelos();
    for (ModeloCicloVida mod: m_list){
      System.out.printf("%s: %s\n", mod.getNome(), mod.getDesc());
    }
    ArrayList<Problema> p_list = a.carregarProblemas();
    if (p_list == null){
      p_list = new ArrayList<Problema>();
    }
    Problema p = new Problema();
    p.setaDescricao("Problema teste");
    p.setaObjetivos();
    p.escolheModelos();
  }
}
