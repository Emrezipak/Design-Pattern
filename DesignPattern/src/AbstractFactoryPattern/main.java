package AbstractFactoryPattern;

public class main {

	public static void main(String[] args) {
		
		IPhone phone1=FactoryPhone.phoneModel(new ModelS8("s8",2699.99,23,45));
		IPhone phone2=FactoryPhone.phoneModel(new ModelNote8("Note8",3299.99,26,50));
		IPhone phone3=FactoryPhone.phoneModel(new ModelNote9("Note9",3399.99,26,50));
		System.out.println("S8 model bilgileri");
		System.out.println(phone1);
		System.out.println("Note8 model bilgileri");
		System.out.println(phone2);
		System.out.println("Note9 model bilgileri");
		System.out.println(phone3);

	}

}
