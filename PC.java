package pack2;
public class PC {
	CPU cpu;
	HardDisk HD;
	
	void setCPU(CPU c) {
		cpu=c;
	}
	void setHardDisk(HardDisk h) {
		HD=h;
	}
	void show() {
		System.out.println("cpu���ٶ�Ϊ��"+cpu.getSpeed());
		System.out.println("cpu�ͺţ�"+cpu.getname());
		System.out.println("Ӳ������Ϊ��"+HD.getAmount());
		System.out.println("Ӳ������Ϊ��"+HD.getlx());
	}
}

