public class Wyswietlanie {
    public static void main(String[] args) {
        Rower rower1 = new Rower();
        rower1.kolor = "czarny";
        rower1.marka = "CUBE";
        rower1.lampki = true;

        Rower rower2 = new Rower();
        rower2.kolor = "biały";
        rower2.marka = "CUBE";
        rower2.lampki = false;


        System.out.println("Rower1");
        System.out.println("Marka: " + rower1.marka);
        System.out.println("Kolor: " + rower1.kolor);
        System.out.println("Czy posiada oswietlenie: " + rower1.lampki);
        System.out.println("Rower2");
        System.out.println("Marka: " + rower2.marka);
        System.out.println("Kolor: " + rower2.kolor);
        System.out.println("Czy posiada oswietlenie: " + rower2.lampki);
    }


}
