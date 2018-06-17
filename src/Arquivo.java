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
    while ((linha = br.readLine()) != null) {
        String[] entrada= linha.split(csvDivisor);
        System.out.println("Nome modelo = " + entrada[0]);
        System.out.println("Desc modelo = " + entrada[1]);
    }
		return null;
	}

	public Atividade[] carregarAtividades() {
		return null;
	}

}
