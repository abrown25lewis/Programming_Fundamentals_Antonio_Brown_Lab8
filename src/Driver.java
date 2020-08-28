
public class Driver {

	public static void main(String[] args) {

		int x = 1;

		ArrayQ aQueue = new ArrayQ();

		// This adds enqueue integers to aQueue
		aQueue.enqueue(1);
		aQueue.enqueue(7);
		aQueue.enqueue(3);
		aQueue.enqueue(4);
		aQueue.enqueue(9);
		aQueue.enqueue(2);

		// Remove(dequeue) elements one by one and displaying each removal

		while (!aQueue.isEmpty()) {

			System.out.println(x + ". Dequeue Array integer " + aQueue.dequeue());
			x++;
		}

		LinkedQueue lQueue = new LinkedQueue();

		// This adds enqueue integers to lQueue
		lQueue.enqueue(1);
		lQueue.enqueue(7);
		lQueue.enqueue(3);
		lQueue.enqueue(4);
		lQueue.enqueue(9);
		lQueue.enqueue(2);

		// Remove(dequeue) elements one by one and displaying each removal

		while (!lQueue.isEmpty()) {
			System.out.println(x + ". Dequeue Linked integer " + lQueue.dequeue());
			x++;
		}

		// Create instance of LinkedQueue2 for Exercise 2
		LinkedQueue lQueue2 = new LinkedQueue();

		// This adds enqueue integers to lQueue2

		lQueue2.enqueue(4);
		lQueue2.enqueue(1);
		lQueue2.enqueue(9);
		lQueue2.enqueue(2);
	

		System.out.println(" ");
		// Call method removeMiddle on LinkedQueue2
		System.out.println("Removed middle integers: ");
		lQueue2.removeMiddle();

	}
}
