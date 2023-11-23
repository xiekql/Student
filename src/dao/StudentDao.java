package dao;

import java.util.Scanner;

import dto.StudentDto;

//Data Access Object : 데이터를 취급하는 클래스 
public class StudentDao {
	Scanner sc = new Scanner(System.in);

	//학생 데이터 관리 배열 
	private StudentDto student[];
	private int count;
	//추가 삭제 검색 수정 

	public StudentDao() {
		count = 0 ;
	student = new StudentDto[10]; //변수만 생성	
	
	//dto 생성 
	//for(int i = 0 ; i <student.length ; i++) {
	//	student[i]=new StudentDto();
//	}
	}//Student Dto student1,2,3,4 
	
public void insert() {
	System.out.println("학생 정보 입력입니다");

	System.out.print("이름 >> ");
	String name = sc.next();

	System.out.print("나이 >> ");
	int age = sc.nextInt();

	System.out.print("신장 >> ");
	double height = sc.nextDouble();

	System.out.print("주소 >> ");
	String address = sc.next();

	System.out.print("국어 >> ");
	int lang = sc.nextInt();

	System.out.print("영어 >> ");
	int eng = sc.nextInt();

	System.out.print("수학 >> ");
	int math = sc.nextInt();	
	
	student[count] = new StudentDto(name, age, height, address, lang, eng, math);
	count ++; //배열의 다음으로 이동
}
public void delete() {
	System.out.print("삭제하고 싶은 학생의 이름 >> ");
	String name = sc.next();
	int index = search(name);
	if(index == -1 ) {
System.out.print("학생정보를 찾을 수 없습니다.");
		return;
	}
	student[index].setName("");
	student[index].setAge(0);;
	student[index].setHeight(0);
	student[index].setAdress("");
	student[index].setKor(0);
	student[index].setEng(0);
	student[index].setMath(0);
System.out.print(name + "삭제 완료");
	
}
public void select() {
	System.out.print("검색하고 싶은 학생의 이름 >> ");
	String name = sc.next();
	int index = search(name);
	if(index == -1) {
System.out.print("학생 정보를 찾을 수 없습니다.");
	return;
	}
System.out.println(student[index]);
	
	
}
public void update() {
	System.out.print("수정하고 싶은 학생의 이름 >> ");
	String name = sc.next();
	int index = search(name);
	if(index == -1) {
System.out.print("학생 정보를 찾을 수 없습니다.");
	return;	}
	System.out.println("수정 국어 점수 >> ");
	int korean = sc.nextInt();
	student[index].setKor(korean);
	System.out.println("수정 영어 점수 >> ");
	int eng = sc.nextInt();
	student[index].setEng(eng);
	System.out.println("수정 수학 점수 >> ");
	int math = sc.nextInt();
	student[index].setMath(math);
  
}	
public void allData() {
	for (int i = 0; i < student.length; i++) {
		StudentDto dto = student[i];
		if(dto != null && !dto.getName().equals("")) { //빈문자열 출력 X 
			System.out.println(dto.toString());
		}
	}
}
public int search(String name) {
	int index = -1;
	for (int i = 0; i < student.length; i++) {
		StudentDto dto = student[i];
		if(dto != null) {
			if(name.equals(dto.getName())) {
			index = i ;	
			}
		}
	}
	
	return index;
}



}
