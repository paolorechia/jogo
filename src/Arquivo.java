import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.ArrayList;


public class Arquivo {
  private static String caminhoModelos;
  private static String caminhoProblemas;
  private static String csvDivisor;

  public Arquivo(){
    caminhoModelos = "modelos.csv";
    caminhoProblemas = "problemas.txt";
    csvDivisor = ",";
  }
	public void salvar(Problema[] p) throws IOException,
                                   ClassNotFoundException{
	}

	public ArrayList<Problema> carregarProblemas() throws IOException,
                                                 ClassNotFoundException{
    ArrayList<Problema> p_list = new ArrayList<Problema>();
    FileInputStream fis = new FileInputStream(caminhoProblemas);
    ObjectInputStream ois = null;
    try{
       ois = new ObjectInputStream(fis);
    } catch (EOFException ex){
//        System.err.println("end of reader file ");
    }
    // read object from file
  
    if (ois != null){
      while (true) {
          try { 
              Problema result = (Problema) ois.readObject();
  //            System.out.println(obj)
          } catch (EOFException ex) {
//              System.err.println("end of reader file ");
              break;
          }
      }
        ois.close();
    }
		return p_list;
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
