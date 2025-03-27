public class Main {

    public static void main(String[] args) {
        Krug krug = new Krug(3.2);
        Pravokutnik pravokutnik = new Pravokutnik("pravi",2,3);
        Trokut trokut = new Trokut("trok",2,3,4);
        System.out.println(krug.getRadijus() + ", " + pravokutnik.getNaziv() + ", " + trokut.getNaziv());
        System.out.println(pravokutnik.getStranicaA() + ", " + trokut.getStranicaA());
        System.out.println(pravokutnik.getStranicaB() + ", " + trokut.getNaziv());
    }
}
