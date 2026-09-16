package uk.project;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Trying Fletcher32
        // define a binary string
        // split it into 16 bit chunks. Pad the remaining chunk if necessary
        /**
         * Algorithm:
         * Initialise empty variables A & B to 0.
         * For each chunk in the binary string a series of updates to A and B will happen:
         *      A = ( A + chunk )
         *      B = ( B + A )
         *      // ensure variables storing A and B are large enough to prevent integer overflow, or perform the modulo every loop for some compute cost.
         * Perform A % 65535
         * Perform B % 65535
         * Shift A by 16 bits to the left and append B into the empty space, giving you a 32 bit checksum value to attach with the data.
         * For simplicity, could modulo every iteration for now.
         */

        // How do we even split the byte stream? We'd have to find its length first.
        /**
         * Say data = 011001011
         * len(data) = 9. Indexes = 0 - 8
         * To split data into 2 bit chunks, we take 0-2 (exclusive end), 2-4, 4-6, 6-8, 8-*9* but index 9 is out of bounds. So we need to stop when reaching the final index on the exclusive end, and instead take the rest of the string, which would just be index 8.
         * For 4 bit chunks, it's 0-4, 4-8, 8
         * For 6 bit chunks, it's 0-6, 6-8, 8
         * How do we account for the remaining chunk without going out of bounds? Either there's a check before the loop for the indexes to be taken or we handle it inside the loop.
         *
         * Say we want to split a 52 bit string into 16 bit chunks:
         * 52 / 16 = 3 (note java's division types depends on the data type. Only int/int gives you integer floored quotient)
         * 52 % 16 = 4 (don't need this if natural has a quick way to access the last index)
         * So we get three 16 bit chunks and one 4 bit chunk, which we pad with 0s via bit shifting.
         * How do we translate into indexes?
         * Integer dividing length by 16 gives whole chunks. Multiplying the int quotient by 16 gives final whole chunk index (exclusive):
         *      16 * (52 i/ 16) = 48.
         *      Then you take index 48 + whatever is left for the final chunk. Can check which index you're on inside the loop.
         * You can define the index in the next loop as the index in the previous loop + the chunk length unless that value exceeds the integer division of stringLength i/ chunkLength
         *
         * So values needed are:
         *  Binary Data, length of Data, Chunk Length (16), (Length of Data) i/ (Chunk Length).
         *
         * Test Data:
         * Binary of different sizes: <32Bit, 32Bit, >32bit, 64bit, non-integer dividend.
         */

        int chunkSize = 2; // Chunk size in bits
        // binary numbers in java must begin with a prefix 0b<binary>. Long is 64 bits, Int is 32 bits, Short is 16, byte is 8
        // Java only has signed binaries.
        // To store an unsigned 16bit value, you need 32 bits to start with (16bit value & 16bit mask of 1s). Once you're done, cast it back down to an int with (int) result.
        // You could also recast the type during initialisation

        // Hexadecimal Masks. They're all read as -1 by java, but they're all a full set of 1s.
        byte mask8   = (byte) 0xFF;
        short mask16 = (short) 0xFFFF;
        int mask32   = 0xFFFFFFFF;
        long mask64  = 0xFFFFFFFFFFFFFFFFL;

        System.out.println(mask64);

    }
}
