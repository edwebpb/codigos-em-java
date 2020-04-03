package principal;

import conta.Conta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String pergunta;
        int resposta_int;
        String resposta_str;
        int ent_numconta = 0;
        double ent_valor = 0;
        String mensagem="";
        int resposta;
        double maiorsaldo=0.00;
        int maiorconta;

        ArrayList<Conta> conta = new ArrayList();

        pergunta = JOptionPane.showInputDialog("Deseja inserir quantas contas?");
        resposta = Integer.parseInt(pergunta);

        for (int i = 0; i < resposta; i++) {
            pergunta = JOptionPane.showInputDialog("Informe o numero da conta (0000000): ");
            ent_numconta = Integer.parseInt(pergunta);

            pergunta = JOptionPane.showInputDialog("Informe o valor a depositar (999.99): ");
            ent_valor = Double.parseDouble(pergunta);
            
            Conta contas=new Conta(ent_numconta,ent_valor);
            conta.add(contas);
        }
        
        for (Conta c:conta){
            mensagem +=c;
            if (maiorsaldo<c.getSaldo()){
                maiorsaldo=c.getSaldo();
                ent_numconta=c.getNumero_conta();
            }
        }
        mensagem+="Conta com maior valor: "+ent_numconta+" - Saldo: R$ "+maiorsaldo;
        System.out.println("mensaem: "+mensagem);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
