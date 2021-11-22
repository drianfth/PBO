public class Player{
	public void shoot(Firearm firearm){
		if(firearm instanceof MachineGun){
			MachineGun machinegun =  (MachineGun) firearm;
			System.out.println(machinegun.y);
			// System.out.println(firearm.y);
			// System.out.println("MachineGun");
		}else if(firearm instanceof Shotgun){
			Shotgun shotgun = (Shotgun) firearm;
			System.out.println(shotgun.y);
			// System.out.println("Shotgun");
		}else{
			System.out.println(firearm.y);
			// System.out.println("firearm");
		}
	}

}