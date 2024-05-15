public class Autodromo {
public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("455654");
    jeep.ligar();

    Moto xtz = new Moto();
    xtz.setChassi("43535");
    xtz.ligar();

    Veiculo coringa = xtz;
    coringa.ligar();
    

}
}
