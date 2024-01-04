
public class TestEmployee {

	
	public static void main(String[] args) {
		//區域變數:stack;物件:heap
		
		
		int        a = 1 ;	
		Employee   emp = new Employee();//加NEW/成為物件
	emp.empno = 1;
	emp.name = 'V';
	System.out.println("員工編號:"+emp.empno+",名字:"+emp.name);
	
	Employee   emp2 = new Employee();//加NEW/成為物件
	emp2.empno = 2;
	emp2.name = 'C';
	System.out.println("員工編號:"+emp2.empno+",名字:"+emp2.name);
	
	System.out.println(emp == emp2);
	// 記憶體內位置
	emp2 = emp;// 告知emp2 = emp;與下表一同執行
	System.out.println(emp == emp2);
	System.out.println(emp2.name);
	
	emp = null;//清空emp記憶體
	emp2 = null;//清空emp2記憶體
	System.out.println(emp2.name);
	//不知道物件在哪，無法呼叫//否則會觸發錯誤:NullPointException
	
	
	
	
	

	
	
	
	}
	
}
