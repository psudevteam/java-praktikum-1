package src;

public class Penjual {
  public String nama;
  public String namaBarang;
  public int stok;
  public char kelamin;
  public double harga;

  public Penjual (String newNama, String newBarang, int newStok, char newKelamin, double newHarga){
    nama = newNama;
    namaBarang = newBarang;
    stok = newStok;
    kelamin = newKelamin;
    harga = newHarga;
  }

  public void results(){
    System.out.println(nama + " " + namaBarang + " " + stok + " " + kelamin + " " + harga);
  }
}
