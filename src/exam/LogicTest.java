package exam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class LogicTest {

    @Test
    public void testSumLine() {

        //Arrange. Vilka värden ska vi testa mot.
        Logic logic = new Logic();
        int expected = 3;
        int actual = logic.getLines();

        //Act. Själva beräkningen av klassen vi ska testa
        logic.sumLines("Line number one");
        logic.sumLines("Line number two");
        logic.sumLines("Line number three");

        //Assert. Jämför om vi fick rätt resultat
        assertEquals(expected, actual);
    }

    @Test
    public void testSumChars() {

        //Arrange. Vilka värden ska vi testa mot.
        Logic logic = new Logic();
        int expected = 15;
        int actual = logic.getChars();

        //Act. Själva beräkningen av klassen vi ska testa
        logic.sumChars("Line number one");

        //Assert. Jämför om vi fick rätt resultat
        assertEquals(expected, actual);
    }

    @Test
    public void testTogether() {

        //Arrange. Vilka värden ska vi testa mot.
        Logic logic = new Logic();
        int expectedLines = 2;
        int expectedChars = 31;

        //Act. Själva beräkningen av klassen vi ska testa
        logic.sumLines("Line number one");
        logic.sumChars("Line number two");
        logic.sumLines("Line number three");
        logic.sumChars("Line number four");

        //Assert. Jämför om vi fick rätt resultat
        assertEquals(expectedLines, logic.getLines());
        assertEquals(expectedChars, logic.getChars());
    }
}