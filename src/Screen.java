import java.io.*;
import java.util.*;

public class Screen{
  private String title;
  private LinkedHashMap<String, String> opcoes;
  private ArrayList<String> mensagens;
  private String prompt;
  private int screenLength;
  private int maxOpSize;
  public Screen(){
    opcoes = new LinkedHashMap<String, String>();
    this.mensagens = new ArrayList<String>();
    screenLength = 80;
    maxOpSize = 20;
    title = "Teste";
    prompt = "Digite uma opcao:";
  }
  public void setOp(String nomeOp, String descOp){
    opcoes.put(nomeOp, descOp);
  }
  public void setTitulo(String titulo){
    title = titulo;
  }
  public void setPrompt(String prompt){
    title = prompt;
  }
  public String getPrompt(){
    return prompt;
  }
  
  public void zeraMsg(){
    this.mensagens = new ArrayList<String>();
  }
  public void addMsg(String s){
    this.mensagens.add(s); 
  }
  public void display(){
    System.out.print("\033\143");
    printSeparator();
    printTitle();
    printSeparator();
    for (String s: mensagens){
      printMsg(s);
    }
    printSeparator();
    for (Map.Entry<String, String> op: opcoes.entrySet()){
//      System.out.println(op.getKey() + ": " + op.getValue());
      printOption(op.getKey(), op.getValue());
    }
    printPrompt();
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
  private void printMsg(String msg){
    System.out.println(msg);
  }
  private void printPrompt(){
    System.out.print(prompt);
  }
}
