package chap11;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String name, dept, stuNo;

	public Student(String name, String dept, String stuNo) {
		this.name = name;
		this.dept = dept;
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public String getStuNo() {
		return stuNo;
	}

	@Override
	public String toString() {
		return "Student " + "[" + name+", " + dept+", " + stuNo + "]";
	}

}

public class StudentTest {
	
	public static void main(String[] args) {
		HashMap<String,Student> h = new HashMap<String,Student>();
		String name, dept, stuNo = null;
		
		Student stu ;
		String[] names = {"김철수", "김영희", "이돌쇠", "이막둥", "박멍돌"};
		String[] depts= {"컴퓨터공학과", "컴퓨터공학과", "전자공학과", "전기공학과", "정보공학과"};
		String[] stuNos = {"20180001","20180002","20180003","20180004","20180005"};
		for(int i = 0 ; i < 5 ; i++) {
			name = names[i];
			dept = depts[i];
			stuNo = stuNos[i];		
			stu = new Student(name, dept, stuNo);
			h.put(stuNo, stu);	
		}					
		
		while(true) {
			System.out.println("학생을 검색하려면 학번을, 종료하려면 q를 입력하세요: ");
			Scanner sc = new Scanner (System.in);
			stuNo = sc.next();
			if(stuNo.equals("q")) {
				System.out.println("종료");
				System.exit(0);
			}
			stu = h.get(stuNo);
			if(stu != null) {
				System.out.println(stu.toString());				
			}else {
				System.out.println("해당 학생 없음");
			}
			
			
				
		}
	}

}
