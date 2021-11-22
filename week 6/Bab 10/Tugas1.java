import java.text.NumberFormat;

public class Tugas1{
	public static void main(String args[]){
		NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);


		MultiTabungan tbgn1 = new MultiTabungan(90000.0);
		System.out.println("saldo IDR : "+ tbgn1.getSaldo() + " IDR");
		System.out.println("saldo Usd : "+ nf.format(tbgn1.getSaldoUsd()) + " USD");
		System.out.println("saldo Aud : "+ nf.format(tbgn1.getSaldoAud()) + " AUD");

		System.out.println("ambil 10000 IDR");
		if (tbgn1.ambilUang(10000.0)) 
			System.out.println(" OK");
		else
			System.out.println(" Gagal");
		System.out.println("saldo IDR : "+tbgn1.getSaldo() + " IDR");

		System.out.println("ambil 1 USD");
		if (tbgn1.ambilUangUsd(1.0)) 
			System.out.println(" OK");
		else
			System.out.println(" Gagal");
		System.out.println("saldo Usd : "+ nf.format(tbgn1.getSaldoUsd()) + " USD");

		System.out.println("ambil 1 AUD");
		if (tbgn1.ambilUangAud(1.0)) 
			System.out.println(" OK");
		else
			System.out.println(" Gagal");
		System.out.println("saldo Aud : "+ nf.format(tbgn1.getSaldoAud()) + " AUD");

		System.out.println("ambil 8 USD");
		if (tbgn1.ambilUangUsd(8.0)) 
			System.out.println(" OK");
		else
			System.out.println(" Gagal");
		System.out.println("saldo Usd : "+ nf.format(tbgn1.getSaldoUsd()) + " USD");

		System.out.println("simpan 20000 IDR");
		tbgn1.simpanUang(20000.0);
		System.out.println("saldo IDR : "+ tbgn1.getSaldo() + " IDR");

		System.out.println("simpan 4 USD");
		tbgn1.simpanUangUsd(4.0);
		System.out.println("saldo Usd : "+ nf.format(tbgn1.getSaldoUsd()) + " USD");

		System.out.println("simpan 4 AUD");
		tbgn1.simpanUangUsd(4.0);
		System.out.println("saldo Aud : "+ nf.format(tbgn1.getSaldoAud()) + " AUD");















	}
}