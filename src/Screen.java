import java.io.*;
import java.util.*;

public class Screen{
  static String title;
  static HashMap<String, String> opcoes;
  public void display(){
    System.out.print("\033\143");
    System.out.println("==================================================");
    System.out.println("                      MENU PRINCIPAL              ");
    System.out.println("==================================================");
    System.out.println("Por favor, escolha alguma das opcoes abaixo:");
    System.out.println("==================================================");
    System.out.println("cadastrar   -  cadastra um novo problema");
    System.out.println("selecionar  -  seleciona um problema para resolver");
    System.out.println("sair        -  seleciona um problema para resolver");
  }
  private String genHeader(int size){
    return null;
  }
}
