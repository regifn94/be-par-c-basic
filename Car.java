
public class Car {

    private int kapasitas;
    private String warna;
    private String tipe;

    public Car(String nama){
        System.out.println("Ini mobil " + nama);
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

class Main1{
    public static void main(String[] args) {
        Car sedan = new Car("Jazz");
//        sedan.testPanggil();
    }
}
