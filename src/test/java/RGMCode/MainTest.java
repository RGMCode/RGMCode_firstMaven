package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void whenAddwith5and6_thenExpect11() {
        //given
        int a = 5;
        int b = 6;
        int res = 11;

        //when
        int actual = Main.add(a,b);

        //then
        assertEquals(res, actual);
    }

    @Test
    void check100(){
        //given
        int checkNum = 101;

        //when
        boolean act = Main.checkValue100(checkNum);

        //then
        assertTrue(act);
    }


    /*User gibt sein Alter ein und nach einer rüfung werden folgende Werte zurückgegeben
     * unter 14 = Kind
     * zwischen 14 und 16 = Minderjährig
     * zwischen 16 und 18 = Jugendlich
     * 18+ Erwachsen
     * */

    @Test
    void whenCheckAge_with10_thenExpectKind(){
        //GIVEN
        int age = 10;

        //WHEN
        String actual = Main.checkAge(age);

        //THEN
        assertEquals("Kind", actual);
    }

    @Test
    void whenCheckAge_with14_thenExpectMinderjaehrig(){
        //GIVEN
        int age = 14;

        //WHEN
        String actual = Main.checkAge(age);

        //THEN
        assertEquals("Minderjährig", actual);
    }

    @Test
    void whenCheckAge_with16_thenExpectJugendlich(){
        //GIVEN
        int age = 16;

        //WHEN
        String actual = Main.checkAge(age);

        //THEN
        assertEquals("Jugendlich", actual);
    }

    @Test
    void whenCheckAge_with18_thenExpectErwachsen(){
        //GIVEN
        int age = 18;

        //WHEN
        String actual = Main.checkAge(age);

        //THEN
        assertEquals("Erwachsen", actual);
    }



}