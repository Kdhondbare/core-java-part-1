package inheritance;

public class DriverClass {

    public static void main(String[] args) {
        TataSafari tataSafari = new TataSafari(true, true);
        System.out.println(tataSafari.toString());

        MahaindraThar mahaindraThar =new MahaindraThar(true, false, true);
        System.out.println(mahaindraThar.toString());

        KiaSeltos kiaSeltos = new KiaSeltos(6, true, true);
        System.out.println(kiaSeltos.toString());
    }
}
