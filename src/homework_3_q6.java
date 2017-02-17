
import java.util.*;
public class homework_3_q6 {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	Student 		a 			 =new Student();	
	int[]          quiz        =new  int[3];
	boolean     b           =true;

//輸入名字
	System.out.println("請輸入學生名字");
	a.putName(keyboard.nextLine());
//輸入小考
	for(int i=0, j=0;i<3;i++){
		System.out.println("請輸入第"+(i+1)+"次小考成績");
		j=keyboard.nextInt();
			if(j<0||j>10){
				i--;
				System.out.println("請輸入正確數值!!");					
			}
			else{				
				quiz[i]=j;				
			}
	}
	a.putQuiz(quiz);
	//輸入期中
	do{
			System.out.println("請輸入期中考成績");
		int j=keyboard.nextInt();
		if((j<0)||(j>100)){
			System.out.println("請輸入正確數值!!");				
			b=true;
		}
		else{
			a.putMid(j);
			b=false;
		}
	}while(b);
	
	//輸入期末
	do{
			System.out.println("請輸入期末考成績");
		int j=keyboard.nextInt();
		if((j<0)||(j>100)){
			System.out.println("請輸入正確數值!!");				
			b=true;
		}
		else{
			a.putFinal(j);
			b=false;
		}
	}while(b);
	System.out.println( "期末平均"+ a.getOverAll());
	System.out.println("期末平均"+a.getLetterScore());
	
	System.out.println("    名字       第一次小考     第二次小考  第三次小考  期中考  期末考    平均   學期分數");
	System.out.println(a.toString());
	keyboard.close();
	}

}
