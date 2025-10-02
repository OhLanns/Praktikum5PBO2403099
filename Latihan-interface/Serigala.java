public class Serigala {
    public String nama;   // public
    private int umur;     // private

    // Konstruktor
    public Serigala(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    public void bersuara() {
        System.out.println(nama + " (usia " + umur + " tahun) berkata: wek wek");
    }

    
    public void tidur() {
        System.out.println(nama + " sedang tidur... Zzz");
    }
}

