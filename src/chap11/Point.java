package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Point implements Comparable<Point> {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int compareTo(Point p) {
		return this.x - p.x;
	}

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			int x = r.nextInt(101);
			int y = r.nextInt(101);
			list.add(new Point(x, y));

		}
		for (Point p : list) {
			System.out.println(p);
		}

		Collections.sort(list);
		
		
		
		System.out.println("======================================");
		for (Point p : list) {
			System.out.println(p);
		}

	}
}