public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Declaring primitive data types with default values
        boolean defaultBool = false;
        byte defaultByte = 0;
        short defaultShort = 0;
        int defaultInt = 0;
        long defaultLong = 0L;
        float defaultFloat = 0.0f;
        double defaultDouble = 0.0d;
        char defaultChar = '\u0000'; 

        
        boolean assignedBool = true;
        byte assignedByte = 10;
        short assignedShort = 1000;
        int assignedInt = 12345;
        long assignedLong = 123456789L;
        float assignedFloat = 10.5f;
        double assignedDouble = 99.99d;
        char assignedChar = 'A';

      
        System.out.println("Default Values:");
        System.out.println("boolean: " + defaultBool);
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: " + (int)defaultChar); 

      
        System.out.println("\nAssigned Values:");
        System.out.println("boolean: " + assignedBool);
        System.out.println("byte: " + assignedByte);
        System.out.println("short: " + assignedShort);
        System.out.println("int: " + assignedInt);
        System.out.println("long: " + assignedLong);
        System.out.println("float: " + assignedFloat);
        System.out.println("double: " + assignedDouble);
        System.out.println("char: " + assignedChar);
    }
}