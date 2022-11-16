public class Mahasiswa_3075 extends Penduduk_3075 {
    String nim_3075;
    float ipk_3075;
    boolean beasiswa_3075;
  
    public void tampilDataMahasiswa_3075 () {
      super.tampilDataPenduduk_3075();
      System.out.println("NIK                 : " + nik_3075);
      System.out.println("Nama                : " + nama_3075);
      System.out.println("Umur                : " + umur_3075);
      System.out.println("Alamat              : " + alamat_3075);
      System.out.println("NIM                 : " + nim_3075);
      System.out.println("IPK                 : " + ipk_3075);
      tampilDataBeasiswa_3075();
    }
  
    public void tampilDataMahasiswa_3075_2 () {
      super.tampilDataPenduduk_3075();
      System.out.println("NIK                 : " + nik_3075);
      System.out.println("Nama                : " + nama_3075);
      System.out.println("Umur                : " + umur_3075);
      System.out.println("Alamat              : " + alamat_3075);
      System.out.println("NIM                 : " + nim_3075);
      System.out.println("IPK                 : " + ipk_3075);
      tampilDataBeasiswa_3075();
    }
  
    public void tampilDataBeasiswa_3075 () {
      if (ipk_3075 > 3.5) {
        beasiswa_3075 = true;
        System.out.println("Mahasiswa bernama " + nama_3075 + " berhak mendapatkan beasiswa");
      }
      else if (ipk_3075 < 3.5) {
        beasiswa_3075 = false;
        System.out.println("Mahasiswa bernama " + nama_3075 + " tidak berhak mendapatkan beasiswa");
      }
    }
  }
  