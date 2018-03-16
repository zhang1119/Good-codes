package arithmetic;

import java.util.HashMap;

//有一座高度是10级的台阶。从下往上走有多少种走法
public class Upstair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(stair(10));
		System.out.println(factorial(1000));
	}
	static HashMap<Integer , Integer> hs=new HashMap<Integer, Integer>();
	
	 static int stair(int n) {
		 
		if(n == 1 || n < 1)
			return 1;
		else {
			if(hs.containsKey(n))
				return hs.get(n);
			else {
			int i= stair(n-1)+stair(n-2);
			hs.put(n, i);
			return i;
			}			
			}
	}
	 //求1000的阶乘后有多少零
	//思路：如果计算出得数去数零的话未免有点复杂
	 //故，计算n以内的数谁可与谁相乘可以的零。例如：2*5,4*5..
	 //则有一5就有一零。故问题转换为换为求n以内5的个数。
	 static int  factorial(int n){
		int k=0;
		while(n>0) {
			k+=n/5;
			n=n/5;
		}
		return k;
	 }
	//某门户网站具有如下的业务功能
	 //客户输入年龄信息是会根据输入的年龄判断当前的年龄段
//	 0-9 儿童
//	 10-19 少年
//	 20-29 青年
//	 30-39 青壮年
	 //解题思路：根据分析，是一个有序的间隔，0 1 2 3用数组存储关键值，去数组中查找就好
	 

}
