package src;

public class Minuman {
  public String nama;
  public int jumlah;
  public char ukuran;
  public boolean bungkus;
  public double harga;

  public Minuman (String newNama, int newJumlah, char newUkuran, boolean isBungkus, double newHarga){
    nama = newNama;
    jumlah = newJumlah;
    ukuran = newUkuran;
    bungkus = isBungkus;
    harga = newHarga;
  }

  public void results(){
    String apakahBungkus = bungkus ? "Dibungkus" : "Minum Ditempat";
    System.out.println(nama + " " + jumlah + " " + ukuran + " " + apakahBungkus + " " + harga);
  }
}
