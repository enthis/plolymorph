public class Persegi extends BangunanDatar {
    int alas;
    int tinggi;

    public Persegi(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return this.alas * this.tinggi;
    }

    @Override
    public float keliling() {
        return (float) (5.5 * this.alas * this.tinggi);
    }
}
