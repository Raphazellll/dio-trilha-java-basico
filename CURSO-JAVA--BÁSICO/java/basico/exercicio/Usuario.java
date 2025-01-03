package exercicio;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        /*Volume inicial da TV */
        System.out.println("Volume ao inicializar a SmartTv: " + smartTv.volume) ;

        /* Mexendo no volume da TV */
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +smartTv.volume);
        
    /*=========================================================================== */ 

     /* Status da TV, se ligada ou não. */   
    smartTv.ligar();
    System.out.println("Novo Status: TV Ligada ? " +smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo Status: TV Ligada ? " +smartTv.ligada);

    /*========================================================================== */
        System.out.println("Canal de inicialização: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " +smartTv.canal);
}

    
 }
    
  
   

