public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }
    public void selecionarCanal(int novoCanal){
        canal = novoCanal;
    }
}
