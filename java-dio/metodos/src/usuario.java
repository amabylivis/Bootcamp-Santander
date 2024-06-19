public class usuario {
    public static void main(String[] args) {
        
        smartTv smartTv = new smartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Nova Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Nova Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.selecionarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
