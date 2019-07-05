package com.mundeeppurewal.test;

import com.mundeeppurewal.main.RomanNumerals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;// = new RomanNumerals();

    @BeforeEach
    public void setUp() {
        romanNumerals = new RomanNumerals();
    }


    @Test
    void generateRomanNumerals_testForNumber1_ShouldReturnI() {
        assertEquals("I", romanNumerals.generateRomanNumerals(1));
    }

    @Test
    void generateRomanNumerals_testForNumber2_ShouldReturnII() {
        assertEquals("II", romanNumerals.generateRomanNumerals(2));
    }

    @Test
    void generateRomanNumerals_testForNumber3_ShouldReturnIII() {
        assertEquals("III", romanNumerals.generateRomanNumerals(3));
    }

    @Test
    void generateRomanNumerals_testForNumber4_ShouldReturnIV() {
        assertEquals("IV", romanNumerals.generateRomanNumerals(4));
    }

    @Test
    void generateRomanNumerals_testForNumber5_ShouldReturnV() {
        assertEquals("V", romanNumerals.generateRomanNumerals(5));
    }

    @Test
    void generateRomanNumerals_testForNumber6_ShouldReturnVI() {
        assertEquals("VI", romanNumerals.generateRomanNumerals(6));
    }

    @Test
    void generateRomanNumerals_testForNumber7_ShouldReturnVII() {
        assertEquals("VII", romanNumerals.generateRomanNumerals(7));
    }

    @Test
    void generateRomanNumerals_testForNumber8_ShouldReturnVIII() {
        assertEquals("VIII", romanNumerals.generateRomanNumerals(8));
    }

    @Test
    void generateRomanNumerals_testForNumber9_ShouldReturnIX() {
        assertEquals("IX", romanNumerals.generateRomanNumerals(9));
    }

    @Test
    void generateRomanNumerals_testForNumber10_ShouldReturnX() {
        assertEquals("X", romanNumerals.generateRomanNumerals(10));
    }

    @Test
    void generateRomanNumerals_testForNumber12_ShouldReturnXII() {
        assertEquals("XII", romanNumerals.generateRomanNumerals(12));
    }

    @Test
    void generateRomanNumerals_testForNumber14_ShouldReturnXIV() {
        assertEquals("XIV", romanNumerals.generateRomanNumerals(14));
    }

    @Test
    void generateRomanNumerals_testForNumber19_ShouldReturnXIX() {
        assertEquals("XIX", romanNumerals.generateRomanNumerals(19));
    }

    @Test
    void generateRomanNumerals_testForNumber20_ShouldReturnXX() {
        assertEquals("XX", romanNumerals.generateRomanNumerals(20));
    }

    @Test
    void generateRomanNumerals_testForNumber40_ShouldReturnXL() {
        assertEquals("XL", romanNumerals.generateRomanNumerals(40));
    }

    @Test
    void generateRomanNumerals_testForNumber45_ShouldReturnXLV() {
        assertEquals("XLV", romanNumerals.generateRomanNumerals(45));
    }

    @Test
    void generateRomanNumerals_testForNumber50_ShouldReturnL() {
        assertEquals("L", romanNumerals.generateRomanNumerals(50));
    }

    @Test
    void generateRomanNumerals_testForNumber78_ShouldReturnLXXVIII() {
        assertEquals("LXXVIII", romanNumerals.generateRomanNumerals(78));
    }

    @Test
    void generateRomanNumerals_testForNumber95_ShouldReturnXCV() {
        assertEquals("XCV", romanNumerals.generateRomanNumerals(95));
    }


    @Test
    void generateRomanNumerals_testForNumber400_ShouldReturnCDXLV() {
        assertEquals("CD", romanNumerals.generateRomanNumerals(400));
    }
    @Test
    void generateRomanNumerals_testForNumber445_ShouldReturnCDXLV() {
        assertEquals("CDXLV", romanNumerals.generateRomanNumerals(445));
    }

    @Test
    void generateRomanNumerals_testForNumber500_ShouldReturnD() {
        assertEquals("D", romanNumerals.generateRomanNumerals(500));
    }

    @Test
    void generateRomanNumerals_testForNumber700_ShouldReturnDCC() {
        assertEquals("DCC", romanNumerals.generateRomanNumerals(700));
    }
    @Test
    void generateRomanNumerals_testForNumber997_ShouldReturnCMXCVII() {
        assertEquals("CMXCVII", romanNumerals.generateRomanNumerals(997));
    }



    @Test
    void generateRomanNumerals_testForNumbe40_ShouldReturnXL() {
        assertEquals("I", romanNumerals.generateRomanNumerals(1));
    }

    @Test
    void generateRomanNumerals_testForNumbe90_ShouldReturnXC() {
        assertEquals("I", romanNumerals.generateRomanNumerals(1));
    }

    @Test
    void generateRomanNumerals_testForNumbe400_ShouldReturnCD() {
        assertEquals("I", romanNumerals.generateRomanNumerals(1));
    }

    @Test
    void generateRomanNumerals_testForNumbe900_ShouldReturnCM() {
        assertEquals("I", romanNumerals.generateRomanNumerals(1));
    }

    @Test
    void generateRomanNumerals_testForNumbe3999_ShouldReturnMMMCMXCIX() {
        assertEquals("MMMCMXCIX", romanNumerals.generateRomanNumerals(3999));
    }

}