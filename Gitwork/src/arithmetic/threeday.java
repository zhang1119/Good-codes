package arithmetic;
//采用桶排序思想去寻找数组中数的最大差值，并且需要时间复杂度是O（n）的。
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
		//1.先确定数组中最大最小值
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		if(max == min ) {
			return 0;
		}
		//新建N+1个桶。放入N个数据。有一个空桶，就是为了防止一个桶内出现最大差值
		//同种值存放最大值，最小值，和flag
		boolean[] hasNum = new boolean[len + 1];
		int[] maxs = new int[len + 1];
		int[] mins = new int[len + 1];
		int bid = 0;
		for (int i = 0; i < len; i++) {
			//确定当前值应该放入哪个桶中
			bid = bucket(a[i], len, min, max);
			maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], a[i]) : a[i];
			mins[bid] = hasNum[bid] ? Math.min(mins[bid], a[i]) : a[i];
			hasNum[bid] = true;
		}
		int res = 0;
		int lastMax = maxs[0];
		int j = 1;
		//找出桶中的最大差值
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
