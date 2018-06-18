import java.io.*;
import java.util.ArrayList;

public class Problema implements Serializable{
  private static final long serialVersionUID = 1L;
	private String descricaoProblema;
	private ArrayList<Objetivo> objetivos;
	private ArrayList<ModeloCicloVida> modelosDisponiveis;
	private Cliente cliente;
	private int numero_etapas;
	private Objetivo[] etapas;

  public Problema(){
    objetivos = new ArrayList<Objetivo>();

  }
	public void exibirDescricao() {

	}

	public void setaDescricao(String desc) {
    descricaoProblema = desc;
	}
	public void setaObjetivos() throws IOException{
    Screen scr = new Screen(); 
    String input = "";
    Objetivo o = null; 
    scr.setTitulo("Criar objetivos");
    scr.setOp("criarobj", "cria um objetivo adicional");
    scr.setOp("termina","termina de criar objetivos");
    scr.setPrompt("Digite a opcao desejada: ");
    scr.addMsg(String.format("Numero de objetivos criados: %d\n",
                               objetivos.size()));
    scr.display();
    while (!(input.toUpperCase().equals("TERMINA"))){
      input = UserInterface.getUserInput();
      scr.zeraMsg();
      scr.addMsg(String.format("Numero de objetivos criados: %d\n",
                               objetivos.size()));
      scr.display();
      if (input.toUpperCase().equals("CRIAROBJ")){
        o = CriarObjetivo.criarObjetivo();
        if (o != null){
          objetivos.add(o);
        }
        scr.zeraMsg();
        scr.addMsg(String.format("Numero de objetivos criados: %d\n",
                                 objetivos.size()));
        scr.display();
      }
    }
	}

	public void escolheModelos() throws IOException{
    EscolherModelo.escolherModelo(modelosDisponiveis);
	}

	public Objetivo criarListaObjetivos() {
		return null;
	}

}
