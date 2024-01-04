
public class NewString {

	public static void main(String[] args) {
		
		char ch = '中';
		
		String name = "Wilson";//xxxx, poor
		String name1 = "Wilson";//第二次, poor不會再產生, xxxx
		System.out.println(name == name1);
		

		
		String name2 = new String("Wilson");//new一定會產生新物件，heap，xxxy
		System.out.println(name == name2);
		
		String name3 = name +",hello";//xxyy
		//Wilson, hello//pool內沒有，不會去動原本pool內容,會新增新文字Wilson, hello
		//Immutable，不可修改
		
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name3));
		//文字的逐字比較用equals,都相等才為true
		//變數.屬性 emp.empno,屬性不會有括號
		//變數.方法();有括號;name.equals()
		
		int length = "AAA黑橘".length();
		System.out.println(length);
		System.out.println("AAA黑橘".length());
		//字串長度
		System.out.println("資策會306".indexOf("306"));
		System.out.println("資策會306".indexOf("會"));
		System.out.println("資策會306".indexOf("307"));

		
		System.out.println("資策會307".substring(2,4));
		
		System.out.println(String.format("%.1f", 1234.5678));
		//%.1f表小數點下一位
		System.out.println(String.format("%10.1f", 1234.5678));
		//%10.1f
		System.out.println(String.format("%10.1f", 1234.5678));
		
		System.out.printf("aaa%n");
		System.out.println("aaa");
			//insert cursor
		System.out.printf("%n");//outf
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
