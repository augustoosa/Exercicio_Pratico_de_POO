// Augusto da Silva de Sá - RA: 2564319
public class Motor {

    // Atributos
    private int qtdPistoes;
    private int potencia;

    // Construtor Default
    public Motor() {
        this.qtdPistoes = 0;
        this.potencia = 0;
    }

    // Construtor com Sobrecarga
    public Motor(int qtdPistoes, int potencia) {
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }

    // Getters e Setters
    public int getQtdPistoes() {
        return qtdPistoes;
    }

    public void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
