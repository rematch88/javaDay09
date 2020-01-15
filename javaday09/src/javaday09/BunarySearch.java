package javaday09;

import java.util.Arrays;

public class BunarySearch {

	public static void main(String[] args) {
		int [] ar = {100, 300, 200, 500, 400};
		//이분검색은 정렬이 되어 있어야 올바른 값이 나옵니다.
		System.out.println(Arrays.binarySearch(ar, 300));
		Arrays.sort(ar);
		//정렬을 해서 100, 200, 300, 400, 500
		System.out.println(Arrays.binarySearch(ar, 300));
		

	}

}
