package kr.board.util;
//Model(Utility)
public class MyUtil {
	// 1~10=? method 구하기
	public int hap(int num1, int num2) { //MyUtill.hap()
		int sum = 0;
		if(num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
			
		}else {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		}

		return sum;
	}

}
