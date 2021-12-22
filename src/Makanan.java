package src;

public class Makanan {
  public String nama;
  public int level;
  public char ukuran;
  public boolean bungkus;
  public double harga;

  public Makanan (String newNama, int newLevel, char newUkuran, boolean isBungkus, double newHarga){
    nama = newNama;
    level = newLevel;
    ukuran = newUkuran;
    bungkus = isBungkus;
    harga = newHarga;
  }

  public void results(){
    String apakahBungkus = bungkus ? "Dibungkus" : "Makan Ditempat";
    System.out.println(nama + " " + level + " " + ukuran + " " + apakahBungkus + " " + harga);
  }
}
