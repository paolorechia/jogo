import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.EOFException;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.*;


public class Arquivo {
  private static String caminhoModelos;
  private static String caminhoProblemas;
  private static String csvDivisor;

  public Arquivo(){
    caminhoModelos = "modelos.csv";
    caminhoProblemas = "problemas.txt";
  }
	public void salvar(ArrayList<Problema> p_list) throws IOException,
                                   ClassNotFoundException{
    int i = 0;
    String outputTest = "durp.txt";
    BufferedWriter bw = new BufferedWriter(new FileWriter(outputTest));
    for (Problema p : p_list){
      bw.write(p.getDescricao());
      System.out.println(p.getDescricao());
      bw.newLine();
      bw.write(i);
      System.out.println(i);
      bw.newLine();
      i++;
      bw.write(p.getEtapas().size());
      System.out.println(p.getEtapas().size());
      bw.newLine();
      for (Etapa e: p.getEtapas()){
        bw.write(e.getNome());
        bw.newLine();
        bw.write(e.getObjs().size());
        bw.newLine();
        for (Objetivo o: e.getObjs()){
          bw.write(o.getNome());
          bw.newLine();
          ArrayList<Integer> custos;
          custos = o.getCusto().asArrayList();
          Iterator<Integer> iter = custos.iterator();
          while(iter.hasNext()){
            int c = iter.next();
            bw.write(c);
            bw.newLine();
          }
        }
      }
    }
    bw.flush();
    bw.close();
	}

	public ArrayList<Problema> carregarProblemas() 
                                                 throws IOException,
                                                 ClassNotFoundException{
    ArrayList<Problema> p_list = new ArrayList<Problema>();
    BufferedReader br = null;
    String linha = "";
    br = new BufferedReader(new FileReader(caminhoProblemas));
    while ((linha = br.readLine()) != null) {
      if (linha.toUpperCase().contains("PROB")){;   
        System.out.println("Creating...");
        int numModelos = Integer.parseInt(br.readLine()); 
        ArrayList<ModeloCicloVida> modelos;
        modelos  = new ArrayList<ModeloCicloVida>();
        while (numModelos > 0){
          ModeloCicloVida mod;
          mod = new ModeloCicloVida(br.readLine(), "");
          modelos.add(mod);
          numModelos--; 
        }
        Problema p = new Problema(modelos); 
        p.setaDescricao(br.readLine());
        int numEtapas= Integer.parseInt(br.readLine()); 
        while (numEtapas > 0){
          Etapa e = new Etapa(br.readLine());
          numEtapas--;
          int numObj= Integer.parseInt(br.readLine()); 
          while (numObj > 0){
            Objetivo o = new Objetivo(); 
            int[] var_cust = new int[5];
            for (int i = 0; i < 5; i++){
              var_cust[i] = Integer.parseInt(br.readLine());
            }
            o.setaCusto(var_cust[0],
                        var_cust[1],
                        var_cust[2],
                        var_cust[3],
                        var_cust[4]);
            e.adicionarObj(o);
            numObj--;
          }
        }
      p_list.add(p);
      }
    }
    for (Problema p: p_list){
      p.exibirDescricao();
    }
		return p_list;
  }

	public ArrayList<ModeloCicloVida> carregarModelos() throws IOException{
    BufferedReader br = null;
    String linha = "";
    csvDivisor = ",";
    br = new BufferedReader(new FileReader(caminhoModelos));
    br.readLine();
    ArrayList<ModeloCicloVida> m_list = new ArrayList<ModeloCicloVida>();
    while ((linha = br.readLine()) != null) {
        String[] entrada= linha.split(csvDivisor);
        ModeloCicloVida mod = new ModeloCicloVida(entrada[0], entrada[1]);
        m_list.add(mod);    
    }
    br.close();
    return m_list;
	}

	public Atividade[] carregarAtividades() {
		return null;
	}

}
