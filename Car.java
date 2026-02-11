
public class Car {

    private int kapasitas;
    private String warna;
    private String tipe;

    public Car(){

    }

    public Car(String tipe){
        this("Merah", tipe);
    }

    public Car(String warna, String tipe){
        this.warna = warna;
        this.tipe = tipe;
    }

    public void printInfo() {
        System.out.println(warna + " " + tipe);
    }

    public void Sound(){
        System.out.println("Beep Beep Beep");
    }

    public void testPanggil(){
        System.out.println("Ini test");
    }
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

}

class Sedan extends Car{

    public Sedan(){
        super();
    }

    public Sedan(String tipe) {
        super(tipe);
    }

    public Sedan(String warna, String tipe) {
        super(warna, tipe);
    }
}

class Main1{
    public static void main(String[] args) {
        Sedan ss = new Sedan();
        ss.Sound();
    }
}
