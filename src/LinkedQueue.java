
// This class implements a queue using a linked list
//It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	private Object size;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		return str;
	}

	public void removeMiddle() {

		int holder = 0;
		int removeHalf = count / 2;
		
		if (isEmpty()) {

			System.out.println("Empty Stack");

		}

		// These will assign the pointer
		LinkedNode prInList = front;
		
		// Looking to rid of the largest number
		while (holder < removeHalf - 1) {
			prInList = prInList.next;
			holder++;
		}
		
		// New LinkedQue
		LinkedNode newCur = prInList.next;
		prInList.next = newCur.next;
		newCur.next = null;

		System.out.println(toString());
	}
}