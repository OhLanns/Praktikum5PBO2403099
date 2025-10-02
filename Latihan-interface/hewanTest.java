public class hewanTest {
    public static void main(String[] args) {
        Serigala serigala1 = new Serigala("Pinky", 2);  // buat objek babi

        serigala1.bersuara();
        serigala1.tidur();

        // akses atribut nama (public)
        System.out.println("Nama hewan: " + serigala1.nama);

        // akses umur lewat getter
        System.out.println("Umur hewan: " + serigala1.getUmur() + " tahun");
    }
}
