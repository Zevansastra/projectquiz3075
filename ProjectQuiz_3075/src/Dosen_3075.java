public class Dosen_3075 extends Penduduk_3075 {
    String nidn_3075;
    String gol_3075;
    int gajiPokok_3075 = 5500000;
    double totalGaji;
    int tunjangan;
  
    public double totalPendapatan_3075 () {
      if (gol_3075 == "IIIA") {
        tunjangan = 300000;
      }
      else if (gol_3075 == "IIIB") {
        tunjangan = 500000;
      }
      else if (gol_3075 == "IIIC") {
        tunjangan = 700000;
      }
      return totalGaji = gajiPokok_3075 + tunjangan;
    }
  
    public void tampilDataDosen_3075_1 () {
      super.tampilDataPenduduk_3075();
      System.out.println("NIK                   : " + nik_3075);
      System.out.println("Nama                  : " + nama_3075);
      System.out.println("Umur                  : " + umur_3075);
      System.out.println("Alamat                : " + alamat_3075);
      System.out.println("NIDN                  : " + nidn_3075);
      System.out.println("Golongan              : " + gol_3075);
      System.out.println("Gaji Pokok            : " + gajiPokok_3075);
    }
  
    public void tampilDataDosen_3075_2 () {
      super.tampilDataPenduduk_3075();
      System.out.println("NIK                   : " + nik_3075);
      System.out.println("Nama                  : " + nama_3075);
      System.out.println("Umur                  : " + umur_3075);
      System.out.println("Alamat                : " + alamat_3075);
      System.out.println("NIDN                  : " + nidn_3075);
      System.out.println("Golongan              : " + gol_3075);
      System.out.println("Gaji Pokok            : " + gajiPokok_3075);
    }
  }
  