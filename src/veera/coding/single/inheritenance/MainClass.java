package veera.coding.single.inheritenance;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Hierarchical Inheritenance");
		System.out.println("Electronics<----Mobile");
		System.out.println("Electronics<----Laptop");
		// laptop
		Laptop m=new Laptop();		
		System.out.println(m.ename);
		System.out.println(m.laptopName);
		m.printName();
		m.printLaptop();
		// mobile
		Mobile m1=new Mobile();
		System.out.println(m1.ename);
		System.out.println(m1.name);
		m1.printName();
		m1.printMobile();
		
	}

}
