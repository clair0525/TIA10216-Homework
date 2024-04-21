package hw1;//5+5 , 5+`5`,5+"5"

public class w06 {
	public static void main(String[]args) {
		System.out.println(5+5);
		//int5+5 兩數int相加=10
		System.out.println(5+'5');
		//'5'Ascii字元編碼十進位dec是53 所以只5+53=58
		System.out.println(5+"5");
		//"5"為字串 所以int5+字串5會是55
	}
 
}
