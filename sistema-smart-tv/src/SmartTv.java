public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;                           // volume++ é igual a volume = volume + 1
        System.out.println("Aumentando para: ");
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo para: ");
    }

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }
}