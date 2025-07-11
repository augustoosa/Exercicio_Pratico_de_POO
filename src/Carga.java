// Augusto da Silva de Sá - RA: 2564319
public class Carga extends Veiculo implements Calc {

    // Atributos
    private int tara;
    private int cargaMax;

    // Construtor Default
    public Carga() {
        super();
        this.tara = 0;
        this.cargaMax = 0;
    }

    // Construtor com Sobrecarga
    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

    // Método calcVel herdado de Veiculo
    public int calcVel() {
        return getVelocMax() - cargaMax;
    }

    // Implementação da interface Calc
    public int calcular() {
        return cargaMax - valor_base;
    }

    // Getters e Setters
    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
}
