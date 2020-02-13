package chap11;

import java.util.HashSet;
import java.util.Scanner;

class Person {
	public String name, tel;

	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Person" + "[ name =" + name + ", tel =" + tel + "]";
	}

}

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Person> h1 = new HashSet<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("이름, 전화번호 입력>>");
			String name = sc.next();
			String tel = sc.next();
			h1.add(new Person(name, tel));
		}
		System.out.println("입력 결과>>");
		 for(Person p: h1) {
	         System.out.println(p);
	      }

	}

}
