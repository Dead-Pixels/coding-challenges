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
            //As there is a patt
            romanNumerals.append(createNumeralBlockOFUnits(number, THOUSANDS));
            number -= ((number / 1000) * 1000);
        }
        if (number / 100 > 0) {
            romanNumerals.append(createNumeralBlockOFUnits(number, HUNDREDS));
            number -= ((number / 100) * 100);
        }
        if (number / 10 > 0) {
            romanNumerals.append(createNumeralBlockOFUnits(number, TENS));
            number -= ((number / 10) * 10);
        }
        if (number > 0) {
            romanNumerals.append(createNumeralBlockOFUnits(number, ONES));
        }
        return romanNumerals.toString();
    }

//

    public String createNumeralBlockOFUnits(int number, int unit) {
        String numeral = "";
        int numberOfHundreds = number / unit;

        for (int i = 0; i < numberOfHundreds; i++) {
            if (numberOfHundreds == 4) {
                numeral += (getNumberal(1 * unit) + getNumberal(5 * unit));
                break;
            } else if (numberOfHundreds == 9) {
                numeral += (getNumberal(1 * unit) + getNumberal(10 * unit));
                break;
            } else if (numberOfHundreds == 5) {
                numeral += getNumberal(5 * unit);
                break;
            } else if (numberOfHundreds >= 5 && numberOfHundreds < 9) {
                numeral += getNumberal(5 * unit);
                numberOfHundreds -= 5;
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
