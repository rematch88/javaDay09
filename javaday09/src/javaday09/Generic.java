package javaday09;

//Generic을 적용한 클래스
public class Generic<E> {
	//E라는 미지정 자료형 배열
	private E [] data;
	
	//생성자
	public Generic(E [] data) {
		this.data = data;
	}
	
	//메소드
	public void disp() {
		for(E temp : data) {
			System.out.print(temp + "\t");
		}
		System.out.println();
	}


}
