////////////////////////////////////////////////////////////////////
// Kevin Basso 2101077
// Filippo Rampazzo 2101097
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class IntegerToRoman {
   private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
   private static final String[] SYMBOLS = {
       "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
   };

   public static String convert(int num) throws RomanException {
       if (num < 1 || num > 1000) {
           throw new RomanException("Input fuori dai limiti (1-1000): " + num);
       }

       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < VALUES.length; i++) {
           while (num >= VALUES[i]) {
               sb.append(SYMBOLS[i]);
               num -= VALUES[i];
           }
       }
       return sb.toString();
   }
}
