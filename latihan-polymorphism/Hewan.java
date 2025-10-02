public class Hewan {
    public int usia;
    private String nama;

    public Hewan(){

    }

    public Hewan(int usia, String nama){
        this.usia=usia;
        this.nama=nama;
    }

     public Hewan( String nama, int usia){
        this.usia=usia;
        this.nama=nama;
    }

     public Hewan( String nama){
        this.nama=nama;
    }

    public Hewan( int usia){
        this.usia=usia;
        
    }

    public void berkomunikasi(){
        System.out.println(" Hewan Berusia "+this.usia+" Tahun, hewan dengan nama "
        +this.nama+" berkomunikasi ");
    }

    
}

