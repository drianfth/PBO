
public class Tes
{
    public static void main (String args[])
    {
        //Truk1
        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        System.out.println("Truk 1\n");
        System.out.println("Jumlah Roda \t\t= " + truk1.getJmlRoda());
        System.out.println("Warna \t\t\t= " + truk1.getWarna());
        System.out.println("Bahan Bakar \t\t= " + truk1.getBahanBakar());
        System.out.println("Kapasitas Mesin \t= " + truk1.getKapasitasMesin());
        System.out.println("Maksimal Muatan \t= " + truk1.getMuatanMaks());

        System.out.println("_______________________________________________");
        //Truk2
        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);

        System.out.println("Truk 2\n");
        System.out.println("Jumlah Roda \t\t= " + truk2.getJmlRoda());
        System.out.println("Warna \t\t\t= " + truk2.getWarna());
        System.out.println("Bahan Bakar \t\t= " + truk2.getBahanBakar());
        System.out.println("Kapasitas Mesin \t= " + truk2.getKapasitasMesin());
        System.out.println("Maksimal Muatan \t= " + truk2.getMuatanMaks());

        System.out.println("_______________________________________________");
        //Taksi1
        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        System.out.println("Taksi 1\n");
        System.out.println("Jumlah Roda \t\t= " + taksi1.getJmlRoda());
        System.out.println("Warna \t\t\t= " + taksi1.getWarna());
        System.out.println("Bahan Bakar \t\t= " + taksi1.getBahanBakar());
        System.out.println("Kapasitas Mesin \t="+taksi1.getKapasitasMesin());
         System.out.println("Tarif Awal \t\t= " + taksi1.getTarifAwal());
         System.out.println("Tarif per km \t\t= " + taksi1.getTarifPerKm());

         System.out.println("_______________________________________________");
         //Taksi2
         Taksi taksi2 = new Taksi();
         taksi2.setJmlRoda(4);
         taksi2.setWarna("biru");
         taksi2.setBahanBakar("bensin");
         taksi2.setKapasitasMesin(1300);
         taksi2.setTarifAwal(7000);
         taksi2.setTarifPerKm(3500);

         System.out.println("Taksi 2\n");
         System.out.println("Jumlah Roda \t\t= " + taksi2.getJmlRoda());
         System.out.println("Warna \t\t\t= " + taksi2.getWarna());
         System.out.println("Bahan Bakar \t\t= " + taksi2.getBahanBakar());
         System.out.println("Kapasitas Mesin \t="+taksi2.getKapasitasMesin());
         System.out.println("Tarif Awal \t\t= " + taksi2.getTarifAwal());

                System.out.println("Tarif per km \t\t= "+taksi2.getTarifPerKm());
       
System.out.println("_______________________________________________");
       //Sepeda1
       Sepeda sepeda1 = new Sepeda();
       sepeda1.setJmlRoda(3);
       sepeda1.setWarna("hitam");
       sepeda1.setJmlSadel("1");
       sepeda1.setJmlGir(2);

       System.out.println("Sepeda 1\n");
       System.out.println("Jumlah Roda \t\t= "+sepeda1.getJmlRoda());
       System.out.println("Warna \t\t\t= "+sepeda1.getWarna());
       System.out.println("Jumlah Sadel \t\t= "+sepeda1.getJmlSadel());
       System.out.println("Jumlah Gir \t\t= "+sepeda1.getJmlGir());
       
System.out.println("_______________________________________________");
       //Sepeda2
       Sepeda sepeda2 = new Sepeda();
       sepeda2.setJmlRoda(2);
       sepeda2.setWarna("putih");
       sepeda2.setJmlSadel("2");
       sepeda2.setJmlGir(5);

       System.out.println("Sepeda 2\n");
       System.out.println("Jumlah Roda \t\t= "+sepeda2.getJmlRoda());
       System.out.println("Warna \t\t\t= "+sepeda2.getWarna());
       System.out.println("Jumlah Sadel \t\t= "+sepeda2.getJmlSadel());
       System.out.println("Jumlah Gir \t\t= "+sepeda2.getJmlGir());
       
System.out.println("_______________________________________________");
   } 
} 