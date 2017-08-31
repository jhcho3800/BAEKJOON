import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 백준 온라인 저지  10809번(알파벳 찾기) 문제풀이
 * 
 * @see https://www.acmicpc.net/problem/10809
 * @Created by Jeonghun on 2017-08-31
 **/

public class baekjoon_10809 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); // 분석 할 문자열을 입력
		String[] spell = new String[26]; // 스펠링 저장 배열
		char ch; 
		
		for(int i=0; i<input.length(); i++) {
			ch = input.charAt(i);
			if(spell[ch-'a']!=null) { // 중복을 방지하기 위해 배열 안에 값이 있을 경우 넘어가기.
				continue;
			}
			spell[ch-'a'] = i+"";
		} // for end
		
		for(int i=0; i<spell.length; i++) {
			if(spell[i]==null) { // spell[]배열이 null값일 경우 문자열 -1 저장
				spell[i]="-1";
			}
			System.out.print(spell[i]+" ");
		} // for end
	}
}
