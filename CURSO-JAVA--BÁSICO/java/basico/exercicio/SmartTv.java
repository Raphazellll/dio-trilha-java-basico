package exercicio;

public class SmartTv {
      /*Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
        1. Ela tenha as características: Ligar (boolean), canal (int) e volume (int).
        2. Nossa TV podedrá ligar e desligar e assim mudar o estado ligada.
        3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1.
        4. Nossa TV podedrá mudar de canal de 1 em 1 ou definindo o número correspondente.
     */
  
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    /*============================================================================================ */  
    public void aumentarVolume(){
        volume++; /*volume = volume +1*/
    }
    public void diminuirVolume(){
        volume--; /*volume = volume -1*/
    }
    public void ligar(){
        ligada = true;   
    }

    public void desligar(){
        ligada=false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    
    

}
    

