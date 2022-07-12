package RB;
public class RIngBufferTest {
    public static void main(String[] args) {
        var buffer = new RingBuffer(3);

        buffer.put(5);
        buffer.put(6);
        buffer.put(7);

        buffer.printList();

        buffer.put(8);
        buffer.put(9);

        buffer.printList();

        //System.out.println("first element: " + buffer.peek());
    }
}
