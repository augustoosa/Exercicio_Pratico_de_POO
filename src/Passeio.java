// Augusto da Silva de Sá - RA: 2564319
public class Passeio extends Veiculo implements Calc {

    // Atributo
    private int qtdePassageiro;

    // Construtor Default
    public Passeio() {
        super();
        this.qtdePassageiro = 0;
    }

    // Construtor com Sobrecarga
    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdePassageiro) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        this.qtdePassageiro = qtdePassageiro;
    }

    // Método calcVel herdado de Veiculo
    //Calcula 
    public int calcVel() {
        return getVelocMax() - qtdePassageiro;
    }

    // Implementação da interface Calc
    public int calcular() {
        return getVelocMax() + valor_base;
    }

    // Getters e Setters
    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }
}

