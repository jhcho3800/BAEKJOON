package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 백준 온라인 저지 1152번(단어의 개수) 문제풀이
 * 
 * @see https://www.acmicpc.net/problem/1152
 * @author jhcho3800
 **/

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		br.close();
		String[] index = str.split(" ");
		int counts=0;
		
		for(int i=0; i<index.length; i++) {
			if(!index[i].equals("")) {
				counts++;
			}
		}
		System.out.println(counts);
	}
}

