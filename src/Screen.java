import java.io.*;
import java.util.*;

public class Screen{
  static private String title;
  static private LinkedHashMap<String, String> opcoes;
  static private int screenLength;
  static private int maxOpSize;
  public Screen(){
    opcoes = new LinkedHashMap<String, String>();
    screenLength = 80;
    maxOpSize = 20;
    title = "Teste";
  }
  public void setOp(String nomeOp, String descOp){
    opcoes.put(nomeOp, descOp);
  }
  public void setTitulo(String titulo){
    title = titulo;
  }
  public void display(){
    System.out.print("\033\143");
    printSeparator();
    printTitle();
    printSeparator();
    System.out.println("Por favor, escolha alguma das opcoes abaixo:");
    printSeparator();
    for (Map.Entry<String, String> op: opcoes.entrySet()){
//      System.out.println(op.getKey() + ": " + op.getValue());
      printOption(op.getKey(), op.getValue());
    }
  }
  private void printSeparator(){
    for (int i = 0; i < screenLength; i++){
      System.out.print("=");
    }
    System.out.println();
  }
  private void printTitle(){
    int freeSpace = screenLength - title.length();
    for (int i = 0; i < freeSpace/2; i++){
      System.out.print(" ");
    }
    System.out.print(title);
    for (int i = freeSpace/2 + title.length(); i < screenLength; i++){
      System.out.print(" ");
    }
    System.out.println();
  }
  private void printOption(String op, String desc){
    System.out.print(op);
    int freeSpace = screenLength - desc.length() - op.length();
    for (int i = 0; i < freeSpace; i++){
      System.out.print(" ");
    }
    System.out.println(desc);
  }
}
