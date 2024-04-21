package hw1;

public class w051 {
    public static void main(String[] args) {
        double principal = 1500000; // 本金 150 萬
        double interestRate = 0.02; // 利率 2%
        int years = 10; // 年數 10 年

        // 使用 for 迴圈計算每年的本利和
        for (int i = 1; i <= years; i++) {
            // 計算利息
            double interest = principal * interestRate;
            // 將利息加到本金中
            principal += interest;
        }

        // 輸出 10 年後的本金加利息總額
        System.out.println("10 年後的本金加利息總額為: " + principal + " 元");
    }
}
