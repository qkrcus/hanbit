package grade;
public class GradeBean {
 //=====멤버필드영역(스코프)=====
 private int kor,eng,math,java; // 인스턴스 변수는 초기화를 하지 않는다
 private String name;
 
 
 public void setName(String name){
  this.name =name ;
  }
    public String getName(){
     return name;
    }
  
 public void setKor(int kor){
  this.kor = kor; 
  }
 public int getkor(){
  return kor;
  }
 
 public void setEng(int eng){
  this.eng =eng;
 }
 public int getEng(){
  return eng;
 }
 
 public void setMath(int math){
  this.math =math;
 }
 public int getMath(){
  return math;
 }
 
 public void setJava(int java){
  this.java =java;
 }
 public int getJava(){
  return java;
 }
 public String getGradeBean() {
  // TODO Auto-generated method stub
  return null;
 }
 
 //===멤버메소드 영역(스코프)=====

 
}