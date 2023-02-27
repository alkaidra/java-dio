public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal? " + smartTv.canal);
        System.out.println("Volume? " + smartTv.volume);
        
        smartTv.ligaDesliga(smartTv.ligada);
        System.out.println("Tv ligada? " + smartTv.ligada);
        smartTv.ligaDesliga(smartTv.ligada);
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.aumentarAbaixarVolume("+");
        smartTv.aumentarAbaixarVolume("+");
        smartTv.aumentarAbaixarVolume("+");
        System.out.println("Volume? " + smartTv.volume);
        smartTv.aumentarAbaixarVolume("-");
        System.out.println("Volume? " + smartTv.volume);

        smartTv.mudaCanal(45);
        System.out.println("Canal? " + smartTv.canal);
        smartTv.aumentarAbaixarCanal("+");
        System.out.println("Canal? " + smartTv.canal);
        smartTv.aumentarAbaixarCanal("-");
        smartTv.aumentarAbaixarCanal("-");
        System.out.println("Canal? " + smartTv.canal);


    }
}
