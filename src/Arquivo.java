import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;

public class Arquivo {
  private static String caminhoModelos;
  private static String csvDivisor;

  public Arquivo(){
    caminhoModelos = "modelos.csv";
    csvDivisor = ",";
  }
	public void salvar(Problema[] p) {

	}

	public ArrayList<Problema> carregarProblemas() {
		return null;
	}

	public ArrayList<ModeloCicloVida> carregarModelos() throws IOException{
    BufferedReader br = null;
    String linha = "";
    br = new BufferedReader(new FileReader(caminhoModelos));
    br.readLine();
    ArrayList<ModeloCicloVida> m_list = new ArrayList<ModeloCicloVida>();
    while ((linha = br.readLine()) != null) {
        String[] entrada= linha.split(csvDivisor);
        ModeloCicloVida mod = new ModeloCicloVida(entrada[0], entrada[1]);
        m_list.add(mod);    
    }
    return m_list;
	}

	public Atividade[] carregarAtividades() {
		return null;
	}

}
