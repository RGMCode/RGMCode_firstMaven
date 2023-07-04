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

}