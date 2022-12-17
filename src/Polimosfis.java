public class Polimosfis {
    /**
     * @param args the command line arguments
     */
    // Method sama namun parameter berbeda
    // Tipe data double
    // method menghitung luas dengan jari-jari
    static float luas(float r) {
        return (float) (Math.PI * r * r);
    }

    // method menghitung luas dengan diameter
    static double luas(double d) {
        return (double) (1 / 4 * Math.PI * d);
    }

    static double maxNumber(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Method sama, namun parameter berbeda
    // Tipe data int
    static int maxNumber(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Intinya Polymorphism dalam sebuah class memiliki method yang sama");
        System.out.println("namun parameter dan tipe data yang berbeda");
        System.out.println("Inilah yang disebut polimorfisme statis\n\n");
        System.out.println("Method Tipe data double");
        System.out.println(maxNumber(5.5, 7.5));
        System.out.println("\n\n Method Tipe data Integer ");
        System.out.println(maxNumber(10, 20));
        System.out.println("\n\nIntinya Polymorphism dalam sebuah class memiliki method yang sama");
        System.out.println("namun parameter dan tipe data yang berbeda");
        System.out.println("Inilah yang disebut polimorfisme statis");
        System.out.println("\n\n Method Tipe data double");
        System.out.println(luas(55.577));
        System.out.println("\n\nMethod Tipe data float");
        System.out.println(luas(120.5));
    }
}
