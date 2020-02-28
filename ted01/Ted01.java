package com.edsonfsilva.ted01;

import java.util.Scanner;

public class Ted01 {
    public static void main(String[] args){
        
        Scanner start=new Scanner(System.in);
        System.out.println("Informe o numero do exercicio: 1 ou 2 ?");
        int opcao=start.nextInt();
        
        switch(opcao){
            case 1:
                ProgramaEquacao equacao = new ProgramaEquacao();
                Scanner valor3=new Scanner(System.in);
                System.out.println("Informe valor de a:");
                float calcula3=valor3.nextFloat();
                
                Scanner valor4=new Scanner(System.in);
                System.out.println("Informe valor de b:");
                float calcula4=valor4.nextFloat();
                
                Scanner valor5=new Scanner(System.in);
                System.out.println("Informe valor de c:");
                float calcula5=valor5.nextFloat();
                
                equacao.calculaEquacao(calcula3, calcula4, calcula5);
                
                if (equacao.getDelta()>=0){
                    System.out.println("O valor da equação positiva é "+equacao.getResultadoequacaopositivo());
                    System.out.println("O valor da equação negativa é "+equacao.getResultadoequacaonegativo());
                } else {
                    System.out.println("Não possui raizes reais");
                }
                
                valor3.close();
                valor4.close();
                valor5.close();
                break;
            case 2:
                ProgramaHorasTrabalhadas calcula = new ProgramaHorasTrabalhadas();
                
                Scanner valor1=new Scanner(System.in);
                System.out.println("Informe valor da hora trabalhada: xxx,xx");
                float calcula1=valor1.nextFloat();
                
                Scanner valor2=new Scanner(System.in);
                System.out.println("Informe a quantidade de horas: ");
                float calcula2=valor2.nextFloat();
                
                calcula.calcularSalario(calcula1,calcula2);
                System.out.println("O salario liquido a receber é de R$ "+calcula.getSalarioliquido());
                
                valor1.close();
                valor2.close();
                break;
            default:
                System.out.println("Escolheu Errado!");
                break;
        }
        
        start.close();
    }
}
