package pack2;
import pack3.*;

public class Test {
		public static void main(String args[]) {
			CPU cpu=new CPU();
			cpu.setSpeed(2200);
			cpu.setname("i7 9750");
			HardDisk disk=new HardDisk();
			disk.setlx("HDD");
			disk.setAmounr(200);
			PC pc=new PC();
			pc.setCPU(cpu);
			pc.setHardDisk(disk);
			pc.show();
		}
}
