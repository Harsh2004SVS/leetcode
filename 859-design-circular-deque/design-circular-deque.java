class MyCircularDeque {

    private int[] dq;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        dq = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        front = (front - 1 + capacity) % capacity;
        dq[front] = value;
        size++;

        if (size == 1) rear = front;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        rear = (rear + 1) % capacity;
        dq[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return dq[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return dq[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
