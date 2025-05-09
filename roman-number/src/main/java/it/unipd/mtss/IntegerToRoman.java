////////////////////////////////////////////////////////////////////
// Kevin Basso 2101077
// Filippo Rampazzo 2101097
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class IntegerToRoman {
   private static final int[] VALUES = {5, 4, 1};
   private static final String[] SYMBOLS = {"V", "IV", "I"};

   public static String convert(int num) throws RomanException {
       if (num < 1 || num > 8) {
           throw new RomanException("Input fuori dai limiti (1-8): " + num);
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
