import javax.sound.midi.Soundbank;
import javax.xml.bind.annotation.W3CDomHandler;

import org.omg.CORBA.SetOverrideType;

public class TestBasic {

	public static void main(String[] args) {
	// ctrl + D; delete
	// tab : 向後；shift+tab :向前
		
	//type variable-name
	{
    long salary;
    salary = 200000;//等號:給值
    System.out.println("薪水"+salary);//取值
	}
    //int io,jl;
    //io = 8; 
	//jl = 6;
    
	//int Salary ; //不能重複宣告相同的變數名稱		
	
	//long salaryOfMary;
    
    //long a = 20000000000L ;//20e int:21e long:10^18；預設為int，需結尾+L告知為long  
  
    long overflow = 2000000000L+2000000000;//20e+20e;long後面數字仍需 + L  
    System.out.println("資料溢位"+overflow);
    
    //float a = 123.456789012345679f;
    //double b = 123.456789012345679;
    
    //System.out.println("七位" = +a);
    
    char ch = '中';//字元 單一一個字用單引號'，HelloWorld字串用"
    System.out.println(ch);
    
    boolean paid = true;//true or false;
    System.out.println(paid);
    
    System.out.println("\"HelloWorld\"");//跳脫字元 \t(一個tab鍵)、\"(雙引)、\'(單引)、\r \n(換行)
    
    System.out.println("\\HelloWorld\\");//跳脫字元 \t(一個tab鍵)、\"(雙引)、\'(單引)、\r \n(換行)
    System.out.println("\\Hello\rWorld\\");//跳脫字元 \t(一個tab鍵)、\"(雙引)、\'(單引)、\r \n(換行)
    System.out.println("Hello\r\nWorld");//跳脫字元 \t(一個tab鍵)、\"(雙引)、\'(單引)、\r \n(換行)
    
    long a = 3;
    double b = 17.3;
    double c = a+b;
    double d = b%a;
    double e = b/a;
    
    System.out.println("c=" + c);
    
    System.out.println("d=" + d);
    
    System.out.println("e=" + e);//int 加減乘除 結果也為同一型態，short/shor 結果也會變成int
    
    int q = (int)b ; 
    System.out.println(q);
    
    int age = 4020;
    boolean isAdult = !(age >= 18);// 測試:==(相等)，!=(不等於)
    System.out.println("可以買菸嗎?=" + !isAdult);
    
    //boolean && boolean >= boolean 且
    System.out.println(age > 23 && age < 60);
    //boolean || boolean >= boolean 或
    System.out.println(age >23 || age <60);
    // ! 為反布林值
    //int & int -> int
    System.out.println(12 & 6);
    System.out.println(12 | 6);
    
    int cLanguage = 1;
    int java = 2;
    int javascript = 4;
    int python = 8;
    int kobe = (java | javascript); //6
    int Ichiro = (python | cLanguage); //9
    
    System.out.println("kobe會不會python=" + (kobe & python));
    System.out.println("Ichiro會不會java=" + (Ichiro & java));
   
    System.out.println(2 << 1);
    System.out.println(2 * 2);
    
    age-- ; //age = age - 1
    System.out.println("age--=" + age);
        
    age++ ; //age = age + 1
    System.out.println("age++ =" + --age);
    
    System.out.println("age++ =" + age++ + "age=" + age);
    
    int x = 10;
    int y = 20;
    // x =x + y;簡寫成這樣
    x /= y;
    System.out.println(x);
    //三元運算 > a? b:c 大於30壯年 ; 類if / else
    System.out.println(age >= 18 ? "成年" : "未成年");
    System.out.println(age >= 18 ? (age > 30 ? "壯年" :"成年") : "未成年");
    
    
    
    
    
	}
    
    
    
    
  
}