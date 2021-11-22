public class Tes2{
	public static void main(String args[]){
		Firearm firearm = new Firearm();
		MachineGun machinegun = new MachineGun();
		Shotgun shotgun = new Shotgun();

		Player firstperson = new Player();

		firstperson.shoot(firearm);
		firstperson.shoot(machinegun);
		firstperson.shoot(shotgun);

	}
}