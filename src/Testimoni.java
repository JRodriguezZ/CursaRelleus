public class Testimoni {
    private String nom;
    private boolean lliure;

    public Testimoni(String nomEquip) {
        this.nom = nomEquip;
        lliure = true;
    }

    public synchronized void agafar() {
        while (!lliure){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lliure = false;
    }

    public synchronized void deixar() {
        lliure = true;
        notifyAll();
    }
}
