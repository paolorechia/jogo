import java.io.*;
import java.util.ArrayList;

public class Etapa {

	private String nome;
	private int Ordem;
	private ArrayList<Objetivo> objetivos;
	private int duracaoEsperada;
	private int duracaoReal;

  public Etapa(){
    objetivos = new ArrayList<Objetivo>();
  }
  public Etapa(String n){
    this.nome = n;
    objetivos = new ArrayList<Objetivo>();
  }

	public void adicionarObj(Objetivo obj) {
    objetivos.add(obj);
	}
	public ArrayList<Objetivo> getObjs() {
    return objetivos;
	}

	public void definirDuracaoEsperada(int dur) {
    this.duracaoEsperada = dur;
	}

	public void incDurReal() {

	}
  public String getNome(){
    return nome;
  }
}
