import src.Makanan;
import src.Minuman;
import src.Pembeli;
import src.Penjual;
import src.Penghasilan;

public class Tugas {
   
   public static void main(String[] args){
     Makanan seblak = new Makanan("Seblak Ceker", 5, 'L', true, 12000);
     seblak.results();

     Minuman nutrisari = new Minuman("Nutrisari Jeruk Nipis", 5, 'L', false, 5000);
     nutrisari.results();

     Pembeli maul = new Pembeli("Maulana Sodiqin", 19, 'L', 20000);
     maul.results();

     Penjual fenny = new Penjual("Fenny Oktaviani", "Seblak Ceker", 19, 'L', 20000);
     fenny.results();

     Penghasilan data = new Penghasilan("Data 2021", 2000000, 1200000, 200);
     data.results();
   }
}
