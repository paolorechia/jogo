import java.io.*;
import java.util.*;
public class Projeto {

  private Problema prob;
	private double orcamento;
	private Cronograma cron;
  private ModeloCicloVida modelo;

  public Projeto(Problema p ){
    this.prob = p;
  }
  public Problema getProb(){
    return this.prob;
  }
  public void setCron(Cronograma c){
    this.cron = c;
  }
  public void defineModelo(ArrayList<ModeloCicloVida> m_list)
                                       throws IOException{
    Screen scr = new Screen(); 
    // implementar o Set
    ModeloCicloVida mod = null;
    scr.setTitulo("Criacao do Projeto - escolha do modelo");
    scr.setOp("prox","mostra proximo item");
    scr.setOp("definir", "utiliza modelo no projeto");
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
      Iterator<ModeloCicloVida> modelosIter= m_list.iterator();
      while (modelosIter.hasNext()){
        ModeloCicloVida atual = modelosIter.next();
        scr.addMsg(String.format("%s", atual.getNome()));
      } 
      scr.display();
      input = UserInterface.getUserInput();
      if (input.toUpperCase().equals("PROX")){
        if (iter.hasNext()){
          mod = iter.next();
        }
        else{
          iter = m_list.listIterator(); mod = iter.next();
        }
      }
      else if (input.toUpperCase().equals("DEFINIR")){
        this.modelo = mod;
        return;
      }  
    }
  }
  public void leOrcamentoUI() throws IOException{
    Screen scr = new Screen(); 
    // implementar o Set
    scr.setTitulo("Criacao do Projeto - valor de orcamento");
    scr.setPrompt("Entre com o valor do orcamento: ");
    scr.display();
    int valor;
    this.orcamento = UserInterface.getNumeric();
  }
}
