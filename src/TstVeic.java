// Augusto da Silva de Sá - RA: 2564319
public class TstVeic {

    public static void main(String[] args) {

        //________Class Loader - Instanciacao dos objetos_____________
        Leitura l = Leitura.geraLeitura();
        Passeio p1 = new Passeio();
        Carga c1 = new Carga();
        //____________________________________________________________

        //________Coleta dos dados para p1__________________________________________________

        System.out.println("\nVeículo de Passeio 1...");

        //teste para dados comuns

        p1.setCor(l.entDados("Digite a cor:"));
        p1.setVelocMax(Integer.parseInt(l.entDados("Digite a velocidade máxima (km/h):")));

        //teste para dados unicos
        p1.setQtdePassageiro(Integer.parseInt(l.entDados("Digite a quantidade de passageiros:")));
        
        //teste para dados do motor de p1
        p1.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Digite a quantidade de pistões do motor:")));
        //____________________________________________________________________________________

        //________Coleta dos dados para c1__________________________________________________

        System.out.println("\nVeículo de Carga 1...");

        //teste para dados comuns
        c1.setCor(l.entDados("Digite a cor:"));
        c1.setVelocMax(Integer.parseInt(l.entDados("Digite a velocidade máxima (km/h):")));

        //teste para dados unicos
        c1.setTara(Integer.parseInt(l.entDados("Digite a tara:")));
        c1.setCargaMax(Integer.parseInt(l.entDados("Digite a carga máxima:")));

        //teste para dados do motor de c1
        c1.getMotor().setPotencia(Integer.parseInt(l.entDados("Digite a potência do motor:")));
        //___________________________________________________________________________________________

        //________Exibição dos dados__________________________________
        System.out.println("\n=====Veículo de Passeio=====");
        System.out.println("Cor: " + p1.getCor());
        System.out.println("Velocidade Máx (km/h): " + p1.getVelocMax());
        System.out.println("Passageiros: " + p1.getQtdePassageiro());
        System.out.println("Motor (Pistões): " + p1.getMotor().getQtdPistoes());
        System.out.println("Velocidade máx (reduzida devido a qtd de passageiros): " + p1.calcVel());
        System.out.println("Velocidade máx + valor base (10): " + p1.calcular());

        System.out.println("\n=====Veículo de Carga=====");
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Velocidade Máx (km/h): " + c1.getVelocMax());
        System.out.println("Tara: " + c1.getTara());
        System.out.println("Carga Máx: " + c1.getCargaMax());
        System.out.println("Motor (Potência): " + c1.getMotor().getPotencia());
        System.out.println("Velocidade máx considerando uma carga máx: " + c1.calcVel());
        System.out.println("Carga Max - valor base (10): " + c1.calcular());
        //____________________________________________________________
    }
}

