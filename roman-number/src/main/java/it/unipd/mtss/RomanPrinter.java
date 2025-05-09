////////////////////////////////////////////////////////////////////
// Kevin Basso 2101077
// Filippo Rampazzo 2101097
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
   private static final Map<Character, String[]> ASCII = new HashMap<>();

   static {
      ASCII.put('I', new String[]{
         " _____ ",
         "|_   _|",
         "  | |  ",
         "  | |  ",
         " _| |_ ",
         "|_____|"});

      ASCII.put('V', new String[]{
         "__      __",
         "\\ \\    / /",
         " \\ \\  / / ",
         "  \\ \\/ /  ",
         "   \\  /   ",
         "    \\/    "});

      ASCII.put('X', new String[]{
         "__   __",
         "\\ \\ / /",
         " \\ V / ",
         "  > <  ",
         " / . \\ ",
         "/_/ \\_\\"});

      ASCII.put('L', new String[]{
         " _      ",
         "| |     ",
         "| |     ",
         "| |     ",
         "| |____ ",
         "|______|"});

      ASCII.put('C', new String[]{
         "  _____  ",
         " / ____| ",
         "| |      ",
         "| |      ",
         "| |____  ",
         " \\_____| "});

      ASCII.put('D', new String[]{
         " _____  ",
         "|  __ \\ ",
         "| |  | |",
         "| |  | |",
         "| |__| |",
         "|_____/ "});

      ASCII.put('M', new String[]{
         " __  __ ",
         "|  \\/  |",
         "| \\  / |",
         "| |\\/| |",
         "| |  | |",
         "|_|  |_|"});
   }

   public static String print(int num) throws RomanException {
      String roman = IntegerToRoman.convert(num);
      return printAsciiArt(roman);
   }

   public static String printAsciiArt(String romanNumber) throws RomanException {
      romanNumber = romanNumber.toUpperCase();
      StringBuilder result = new StringBuilder();

      for (char c : romanNumber.toCharArray()) {
          if (!ASCII.containsKey(c)) {
              throw new RomanException("Carattere non supportato: " + c);
          }
      }

      for (int line = 0; line < 6; line++) {
          StringBuilder lineStr = new StringBuilder();
          char[] chars = romanNumber.toCharArray();
          for (int i = 0; i < chars.length; i++) {
              lineStr.append(ASCII.get(chars[i])[line]);
              if (i < chars.length - 1) {
                  lineStr.append("  ");
              }
          }
          result.append(lineStr.toString()).append("\n");
      }

      return result.toString();
  }
}

