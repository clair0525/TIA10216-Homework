package hw1;//程式算出直256559為多少天 多少小時 多少分 多少秒

public class w03 {
	public static void main(String[]args) {
    	int seconds=256559,hrs=24,mins=60,secs=60;
    	int daysec=hrs*mins*secs;//一天有幾秒24*60*60
    	int hrssec=mins*secs;//一小時幾秒24*60
    	int hrsleft=seconds%daysec;//剩多少小時秒=總秒除一天秒數256559/(24*60*60)餘秒
    	int minlift=hrsleft%hrssec;//剩多少分鐘秒=剩餘秒除一小時秒
    	int seclift=minlift%secs;//剩多少秒=剩餘分鐘秒除以秒
    
    	System.out.println((seconds/daysec)+"天"+(hrsleft/hrssec)+"小時"+(minlift/secs)+"分"+seclift+"秒");
}
}
