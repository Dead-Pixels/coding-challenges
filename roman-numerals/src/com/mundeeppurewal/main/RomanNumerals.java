package com.mundeeppurewal.main;

public class RomanNumerals {

    private static final int THOUSANDS = 1000;
    private static final int HUNDREDS = 100;
    private static final int TENS = 10;
    private static final int ONES = 1;

    /**
     * As there is a pattern for the type of symbol used we are simply calling the same method for building out
     * roman numeral symbols for thousands, hundreds, tens, and ones
     * We are building the pattern from left to right so we pass in the number and also the unit (THOUSANDS)
     * We then remove this unit from the original number and continue to the next unit (HUNDREDS..so on)
     */

    public String generateRomanNumerals(int number) {
        StringBuilder romanNumerals = new StringBuilder();

        if (number / 1000 > 0) {
            romanNumerals.append(createBlockOfNumeralUnits(number, THOUSANDS));
            number -= ((number / 1000) * 1000);
        }
        if (number / 100 > 0) {
            romanNumerals.append(createBlockOfNumeralUnits(number, HUNDREDS));
            number -= ((number / 100) * 100);
        }
        if (number / 10 > 0) {
            romanNumerals.append(createBlockOfNumeralUnits(number, TENS));
            number -= ((number / 10) * 10);
        }
        if (number > 0) {
            romanNumerals.append(createBlockOfNumeralUnits(number, ONES));
        }
        return romanNumerals.toString();
    }

    public String createBlockOfNumeralUnits(int number, int unit) {
        //Create blocks of 1000s, 100s, 10s, 1's based on unit provided and returns block to be appended to numeral String
        String numeral = "";
        int numberOfUnits = number / unit;

        for (int i = 0; i < numberOfUnits; i++) {
            if (numberOfUnits == 4) {
                numeral += (getNumberal(1 * unit) + getNumberal(5 * unit));
                break;
            } else if (numberOfUnits == 9) {
                numeral += (getNumberal(1 * unit) + getNumberal(10 * unit));
                break;
            } else if (numberOfUnits == 5) {
                numeral += getNumberal(5 * unit);
                break;
            } else if (numberOfUnits >= 5 && numberOfUnits < 9) {
                numeral += getNumberal(5 * unit);
                numberOfUnits -= 5;
            }
            numeral += getNumberal(1 * unit);
        }
        return numeral;
    }

    public String getNumberal(int number) {
        switch (number) {
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                return "";
        }
    }
}
