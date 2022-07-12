public class RingBufferTestV2 {

    public static ElementV2 eTest, eTest2, eTest3;
    /*
     * Implemented Tests, should cover our bases for the basic stuff
     */

     //TODO Check if test for remove actually works

    public static void main(String[] args) {

        RingBufferV2 rBufferV2;
        rBufferV2 = new RingBufferV2(3);
        removeTest(rBufferV2, peekTest(rBufferV2, Test3(rBufferV2, Test2(rBufferV2, Test1(rBufferV2)))));
    }


    public static boolean Test1(RingBufferV2 rBufferV2){
        if(!rBufferV2.getIsEmptyV2()){
            eTest = rBufferV2.getHeadV2();
            rBufferV2.addValueV2(15);
            rBufferV2.addValueV2(22);
            rBufferV2.addValueV2(67);
            System.out.println("Test 1 completed");
            return true;
        }
        return false;
    }

    public static boolean Test2(RingBufferV2 rBufferV2, boolean b){
        if(b){
            rBufferV2.printBufferV2();
            System.out.println("Test 2 completed");
            return true;
        }
        return false;
    }

    public static boolean Test3(RingBufferV2 ringBufferV2, boolean b){
        if(b){
            ringBufferV2.addValueV2(155);
            ringBufferV2.printBufferV2();
            if(ringBufferV2.getHeadV2() == ringBufferV2.getTailV2() && ringBufferV2.getHeadV2().getPreviousElementV2() == eTest){
                System.out.println("Test 3 completed");
                eTest2 = ringBufferV2.getHeadV2();
                return true;
            }
        }
        return false;
    }

    public static boolean peekTest(RingBufferV2 ringBufferV2, boolean b){
        if(b){
            if(ringBufferV2.peekV2() == 155){
                System.out.println("Peek test completed");
                return true;
            }
        }
        return false;
    }

    public static boolean removeTest(RingBufferV2 ringBufferV2, boolean b){
        if(b){
            if(ringBufferV2.removeV2() == 155){
                System.out.println("Remove test completed");
                return true;
            }
        }
        return false;
    }
}


