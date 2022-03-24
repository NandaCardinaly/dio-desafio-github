/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernanda Cardinaly 
 *  Resolvendo uma questão sobre conta bancária e investimentos
 * Linguagem: Java
 */
import java.util.Scanner;
public class QuestaoInvestimento {
    public static void main(String[] args) {
       double rendimento_mensal, juros=0;
       double total_investido=0;
       double juros_total=0;
       Scanner ler =  new Scanner(System.in); 
       
       
       System.out.println("Digite o código do cliente: ");
       int cod_cliente=ler.nextInt();
       
       
       if (cod_cliente>0){
       System.out.println("Qual é o tipo de conta? ");
       System.out.println(" 1- Poupança \n 2- Poupança Plus \n 3- Fundo de renda fixa ");
       int tipo_conta = ler.nextInt();
             
       System.out.println("Qual é o valor investido? ");
       double valor_investido=ler.nextDouble();
       total_investido = total_investido + valor_investido;
       
       if (tipo_conta==1) {
           juros=1.015;
       }
       
       if (tipo_conta==2) {
           juros=1.02;
       }
       
       if (tipo_conta==3) {
           juros=1.04;
       }
         
       rendimento_mensal = valor_investido * juros;
       juros_total = juros_total + rendimento_mensal;
       
       System.out.print(" Cliente: " +cod_cliente+ "\n Valor Investido: " +valor_investido+"\n Rendimento mensal: "+rendimento_mensal+ "\n Total investido: "+total_investido+"\n Total de juros pago: "+juros_total);
       
       
        }
       
       
        else{
            System.out.println("Obrigado por utilizar nossos serviços. ");
        }
    }
}


