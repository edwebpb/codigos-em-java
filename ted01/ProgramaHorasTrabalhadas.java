/*
2. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

a. salário bruto.
b. quanto pagou ao IPRF
c. quanto pagou ao INSS.
d. quanto pagou ao sindicato.
e. o salário líquido.
f. o valor descontado.
*/

package com.edsonfsilva.ted01;

public class ProgramaHorasTrabalhadas {
    private float salariobruto;
    private float salarioliquido;
    private final float irpf;
    private final float inss;
    private final float sindicato;
    private float vlrdesconto;

    public ProgramaHorasTrabalhadas() {
        this.irpf = 0.11f;
        this.inss = 0.08f;
        this.sindicato = 0.05f;
    }
    
    void calcularSalario(float ganhohoras,float qtdhorasmes){
        this.salariobruto=ganhohoras*qtdhorasmes;
        this.vlrdesconto=this.salariobruto*(this.irpf+this.inss+this.sindicato);
        this.salarioliquido=this.salariobruto-this.vlrdesconto;
    }

    public float getSalariobruto() {
        return this.salariobruto;
    }
    public float getSalarioliquido() {
        return (float) this.salarioliquido;
    }
    public float getVlrdesconto() {
        return this.vlrdesconto;
    }
    public float getIrpf(){
        return this.salariobruto*this.irpf;
    }
    public float getInss(){
        return this.salariobruto*this.inss;
    }
    public float getSindicato(){
        return this.salariobruto*this.sindicato;
    }
}
