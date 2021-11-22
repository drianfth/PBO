package perbankan2;
public class PengambilanUang extends Tabungan{
	private int proteksi;

	public PengambilanUang(int saldo){
		super.saldo = saldo;
	}

	public PengambilanUang(int saldo, int tingkatBunga){
		super.saldo = saldo;
		proteksi = tingkatBunga;
	}

	public int getSaldo(){
		return super.saldo;
	}

	public boolean ambilUang(int jumlah){
		if(jumlah > (super.saldo - proteksi)){
			return false;
		}else{
			super.saldo -= super.saldo - jumlah;
			return true;
		}
	}


}