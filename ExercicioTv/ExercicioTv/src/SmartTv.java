public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudaCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void ligaDesliga(boolean estado) {
        ligada = !estado;
    }

    public void aumentarAbaixarVolume(String qual) {
        if (qual == "+") {
            volume++;
        } else {
            volume--;
        }
    }

    public void aumentarAbaixarCanal(String qual) {
        if (qual == "+") {
            canal++;
        } else {
            canal--;
        }
    }
}