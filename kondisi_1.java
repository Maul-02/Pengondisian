public class kondisi_1 {
    public static void main(String[] args) {
        int usia = 19;
        double totalBelanja = 149000;

        if (usia < 18){
            System.out.println("Akses dibatasi: Di bawah 18 tahun.");
        } else if (totalBelanja >= 150000) {
            System.out.println("Akses diberikan + Diskon 15%");
        } else {
            System.out.println("Akses diberikan, tanpa diskon");
        }
    }
    
}