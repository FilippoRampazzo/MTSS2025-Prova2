package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintI() throws RomanException {
        String expected = String.join("\n",
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|\n");  
        assertEquals(expected, RomanPrinter.printAsciiArt("I"));
    }

    @Test
    public void testPrintV() throws RomanException {
        String expected = String.join("\n",
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    \n");  
        assertEquals(expected, RomanPrinter.printAsciiArt("V"));
    }


    @Test
    public void testPrintX() throws RomanException {
        String expected = String.join("\n",
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
         "  > <  ",
         " / . \\ ",
         "/_/ \\_\\\n");  
        assertEquals(expected, RomanPrinter.printAsciiArt("X"));
    }

    @Test
    public void testPrintL() throws RomanException {
        String expected = String.join("\n",
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |____ ",
            "|______|\n");  
        assertEquals(expected, RomanPrinter.printAsciiArt("L"));
    }


    @Test
public void testPrint4() throws RomanException {
    String expected = String.join("\n",
        " _____   __      __",
        "|_   _|  \\ \\    / /",
        "  | |     \\ \\  / / ",
        "  | |      \\ \\/ /  ",
        " _| |_      \\  /   ",
        "|_____|      \\/    \n");

    // Test con il numero 4
    assertEquals(expected, RomanPrinter.printAsciiArt("IV"));
}

    @Test
public void testPrint6() throws RomanException {
    String expected = String.join("\n",
        "  _____     _____     _        __   __  __   __  __   __   _____   __   __",
        " / ____|   |  __ \\   | |       \\ \\ / /  \\ \\ / /  \\ \\ / /  |_   _|  \\ \\ / /",
        "| |        | |  | |  | |        \\ V /    \\ V /    \\ V /     | |     \\ V / ",
        "| |        | |  | |  | |         > <      > <      > <      | |      > <  ",
        "| |____    | |__| |  | |____    / . \\    / . \\    / . \\    _| |_    / . \\ ",
        " \\_____|   |_____/   |______|  /_/ \\_\\  /_/ \\_\\  /_/ \\_\\  |_____|  /_/ \\_\\\n"
    );

    // Test con il numero 6
    assertEquals(expected, RomanPrinter.printAsciiArt("CDLXXXIX"));
}

    @Test
    public void testInvalidCharacter() {
        try {
            RomanPrinter.printAsciiArt("A");
            fail("RomanException expected for invalid character.");
        } catch (RomanException e) {
            assertEquals("Carattere non supportato: A", e.getMessage());
        }
    }
}
