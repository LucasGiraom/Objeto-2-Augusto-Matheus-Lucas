public class Nomes  {
    static int lChegada = 100;

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        Grilos grilo1 = new Grilos("Carlos", lChegada);
        Grilos grilo2 = new Grilos("joão", lChegada);
        Grilos grilo3 = new Grilos("Augusto", lChegada);
        Grilos grilo4 = new Grilos("Matheus", lChegada);
        Grilos grilo5 = new Grilos("Lucas", lChegada);


    }

}