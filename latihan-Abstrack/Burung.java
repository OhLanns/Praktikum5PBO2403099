
public class Burung extends Hewan {
    public Burung(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void suara() {
        System.out.println(nama + " berkicau: Witwiw!");
    }
    
    

}



