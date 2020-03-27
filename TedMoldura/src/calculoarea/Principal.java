package calculoarea;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        String pergunta;
	String saida;
        float largura_externa;
        float largura_interna;
        float altura_externa;
        float altura_interna;
        float largura;
        
	pergunta=JOptionPane.showInputDialog("Olá, digite o número de quais informações possui para calcular área? \n "
                + "1 - Tenho área externa + medida interna \n "
                + "2 - Tenho área interna + medida externa \n "
                + "3 - Tenho área externa + área interna");
        opcao = Integer.parseInt(pergunta);
            switch(opcao){
                case 1:
                    pergunta=JOptionPane.showInputDialog("Informe a largura externa");
                    largura_externa=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a altura externa");
                    altura_externa=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a medida interna");
                    largura=Float.parseFloat(pergunta);
                    
                    CalculaArea areamaior=new CalculaArea(largura_externa,altura_externa);
                    areamaior.setArea();
                    CalculaArea areamenor=new CalculaArea(largura_externa,altura_externa,true,largura);
                    areamenor.setArea();
                    Moldura moldura=new Moldura(areamaior.getArea(),areamenor.getArea());
                    JOptionPane.showMessageDialog(null, "A área da moldura é de "+moldura.getAreaMoldura());
                    break;
                case 2:
                    pergunta=JOptionPane.showInputDialog("Informe a largura interna");
                    largura_interna=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a altura interna");
                    altura_interna=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a medida externa");
                    largura=Float.parseFloat(pergunta);
                    
                    CalculaArea areamenor_int=new CalculaArea(largura_interna,altura_interna);
                    areamenor_int.setArea();
                    CalculaArea areamaior_int=new CalculaArea(largura_interna,altura_interna,true,largura);
                    areamaior_int.setArea();
                    Moldura moldura_int=new Moldura(areamaior_int.getArea(),areamenor_int.getArea());
                    JOptionPane.showMessageDialog(null, "A área da moldura é de "+moldura_int.getAreaMoldura());
                    break;
                case 3:
                    pergunta=JOptionPane.showInputDialog("Informe a largura externa");
                    largura_externa=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a altura externa");
                    altura_externa=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a largura interna");
                    largura_interna=Float.parseFloat(pergunta);
                    pergunta=JOptionPane.showInputDialog("Informe a altura interna");
                    altura_interna=Float.parseFloat(pergunta);
                    
                    CalculaArea area_externa=new CalculaArea(largura_externa,altura_externa);
                    area_externa.setArea();
                    
                    CalculaArea area_interna=new CalculaArea(largura_interna,altura_interna);
                    area_interna.setArea();
                    Moldura calculamoldura=new Moldura(area_externa.getArea(),area_interna.getArea());
                    JOptionPane.showMessageDialog(null, "A área da moldura é de "+calculamoldura.getAreaMoldura());
                    break;
            } 
    }
}
