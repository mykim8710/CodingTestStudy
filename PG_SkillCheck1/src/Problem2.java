/*길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.*/

import java.util.Scanner;

class Solution2 {
	public String solution(int n) {
		String answer = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				answer += "박";
			} else {
				answer += "수";
			}

		}

		return answer;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Solution2 s2 = new Solution2();

		System.out.println(s2.solution(n));

	}
}
