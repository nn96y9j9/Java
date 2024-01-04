
public class TestIf {

	public static void main(String[] args) {
	
		int age = 20;
		if (age >= 30  ) {
			System.out.println("壯年");
		}else if (age >= 18) {
			System.out.println("成年");
		}else	{
			System.out.println("未成年");
		}
		
		if (age >=18 ) {
			System.out.println("成年");
			if (age >=30 ) {
				System.out.println("壯年");
			}
		}else {
			System.out.println("未成年");
		}
		


		int classroom = 204;
		switch (classroom) {
		case 204:
			System.out.println("人數 >= 30");
			break;
		case 305:
			System.out.println("人數<小於30, >= 20");
			break;
		default:
			System.out.println("其他");
		}
		
		
		
		
		
		
	
	}

}
