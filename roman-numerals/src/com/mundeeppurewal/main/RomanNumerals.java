package com.mundeeppurewal.main;

public class RomanNumerals {

    public String generateRomanNumerals(int number) {
        StringBuilder romanNumerals = new StringBuilder();
        //number fraction is used to determine how many tenths, hundreds, thousands are part of the number to generate..
        //numerals
        if (number / 1000 > 0) {
            romanNumerals.append(createNumeralBlockOfThousandsUnit(number));
            number -= ((number / 1000) * 1000);
        }
        if (number / 100 > 0) {
            romanNumerals.append(createNumeralBlockOfHundredsUnit(number));
            number -= ((number / 100) * 100);
        }
        if (number / 10 > 0) {
            romanNumerals.append(createNumeralBlockOfTensUnit(number));
            number -= ((number / 10) * 10);
        }
        if (number > 0) {
            romanNumerals.append(createNumeralBlockOfOnesUnit(number));
        }
        return romanNumerals.toString();
    }

    //The code was a lot more concise before running under a single loop but it was a lot harder to read
    //Decided to split the code so that each unit has its own method.

    public String createNumeralBlockOfThousandsUnit(int number) {
        String numeral = "";
        int numberOfThousands = number / 1000;

        for (int i = 0; i < numberOfThousands; i++) {
            numeral += getNumberal(1000);
            number -= numberOfThousands;
        }
        return numeral;
    }

    public String createNumeralBlockOfHundredsUnit(int number) {
        String numeral = "";
        int numberOfHundreds = number / 100;

        for (int i = 0; i < numberOfHundreds; i++) {
            if (numberOfHundreds == 4) {
                numeral += (getNumberal(100) + getNumberal(500));
                break;
            } else if (numberOfHundreds == 9) {
                numeral += (getNumberal(100) + getNumberal(1000));
                break;
            } else if (numberOfHundreds == 5) {
                numeral += getNumberal(500);
                break;
            } else if (numberOfHundreds >= 5 && numberOfHundreds < 9) {
                numeral += getNumberal(500);
                numberOfHundreds -= 5;
            }
            numeral += getNumberal(100);
        }
        return numeral;
    }

    public String createNumeralBlockOfTensUnit(int number) {
        String numeral = "";
        int numberOfTens = number / 10;
        //checking for special character conditions and breaking out of the loop if satisfied
        for (int i = 0; i < numberOfTens; i++) {
            if (numberOfTens == 4) {
                numeral += (getNumberal(10) + getNumberal(50));
                break;
            } else if (numberOfTens == 9) {
                numeral += (getNumberal(10) + getNumberal(100));
                break;
            } else if (numberOfTens == 5) {
                numeral += getNumberal(50);
                break;
            } else if (numberOfTens >= 5 && numberOfTens < 9) {
                numeral += getNumberal(50);
                numberOfTens -= 5;
            }
            numeral += getNumberal(10);
        }
        return numeral;
    }

    public String createNumeralBlockOfOnesUnit(int numberOfOnes) {
        String numeral = "";

        for (int i = 0; i < numberOfOnes; i++) {
            if (numberOfOnes == 9) {
                numeral += (getNumberal(1) + getNumberal(10));
                break;
            } else if (numberOfOnes == 4) {
                numeral += (getNumberal(1) + getNumberal(5));
                break;
            }
            else if (numberOfOnes == 5){
                numeral += (getNumberal(5));
                break;
            }
            else if (numberOfOnes >= 5 && numberOfOnes < 9) {
                numeral += getNumberal(5);
                numberOfOnes -= 5;
            }
            numeral += getNumberal(1);
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
