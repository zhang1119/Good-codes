package arithmetic;
//ʹ�����鴴��һ��ջ�Ĵ洢�ṹ.
public class SetHeap {
	private int[] heap;
	private int lenth;
	private int index;
	SetHeap(int lenth){
		this.lenth = lenth;
		heap = new int[lenth];
	}
	public void push(int obj) throws Exception {
		if(index == lenth) {
			throw new Exception("ջ��");
		}
		heap[index++] = obj;
	}
	public int pull() throws Exception {
		if(index == 0) {
			throw new Exception("ջ��");
		}
		return heap[--index];
	}
	public int size() {
		return index-0;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SetHeap heap = new SetHeap(3);
		heap.push(2);
		heap.push(3);
		heap.push(3);
		System.out.println(heap.pull());
		System.out.println(heap.size());
		

	}
	


}
