public class Gun extends Weapon{
	public int bullets;

	public Gun(int bullets){
		this.bullets = bullets;
	}

	public void attack(){
		System.out.println("Menembak Peluru");
		this.bullets -= 1;
		System.out.println("Sisa Peluru "+this.bullets);
	}
}