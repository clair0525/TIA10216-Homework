package hw2;

public class W201 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) // 從2開始,每次增加2.直到1000
		{
			sum += i; // 將總數加到總和
		}
		System.out.println(sum);
	}
}
