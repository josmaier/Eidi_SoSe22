public class RingBufferTest {

    public static void main(String[] args) {
        RingBuffer ringBuffer = new RingBuffer(10);
        ringBuffer.printBuffer();
        ringBuffer.put(15);
        ringBuffer.put(12);
        ringBuffer.printBuffer();
    }
    
}
