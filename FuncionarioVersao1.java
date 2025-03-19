//Versao solicitando ao usuario

import java.util.Scanner;

public class FuncionarioVersao1 {
    public String nome;
    public int anoContratacao;
    public double salario;

    FuncionarioVersao1(String nome, int anoContratacao, double salario){
        this.nome = nome;
        this.anoContratacao = anoContratacao;
        this.salario = salario;
    }

    //modificadores
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoContratacao(int anoContratacao){
        this.anoContratacao = anoContratacao;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


    //Acessam
    public String getNome(){
        return nome;
    }
    public int getAnoContratacao(){
        return anoContratacao;
    }
    public double getSalario(){
        return salario;
    }

    public static void main(String[] args)  {
       Scanner entrada = new Scanner(System.in);
    
       System.out.print("Digite o nome:");
       String nome = entrada.nextLine();

       System.out.println("Digite o ano de contratacao:");
       int anoContratacao = entrada.nextInt();

       System.out.println("Digite o salario:");
       double salario = entrada.nextDouble();


       FuncionarioVersao1 f1 = new FuncionarioVersao1(nome, anoContratacao,salario);

       System.out.println("´------DADOS FUNCIONARIOS------");
       System.out.println("NOME:"+ f1.getNome());
       System.out.println("CONTRATACAO:" + f1.getAnoContratacao());
       System.out.println("SALARIO R$:" + f1.getSalario());


       
       entrada.close();
    }
}
