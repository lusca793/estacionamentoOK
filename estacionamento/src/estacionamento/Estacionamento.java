package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        
        classeEst dados = new classeEst();
        
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro: "));
        dados.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
        dados.setEntrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada:\n Escreva: hora.minuto")));
        dados.setSaida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de sada:\nEscreva: hora.minuto")));
       
        dados.tempo(dados.getEntrada(),dados.getSaida());
        dados.total(dados.getTempo());
        dados.notinha(dados.getModelo(),dados.getPlaca(),dados.getCor(),dados.getEntrada(),dados.getSaida(),dados.getTempo(),dados.getTotal());
    }
}