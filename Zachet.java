interface QueueInterface {
	void enqueue(int value);
	void dequeue();
	int get(int index);
	int size();
	int capacity();
}
class DynamicQueueExample {
	public static void main(String[] args) throws java.io.IOException {
		QueueInterface queue = new DynamicQueue(4);

		while (true) {
			System.out.println("Ochered'");
			for (int i = 0; i <queue.size(); i++) {
				System.out.println(queue.get(i) + " ");
			}
			System.out.println("Size: " + queue.size());
			System.out.println(queue.capacity());
			System.out.println("vvedite deistvie 1 = add, 2= delete, 3= exit");
			int action = System.in.read() - '0';
			System.in.skip(2);
			
			if (action == 1) {
				System.out.println("vvedite number dlya dobavleniya: ");
				int value = readInt();
				queue.enqueue(value);
			}
			else if (action == 2) {
				queue.dequeue();
			}
			else if (action == 3) {
				System.out.println("Vihod iz programmi");
				break;
			} else {
				System.out.println("Ntu komandi");
			}
		}
	}

	public static int readInt() throws java.io.IOException {
		int number = 0;
		int c;
		while ((c = System.in.read()) != '\n' && c != -1) {
			if (c >= '0' && c <= '9') {
				number = number * 10 + (c - '0');
			}
		}
		return number;
	}
}
class DynamicQueue implements QueueInterface{
	private int[] queue;
	private int capacity;
	private int size;
	private int front;
	private int rear;

	public DynamicQueue(int initialCapacity) {
		this.capacity = initialCapacity;
		this.queue = new int[capacity];
		this.size = 0;
		this.front = 0;
		this.rear = -1;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return capacity;
	}

	public void enqueue(int value) {
		if (size == capacity) {
			resize();
		}
		rear = (rear + 1) % capacity;
		queue[rear] = value;
		size++;
		System.out.println("dobavlen: " + value);
	}
	public void dequeue() {
		if (size == 0) {
			System.out.println("ochered' ravna 0");
		} else {
			System.out.println("Udalen element: " + queue[front]);
			front = (front + 1) % capacity;
			size--;
		}
	}
	public int get(int index) {
		return queue[(front + index) % capacity];
	}
	private void resize() {
		int newCapacity = capacity * 2;
		int[] newQueue = new int[newCapacity];
		for (int i = 0; i < size; i++) {
			newQueue[i] = queue[(front + i) % capacity];
		}
		queue = newQueue;
		capacity = newCapacity;
		front = 0;
		rear = size -1;
		System.out.println("razmer ocheredi uvelichen");
	}

}
