public class RingBufferTestV2 {

    public static void main(String[] args) {

        RingBufferV2 ringBuffer;
        ringBuffer = new RingBufferV2(3);
        ringBuffer.addValueV2(15);
        ringBuffer.addValueV2(24);
        ringBuffer.addValueV2(44);
        ringBuffer.printBufferV2();
        System.out.println();
        ringBuffer.addValueV2(555);
        ringBuffer.printBufferV2();
    }

}

