public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudou para o canal " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudou para o canal " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudou para o canal " + canal);
    }

    public void ligarTv(){
        ligada = true;
        System.out.println("TV foi Ligada");
    }

    public void desligarTv(){
        ligada = false;
        System.out.println("TV foi Desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    
}
