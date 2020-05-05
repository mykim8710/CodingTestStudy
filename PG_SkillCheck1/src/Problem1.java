/*문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.(str은 길이 1 이상인 문자열입니다.)*/

import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public String solution(String s) {
		String answer = "";

		char[] arrCh = s.toCharArray(); 		// string문자열을 문자하나씩 분리해서 배열로 생성
		int[] arrInt = new int[arrCh.length];	// 문자 -> 정수로 형변환해서 담은 배열하나 선언

		for (int i = 0; i < arrInt.length; i++) {	// 반복문을 돌리면서 문자배열의 요소들을 정수로 형변환해서 정수배열에 담는다.(문자 -> 정수 형변환(아스키코드, 소문자 > 대문자))
			arrInt[i] = (int) arrCh[i];
		}

		Arrays.sort(arrInt);							// 정수배열을 오름차순 정렬

		for (int i = 0; i < arrInt.length; i++) {
			arrCh[i] = (char) arrInt[arrInt.length - 1 - i];
		}

		for (int i = 0; i < arrCh.length; i++) {	// 문자배열 요소들을 합쳐 문자열로 만듬
			answer += arrCh[i];
		}

		return answer;
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		Solution solution = new Solution();
		System.out.println(solution.solution(s));

	}
}
