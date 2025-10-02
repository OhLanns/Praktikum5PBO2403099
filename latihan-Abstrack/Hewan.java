abstract class Hewan {
public String nama;
private int umur;

public Hewan() { }

public Hewan(String nama,int umur) {
    this.nama = nama;
    this.umur = umur;
}

abstract void suara();

void makan() {
    System.out.println(nama + " sedang makan");
}

public int getUmur() {
    return umur;
}

public void setUmur(int umur) {
    this.umur = umur;
}

public void info() {
    System.out.println(nama + " berusia " + umur + " tahun");
}

}


