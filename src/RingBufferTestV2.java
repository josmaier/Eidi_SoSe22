public class RingBufferTestV2 {

    public static void main(String[] args) {

        RingBufferV2 ringBuffer;
        ringBuffer = new RingBufferV2(10);
        ringBuffer.printBufferV2();
        ringBuffer.addValueV2(15);
        ringBuffer.addValueV2(24);
        ringBuffer.addValueV2(44);
        ringBuffer.printBufferV2();
        System.out.println(ringBuffer.peekV2());
        ringBuffer.removeV2();
        ringBuffer.printBufferV2();
    }

}

