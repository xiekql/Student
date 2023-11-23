package dto; //학생 한명의 데이터가 드감 
//Data Transfer Object : 데이터 단위의 클래스
//Value Object : VO 
public class StudentDto {
//학생의 항목들 
	private String name ; 
	private int age ; 
	private double height ; 
	private String adress ; 
	private int kor ; 
	private int eng ; 
	private int math ; 
public StudentDto() {
	
}
//생성자 using fields
public StudentDto(String name, int age, double height, String adress, int kor, int eng, int math) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.adress = adress;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}

//Setter 
public void setName(String name) {
	this.name = name ; 
}
//getter 
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
	
}
@Override
public String toString() {
	return "StudentDto [name=" + name + ", age=" + age + ", height=" + height + ", adress=" + adress + ", kor=" + kor
			+ ", eng=" + eng + ", math=" + math + "]";
}




}
