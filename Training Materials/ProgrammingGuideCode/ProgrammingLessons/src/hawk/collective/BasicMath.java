package hawk.collective;

/**
 * This class is a wrapper class that contains a subset of the methods from the Math class
 */
public class BasicMath {

    /**
     * Returns the absolute value of an integer
     * @param value any integer, positive or negative
     * @return positive absolute value
     */
    public static int abs(int value)
    {
        return Math.abs(value);
    }

    /**
     * Generates a random number between 0 and 999
     * @return integer in range [0,999]
     */
    public static int random()
    {
        return (int)(Math.random() * 1000);
    }

    /**
     * Raises the base to the exponent
     * @param base
     * @param exponent
     * @return double == base ^ exponent
     */
    public static double pow(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }



}
