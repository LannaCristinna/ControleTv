public class TV {
    private int canal;
    private int volume;

    // Construtor
    public TV() {
        this.canal = 1;  // Canal inicial
        this.volume = 10; // Volume inicial
    }

    // Método para mudar o canal
    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal <= 100) {  // Supondo que a TV tenha até 100 canais
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + novoCanal);
        } else {
            System.out.println("Canal inválido! O canal deve ser entre 1 e 100.");
        }
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume já no máximo.");
        }
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já no mínimo.");
        }
    }

    // Método para exibir o status da TV (canal e volume)
    public void exibirStatus() {
        System.out.println("Canal atual: " + canal);
        System.out.println("Volume atual: " + volume);
    }
}
