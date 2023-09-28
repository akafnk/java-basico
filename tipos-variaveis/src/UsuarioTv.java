public class UsuarioTv {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Esta no volume " + smartTv.volume);
        
        System.out.println("Canal atual " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual " + smartTv.canal);


        //System.out.println("A tv está ligada? " + smartTv.ligada);
        //System.out.println("Canal atual ? " + smartTv.canal);
        //System.out.println("Em que volume está? " + smartTv.volume);

        //smartTv.ligar();
        //System.out.println("A tv está ligada agora ? " + smartTv.ligada);

        //smartTv.desligar();
        //System.out.println("A tv está ligada agora ? " + smartTv.ligada);


    }
}
