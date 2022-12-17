public class App {
    public static void main(String[] args) throws Exception {
        BangunanDatar bangunDatar = new BangunanDatar();
        Persegi segitiga = new Persegi(6, 3);
        Lingkaran lingkaran = new Lingkaran(50);
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println("\n\nkeliling segi tiga: " + segitiga.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("\n\nLuas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());

    }
}
