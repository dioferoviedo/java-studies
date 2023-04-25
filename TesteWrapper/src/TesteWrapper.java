public class TesteWrapper {
    public static void main(String[] args) throws Exception {
        
        //tipos primitivos em Java
        short num1 = 1;
        byte num2 = 2;
        int num3 = 3;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';   //se fosse um objeto, teria que ser String e usar "a" e não 'a' 

        Short num7 = Short.valueOf((short) 1);
        Byte num8 = Byte.valueOf((byte) 10);
        Integer num9 = Integer.valueOf(100);
        Long num10 = Long.valueOf(10000l);
        Float num11 =  Float.valueOf(3.5f);
        Double num12 = Double.valueOf(3.5555);
        Boolean flag2 =  Boolean.valueOf(true);
        Character b = Character.valueOf('b');

        Integer num13 = Integer.valueOf("10000 ");

        System.out.println(num13.intValue());

        Long num15 = num13.longValue();

    }
}
