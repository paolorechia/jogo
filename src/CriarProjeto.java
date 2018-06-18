import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class CriarProjeto{
  public Projeto criarProjeto(Problema p) throws IOException,
                                       ClassNotFoundException{
    Projeto proj = new Projeto(p);
    proj.defineModelo(p.getModelos());
    CriarCronograma cc = new CriarCronograma();
    proj.setCron(cc.criarCronograma(p.getEtapas()));
    proj.leOrcamentoUI();
    return proj;
  }
}
