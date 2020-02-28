/*
1. Faça um programa em Java, que resolva uma equação de 2o grau (ax2+bx+c = 0). O usuário deve digitar os valores de a, b e c.
Para isso, implemente a entrada de dados com Scanner ou JOptionPane.
 */

package com.edsonfsilva.ted01;

public class ProgramaEquacao {
    private float resultadoequacaopositivo;
    private float resultadoequacaonegativo;
    private float delta;
    
    void calculaEquacao(float a,float b,float c){
        //Δ = b² – 4ac
        this.delta=(b*b) - (4*(a*c));
        //x=-b+-raiz de Δ / 2a
        this.resultadoequacaopositivo=(float) ((-1*b)+(Math.sqrt(this.delta)))/(2*a);
        this.resultadoequacaonegativo=(float) ((-1*b)-(Math.sqrt(this.delta)))/(2*a);
    }
    
    public float getDelta(){
        return this.delta;
    }
    public float getResultadoequacaopositivo() {
        return (float) this.resultadoequacaopositivo;
    }
    
    public float getResultadoequacaonegativo() {
        return (float) this.resultadoequacaonegativo;
    }
}
