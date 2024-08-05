public class Primatives2 {
    public static void main(String[] args) {

        byte myMinByteValue = -128;
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        float myFloatValue = 23.467F;
        float myFloatValue2 = 1.4e-3f;

        System.out.println(myFloatValue);
        System.out.println(myFloatValue2);

        double myDoubleValue = -98.467F;
        double myDoubleValue2 = 1.8e-3f;

        System.out.println(myDoubleValue);
        System.out.println(myDoubleValue2);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
