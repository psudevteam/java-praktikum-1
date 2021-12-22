package src;

public class Pembeli {
  public String nama;
  public int umur;
  public char kelamin;
  public double uang;

  public Pembeli (String newNama, int newUmur, char newKelamin, double newUang){
    nama = newNama;
    umur = newUmur;
    kelamin = newKelamin;
    uang = newUang;
  }

  public void results(){
    System.out.println(nama + " " + umur + " " + kelamin + " " + uang);
  }
}
