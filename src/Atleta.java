public class Atleta extends Thread {

    Testimoni t;

    public Atleta(String num, Testimoni testimoni) {
        super(num);
        t = testimoni;
    }

    @Override
    public void run() {
        for (;;) {
            t.agafar();
            System.out.print(getName() + " corre amb el testimoni durant ");
            int temps = (int) (Math.random()*3000 + 3000);
            try {
                Thread.sleep(temps);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.deixar();
        }
    }
}
