
public class MultiTabungan{
	private double saldo;

	public MultiTabungan(double saldo){
		this.saldo = saldo;
	} 

	public double getSaldo(){
		return saldo;
	}

	public double getSaldoUsd(){
		return this.idrToUsd(saldo);
	}

	public double getSaldoAud(){
		return this.idrToAud(saldo);
	}

	public void simpanUang(double jumlah){
		saldo += jumlah;
	}

	public void simpanUangUsd(double jumlah){
		saldo += this.UsdToIdr(jumlah);
	}

	public void simpanUangAud(double jumlah){
		saldo += this.AudToIdr(jumlah);
	}

	public boolean ambilUang(double jumlah){
		if (saldo > jumlah){
			saldo -= jumlah;
			return true;
		}else {
			return false;
		}
	}

	public boolean ambilUangUsd(double jumlah){
		if (this.getSaldoUsd() > jumlah){
			saldo -= this.UsdToIdr(jumlah);
			return true;
		}else {
			return false;
		}
	}

	public boolean ambilUangAud(double jumlah){
		if (this.getSaldoAud() > jumlah){
			saldo -= this.AudToIdr(jumlah);
			return true;
		}else {
			return false;
		}
	}

	public double idrToUsd(double uang){ 
		return uang / 9000.0;
	}

	public double idrToAud(double uang){
		return uang / 10000.0;
	}

	public double UsdToIdr(double uang){
		return uang * 9000.0;
	}

	public double AudToIdr(double uang){
		return uang * 10000.0;
	}
}