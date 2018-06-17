import java.io.*;
import java.util.ArrayList;

public class Etapa {

	private String Nome;

	private int Ordem;

	private ArrayList<Objetivo> objetivos;

	private int duracaoEsperada;

	private int duracaoReal;

	public void adicionarObj(Objetivo obj) {
    objetivos.add(obj);

	}

	public void definirDuracaoEsperada(int dur) {

	}

	public void incDurReal() {

	}

}
