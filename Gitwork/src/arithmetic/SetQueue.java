package arithmetic;
//使用数组创建一个队结构
//使用3个指针。size，start，end。
public class SetQueue {
	private int[] queue;
	private int start ;
	private int size;
	private int end;
	private int len;
	public SetQueue(int lenth) {
		// TODO Auto-generated constructor stub
		queue = new int[lenth];
		start = 0;
		end = 0;
		size = 0;
		len = lenth;
	}
	public void add(int obj) throws Exception {
		if(size == len) {
			throw new Exception("队列已满");
		}
		queue[end] = obj;
		size++;
		end = (end+1)%len;
	}
	public int delete() throws Exception {
		if(size == 0) {
			throw new Exception("对空");
		}
		size--;
		int k = start;
		start = (start+1)%len;
		return queue[k];
	}
	int size() {
		return size;
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		SetQueue s = new SetQueue(3);
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println("qu1"+s.delete());
		System.out.println("qu2"+s.delete());
		System.out.println("qu3"+s.delete());

		System.out.println(s.size());

	}
	


}
