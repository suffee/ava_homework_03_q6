
import java.util.*;
public class homework_3_q6 {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	Student 		a 			 =new Student();	
	int[]          quiz        =new  int[3];
	boolean     b           =true;

//��J�W�r
	System.out.println("�п�J�ǥͦW�r");
	a.putName(keyboard.nextLine());
//��J�p��
	for(int i=0, j=0;i<3;i++){
		System.out.println("�п�J��"+(i+1)+"���p�Ҧ��Z");
		j=keyboard.nextInt();
			if(j<0||j>10){
				i--;
				System.out.println("�п�J���T�ƭ�!!");					
			}
			else{				
				quiz[i]=j;				
			}
	}
	a.putQuiz(quiz);
	//��J����
	do{
			System.out.println("�п�J�����Ҧ��Z");
		int j=keyboard.nextInt();
		if((j<0)||(j>100)){
			System.out.println("�п�J���T�ƭ�!!");				
			b=true;
		}
		else{
			a.putMid(j);
			b=false;
		}
	}while(b);
	
	//��J����
	do{
			System.out.println("�п�J�����Ҧ��Z");
		int j=keyboard.nextInt();
		if((j<0)||(j>100)){
			System.out.println("�п�J���T�ƭ�!!");				
			b=true;
		}
		else{
			a.putFinal(j);
			b=false;
		}
	}while(b);
	System.out.println( "��������"+ a.getOverAll());
	System.out.println("��������"+a.getLetterScore());
	
	System.out.println("    �W�r       �Ĥ@���p��     �ĤG���p��  �ĤT���p��  ������  ������    ����   �Ǵ�����");
	System.out.println(a.toString());
	keyboard.close();
	}

}
