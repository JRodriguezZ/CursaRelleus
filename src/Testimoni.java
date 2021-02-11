public class Testimoni {
    private String nom;
    private boolean lliure;

    public Testimoni(String nom) {
        this.nom = nom;
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
