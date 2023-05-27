package lamdaConcepts;

public class LamdaDeclaration {

	public static void main(String[] args) {
//		WebPage wb = (value) -> { System.out.println("hi:" + value);};
//		WebPage wb1 = (value) -> System.out.println(value.toUpperCase());
//		WebPage wb2 = (n) -> System.out.println(n.length());
		WebPage WB3 = (value , age) -> { System.out.println (" hi "  +value +" age --> "  +age);};
		
//		WebPage wb1 = new WebPage() {
//
//			@Override
//
//			public void header(String value) {
//				System.out.println("hi:" + value);
//			}
//		};
//		wb.header("Google");
//		wb1.header("Facebook");
//		wb2.header("It is not a palindrome Number");
		WB3.header("Harish",29);

	}
}
