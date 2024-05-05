public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada: " + smartTv.ligada);

        smartTv.digitarCanal(5);
        System.out.println("Novo Status - Canal Atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status - Canal Atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo Status - Canal Atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status - Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status - Volume Atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada: " + smartTv.ligada);

    }

}
