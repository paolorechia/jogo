public class Objetivo {

	private String nome;
  private Custo custo;
	private int estadoConclusao;

  public Objetivo(){
    estadoConclusao = 0;  
  }
	public void setaNome(String nome) {
    this.nome = nome;
	}
  public void getNome(){
    return nome;
  }
	public void setaCusto(int analise, int proj, int bd, int prog, int teste) {
    this.custo = new Custo(analise, proj, bd, prog, teste);
	}
  public void getCusto(){
    return custo;
  }
  public void terminou(){
    if (estadoConclusao < 100){
      return false;
    }
    else return true;
  }
}
