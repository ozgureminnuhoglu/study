import java.math.BigDecimal;
import java.math.BigInteger;

public class LearnJava03 {
    public static void main(String[] args) {
        ///////////////////////////////////////
        // Variables
        ///////////////////////////////////////

        /*
         *  Variable Declaration
         */
        // Declare a variable using <type> <name>
        int fooInt = 0;
        // Declare multiple variables of the same
        // type <type> <name1>, <name2>, <name3>
        int fooInt1, fooInt2, fooInt3;

        /*
         *  Variable Initialization
         */

        // Initialize a variable using <type> <name> = <val>
        int barInt = 1;
        // Initialize multiple variables of same type with same
        // value <type> <name1>, <name2>, <name3>
        // <name1> = <name2> = <name3> = <val>
        int barInt1, barInt2, barInt3;
        barInt1 = barInt2 = barInt3 = 1;
        // Shorthand for multiple declarations
        int barInt4 = 1, barInt5 = 2;


        /*
         *  Variable types
         */
        // Byte - 8-bit signed two's complement integer
        // (-128 <= byte <= 127)
        byte fooByte = 100;

        // If you would like to interpret a byte as an unsigned integer
        // then this simple operation can help
        int unsignedIntLessThan256 = 0xff & fooByte;
        // this contrasts a cast which can be negative.
        int signedInt = (int) fooByte;

        // Short - 16-bit signed two's complement integer
        // (-32,768 <= short <= 32,767)
        short fooShort = 10000;

        // Integer - 32-bit signed two's complement integer
        // (-2,147,483,648 <= int <= 2,147,483,647)
        int bazInt = 1;

        // Long - 64-bit signed two's complement integer
        // (-9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,807)
        long fooLong = 100000L;
        // L is used to denote that this variable value is of type Long;
        // anything without is treated as integer by default.

        // Note: byte, short, int and long are signed. They can have positive and negative values.
        // There are no unsigned variants.
        // char, however, is 16-bit unsigned.

        // Float - Single-precision 32-bit IEEE 754 Floating Point
        // 2^-149 <= float <= (2-2^-23) * 2^127
        float fooFloat = 234.5f;
        // f or F is used to denote that this variable value is of type float;
        // otherwise it is treated as double.

        // Double - Double-precision 64-bit IEEE 754 Floating Point
        // 2^-1074 <= x <= (2-2^-52) * 2^1023
        double fooDouble = 123.4;

        // Boolean - true & false
        boolean fooBoolean = true;
        boolean barBoolean = false;

        // Char - A single 16-bit Unicode character
        char fooChar = 'A';

        // final variables can't be reassigned,
        final int HOURS_I_WORK_PER_WEEK = 9001;
        // but they can be initialized later.
        final double E;
        E = 2.71828;

        // BigInteger - Immutable arbitrary-precision integers
        //
        // BigInteger is a data type that allows programmers to manipulate
        // integers longer than 64-bits. Integers are stored as an array of
        // bytes and are manipulated using functions built into BigInteger
        //
        // BigInteger can be initialized using an array of bytes or a string.
        BigInteger fooBigInteger = new BigInteger("10");

        // BigDecimal - Immutable, arbitrary-precision signed decimal number
        //
        // A BigDecimal takes two parts: an arbitrary precision integer
        // unscaled value and a 32-bit integer scale
        //
        // BigDecimal allows the programmer complete control over decimal
        // rounding. It is recommended to use BigDecimal with currency values
        // and where exact decimal precision is required.
        //
        // BigDecimal can be initialized with an int, long, double or String
        // or by initializing the unscaled value (BigInteger) and scale (int).
        BigDecimal fooBigDecimal = new BigDecimal(fooBigInteger, fooInt);

        // Be wary of the constructor that takes a float or double as
        // the inaccuracy of the float/double will be copied in BigDecimal.
        // Prefer the String constructor when you need an exact value.
        BigDecimal tenCents = new BigDecimal("0.1");



        // \n is an escaped character that starts a new line
        String barString = "Printing on a new line?\nNo Problem!";
        // \t is an escaped character that adds a tab character
        String bazString = "Do you want to add a tab?\tNo Problem!";
        System.out.println(barString);
        System.out.println(bazString);

    }
}
