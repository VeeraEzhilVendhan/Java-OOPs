package veera.coding.object_class;

public class NoteMain {
	
	public static void main(String[] args) {
		
		Note note1=new Note();
		System.out.println("Object note1 states -");
		System.out.println(note1.brand+", "+note1.size);
		System.out.println("Object note1 behaviour -");
		note1.write("sample thing i am writing in note1");
	}

}
