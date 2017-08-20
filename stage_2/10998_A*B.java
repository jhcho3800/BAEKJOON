import java.io.IOException;

/*
 * 백준 온라인 저지 10998번(A*B) 문제풀이
 * 
 * @see https://www.acmicpc.net/problem/10998
 * @Created by Jeonghun on 2017-08-21
 **/

public class Main {
	public static void main(String[] agrs) throws IOException {
		int a = System.in.read()-48;
		int b = System.in.read();
		int c = System.in.read()-48;
		System.out.println(a*c);
	}
}
