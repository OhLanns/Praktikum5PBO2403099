public class HewanTest {
    public static void main(String[] args) {
        Hewan h1 = new Serigala("Ancikoy", 5);
        Hewan h2 = new Burung("toto", 2);

        h1.suara();
        h2.suara();

        h1.makan();
        h2.makan();

        h1.info();
        h2.info();
    }
}



