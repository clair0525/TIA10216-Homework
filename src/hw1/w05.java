package hw1;
//某人銀行存入150萬,銀行利率2%如果每年利息都存入銀行,
//請用程式計算10年後,本金加利息共有多少錢。
//複利公式 本金*(1+0.02)10次方
  public class w05 {
	public static void main(String[]args){
		int year=1 , money=1_500_000;
		double interest=0.02;
		double saving = money*(1+interest);
		for (year=1; year<10; year++)
		{
			saving*=(1+interest);
		}
		System.out.println("10年本金複利"+(int)saving+"元");
	}

}
