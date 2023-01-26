package interfacepratice;
interface mobile{
	void glass();
	void ram();
	void camera();
	void rom();
	void battery();

}

class Samsung implements mobile{
	static{
		System.out.println("......samsung.....");
	}

	@Override
	public void glass() {
		System.out.println("gorrila glass 5 ");
		
	}

	@Override
	public void ram() {
		System.out.println("6 gb ram");
		
	}

	@Override
	public void camera() {
		System.out.println("108 mp");
		
	}

	@Override
	public void rom() {
		System.out.println("256 gb ");
		
	}

	@Override
	public void battery() {
		System.out.println("4000 mah");
		
	}
	public void version(){
		System.out.println("s20 ultra");
		
	}
	public void processor() {
		System.out.println("exyonos 990");
	}
	
}


public class MobileMain {

	public static void main(String[] args) {
		Samsung s= new Samsung();
		s.version();
		s.processor();
		s.camera();
		s.battery();
		s.ram();
		s.rom();
		s.glass();
		

	}

}
