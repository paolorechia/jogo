import java.util.ArrayList;

public class Cronograma {

	private ArrayList<Etapa> etapas;
	private int etapaAtual;
  public Cronograma(ArrayList<Etapa> es){
    this.etapas = es;
    this.etapaAtual = 0;
  }
	public int getEtapaAtual() {
		return etapaAtual;
	}

}
