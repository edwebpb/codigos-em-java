package visao;

import javax.swing.JOptionPane;

public class Calculadora {

	public static String gerarTabuada(int v) {
		
		String retorno=" ";
		for (int i=0;i<11;i++) {
			retorno+="\n"+i+"*"+v+" = "+(i*v);
			//System.out.println(i+"*"+v+" = "+(i*v));
		}
		return retorno;
	}
	public static void main(String[] args) {
		int valor;
		String valorS;
		String saida;
		
		valorS=JOptionPane.showInputDialog("Digite o valor: ");
		valor = Integer.parseInt(valorS);
		
		saida=gerarTabuada(valor);
		JOptionPane.showMessageDialog(null, saida);
		
		System.out.println(saida);
	}
}
