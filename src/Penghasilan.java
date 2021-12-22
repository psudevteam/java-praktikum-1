package src;

public class Penghasilan {
  public String namaBarang;
  public int totalPenghasilan;
  public int totalKerugian;
  public int sisaStok;

  public Penghasilan (String newBarang, int newTotalPenghasilan, int newTotalKerugian, int newSisaStok){
    namaBarang = newBarang;
    totalPenghasilan = newTotalPenghasilan;
    totalKerugian = newTotalKerugian;
    sisaStok = newSisaStok;
  }

  public void results(){
    System.out.println(namaBarang + " " + totalPenghasilan + " " + totalKerugian + " " + sisaStok);
  }
}
