import java.text.DecimalFormat;

public class Student {
	
	DecimalFormat fomater = new DecimalFormat("#,##0.##%");
	
										private  	String 		studentName;
										private  	int[]			studentQuiz=new int[3];
										private 	int 			studentMidExam;
										private	int 			studentFinalExam;
										private	double   studentOverallScore;
										private   char 		studentLetterGrade;
										
										//�غc�l
										Student() {
															studentName="N/A";
													
																for(int i=0;i<3;i++){
																	studentQuiz[i]=0;
																}
										
																studentMidExam=0;
																studentFinalExam=0;
																studentOverallScore=0;
																studentLetterGrade='N';
										}	
										//mutator method
										public void putName(String studentName){
											
											this.studentName=studentName;
											return;
										}
										
										public void putQuiz(int[] studentQuiz){		
											this.studentQuiz=studentQuiz;
											return;
		
										}
										
										public void putMid(int studentMidExam){
											
											this.studentMidExam=studentMidExam;
											return;
		
										}
										public void putFinal(int studentFinalExam){
											
											this.studentFinalExam=studentFinalExam;
											return;
		
										}
																		
										//accessor method
										public String  getName(){
											
											return this.studentName;
											
										}
										
										public int[] gettQuiz(){		
											
											return this.studentQuiz;
												
										}
										public int gettQuiz(int index){		
											
											return this.studentQuiz[index];
												
										}									
										
										public int getMid(){
											
											return this.studentMidExam;
													
										}
										public int getFinal(){
											
											return this.studentFinalExam;
											
		
										}
										public double getOverAll(){
																						
											this.studentOverallScore=(((((double)this.gettQuiz(0)+this.gettQuiz(1)+this.gettQuiz(2))/30)*0.25)+(((double)this.getMid()/100)*0.35)+(((double)this.getFinal()/100)*0.4));
											return this.studentOverallScore;
									
										}
										
										public char getLetterScore(){
											
											if(this.getOverAll()>=0.9){
												this.studentLetterGrade='A';
											}
											else if(this.getOverAll()>=0.8){
												this.studentLetterGrade='B';
											}
											else if(this.getOverAll()>=0.7){
												this.studentLetterGrade='C';
											}
											else if(this.getOverAll()>=0.6){
												this.studentLetterGrade='D';
											}
											else{
												this.studentLetterGrade='F';
											}
											
											return  this.studentLetterGrade;
										}	
										
										
										public String toString(){
											
											return  this.studentName+this.studentQuiz[0]+this.studentQuiz[1]+this.studentQuiz[2]+this.studentMidExam +this.studentFinalExam+fomater.format(this.studentOverallScore)+this.studentLetterGrade;
											
									
											
										}
										
										public boolean equals(Student another){
											
											return (this.studentName.equals(another.studentName));
											
											
											
										}
										
										
										
										
										
										
										
										
										
										
										
										
}	
