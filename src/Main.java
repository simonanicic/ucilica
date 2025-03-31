public class Main {

    public static void main(String[] args) {
        Krug krug = new Krug("krug",3.2);
        Pravokutnik pravokutnik = new Pravokutnik("pravokutnik",2,3);
        Trokut trokut = new Trokut("trokut",2,3,4);
        System.out.println(krug.toString());
        System.out.println(pravokutnik.toString());
        System.out.println(trokut.toString());
    }
}
