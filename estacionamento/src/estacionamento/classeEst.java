package estacionamento;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class classeEst {
    
    public String modelo;
    public String placa;
    public String cor;
    public double entrada;
    public double saida;
    public double total;
    public double tempo;
    
    //Início Getter e Setter

    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getEntrada() {
        return entrada;
    }
    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }
    public double getSaida() {
        return saida;
    }
    public void setSaida(double saida) {
        this.saida = saida;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    //Fim Getter e Setter
    
    public double tempo(double entrada, double saida){
        if (this.entrada>24 || this.entrada<0 || this.saida>24 ||this.saida<0) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite um horario válido");
            System.exit(0);
        }else{
            this.tempo = this.saida - this.entrada;
        }
        return this.tempo;
        
    }
    public double total(double tempo){
        this.total = Math.ceil(this.tempo)*4;
        return this.total;
    }
   

    public void notinha(String modelo, String placa, String cor, double entrada, double saida, double tempo, double total) {
        
        DecimalFormat horas = new DecimalFormat("00.00");
        DecimalFormat din = new DecimalFormat("#0.00");
        
        JOptionPane.showMessageDialog(null, "NOTINHA:"
                + "\n\nModelo do carro: "
                + this.modelo
                + "\nPlaca: "
                + this.placa
                + "\nCor: "
                + this.cor
                + "\nHora de entrada: "
                + horas.format(this.entrada)
                + "\nHora de saída: "
                + horas.format(this.saida)
                + "\nTempo gasto: "
                + horas.format(this.tempo)
                + "\nTempo em horas cheias: "
                + horas.format(Math.ceil(this.tempo))
                + "\n\nTotal a pagar: R$"
                + din.format(this.total)
        );
    }
  
}
