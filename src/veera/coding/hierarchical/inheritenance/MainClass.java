package veera.coding.hierarchical.inheritenance;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Multi Level Inheritenance");
		System.out.println("Electronics<----Mobile<----Android");
		Android m=new Android();
		System.out.println(m.ename);
		System.out.println(m.name);
		System.out.println(m.androidName);
		m.printName();
		m.printMobile();
		m.printAndroid();
		
	}

}
