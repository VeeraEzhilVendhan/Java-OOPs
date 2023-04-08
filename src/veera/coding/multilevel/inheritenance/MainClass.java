package veera.coding.multilevel.inheritenance;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Single Level Inheritenance");
		System.out.println("Mobile IS-A Electronics");
		Mobile m=new Mobile();
		System.out.println(m.ename);
		System.out.println(m.name);
		m.printName();
		m.printMobile();
		
	}

}
