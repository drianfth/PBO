public class Tugas{
	public static void main(String args[]){
		ObjUsbFlash usbflash = new  ObjUsbFlash();
		ObjGun gun = new ObjGun();
		Ballpoint ballpoint = new Ballpoint();

		System.out.println("_____________________________________");
		usbflash.storageMedia();
		System.out.println("_____________________________________");
		gun.laserPoint();
		System.out.println("_____________________________________");
		ballpoint.storageMedia();
		ballpoint.laserPoint();
		ballpoint.draw();
		System.out.println("_____________________________________");
		
	}
}