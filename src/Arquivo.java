import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Arquivo {
  private static String caminhoModelos;
  private static String csvDivisor;

  public Arquivo(){
    caminhoModelos = "modelos.csv";
    csvDivisor = ",";
  }
	public void salvar(Problema[] p) {

	}

	public Problema[] carregarProblemas() {
		return null;
	}

	public ModeloCicloVida[] carregarModelos() throws IOException{
    BufferedReader br = null;
    String linha = "";
    br = new BufferedReader(new FileReader(caminhoModelos));
    br.readLine();
    while ((linha = br.readLine()) != null) {
        String[] entrada= linha.split(csvDivisor);
        ModeloCicloVida mod = new ModeloCicloVida(entrada[0], entrada[1]);
        mod.printaNome();
        mod.exibirDescricao();
    }
		return null;
	}

	public Atividade[] carregarAtividades() {
		return null;
	}

}
