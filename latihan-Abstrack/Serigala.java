public class Serigala extends Hewan {
    public Serigala(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void suara() {
        System.out.println(nama + " melolong: Auuuuu!");
    }
}


