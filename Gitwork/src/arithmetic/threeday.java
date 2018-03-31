package arithmetic;
//����Ͱ����˼��ȥѰ����������������ֵ��������Ҫʱ�临�Ӷ���O��n���ġ�
public class threeday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {25,32,64,2,3,1};
		System.out.println(maxGap(a));

	}
	
		
		
	private static int maxGap(int[] a) {
		// TODO Auto-generated method stub
		if(a == null || a.length < 2) {
			return 0;
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int len = a.length;
		//1.��ȷ�������������Сֵ
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		if(max == min ) {
			return 0;
		}
		//�½�N+1��Ͱ������N�����ݡ���һ����Ͱ������Ϊ�˷�ֹһ��Ͱ�ڳ�������ֵ
		//ͬ��ֵ������ֵ����Сֵ����flag
		boolean[] hasNum = new boolean[len + 1];
		int[] maxs = new int[len + 1];
		int[] mins = new int[len + 1];
		int bid = 0;
		for (int i = 0; i < len; i++) {
			//ȷ����ǰֵӦ�÷����ĸ�Ͱ��
			bid = bucket(a[i], len, min, max);
			maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], a[i]) : a[i];
			mins[bid] = hasNum[bid] ? Math.min(mins[bid], a[i]) : a[i];
			hasNum[bid] = true;
		}
		int res = 0;
		int lastMax = maxs[0];
		int j = 1;
		//�ҳ�Ͱ�е�����ֵ
		for (;j <= len;j++) {
			if(hasNum[j]) {
				res = Math.max(res, mins[j] - lastMax);
				lastMax = maxs[j];
			}
			
		}
		System.out.println(res);
		return res;
	}




	private static int bucket(int num, int len, int min, int max) {
		// TODO Auto-generated method stub
		return (int)((num - min) * len / (max - min));
	}

}
