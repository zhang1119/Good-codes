package arithmetic;

import java.util.HashMap;

//��һ���߶���10����̨�ס������������ж������߷�
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
	 //��1000�Ľ׳˺��ж�����
	//˼·��������������ȥ����Ļ�δ���е㸴��
	 //�ʣ�����n���ڵ���˭����˭��˿��Ե��㡣���磺2*5,4*5..
	 //����һ5����һ�㡣������ת��Ϊ��Ϊ��n����5�ĸ�����
	 static int  factorial(int n){
		int k=0;
		while(n>0) {
			k+=n/5;
			n=n/5;
		}
		return k;
	 }
	//ĳ�Ż���վ�������µ�ҵ����
	 //�ͻ�����������Ϣ�ǻ��������������жϵ�ǰ�������
//	 0-9 ��ͯ
//	 10-19 ����
//	 20-29 ����
//	 30-39 ��׳��
	 //����˼·�����ݷ�������һ������ļ����0 1 2 3������洢�ؼ�ֵ��ȥ�����в��Ҿͺ�
	 

}
