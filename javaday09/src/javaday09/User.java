package javaday09;

public class User implements Comparable<User>{
	private int num;
	private String name;
	private int score;
	
	//접근자 메소드: getter and setters
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", score=" + score + "]";
	}
	
	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.name) * -1;
	}
	
}
