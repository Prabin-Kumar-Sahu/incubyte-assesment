package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LunarSpacecraftTest {


    @Test
    public void testMoveForward() {
        // Test moving forward in different directions
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');
        spacecraft.moveForward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'S');
        spacecraft.moveForward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'E');
        spacecraft.moveForward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'W');
        spacecraft.moveForward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'U');
        spacecraft.moveForward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'D');
        spacecraft.moveForward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
    }



    @Test
    public void testMoveBackward() {
        // Test moving backward in different directions
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');
        spacecraft.moveBackward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'S');
        spacecraft.moveBackward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'E');
        spacecraft.moveBackward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'W');
        spacecraft.moveBackward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'U');
        spacecraft.moveBackward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'D');
        spacecraft.moveBackward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
    }



    @Test
    public void testTurnLeft() {
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');

        spacecraft.turnLeft();
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'S');
        spacecraft.turnLeft();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'E');
        spacecraft.turnLeft();
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'W');
        spacecraft.turnLeft();
        assertEquals('S', spacecraft.getDirection());

        // For Up and Down directions, turning left does not change direction
        spacecraft = new LunarSpacecraft(0, 0, 0, 'U');
        spacecraft.turnLeft();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'D');
        spacecraft.turnLeft();
        assertEquals('D', spacecraft.getDirection());
    }




    @Test
    public void testTurnRight() {
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');

        spacecraft.turnRight();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'S');
        spacecraft.turnRight();
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'E');
        spacecraft.turnRight();
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'W');
        spacecraft.turnRight();
        assertEquals('N', spacecraft.getDirection());

        // For Up and Down directions, turning right does not change direction
        spacecraft = new LunarSpacecraft(0, 0, 0, 'U');
        spacecraft.turnRight();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'D');
        spacecraft.turnRight();
        assertEquals('D', spacecraft.getDirection());
    }




    @Test
    public void testTurnUp() {
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');

        spacecraft.turnUp();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'S');
        spacecraft.turnUp();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'E');
        spacecraft.turnUp();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'W');
        spacecraft.turnUp();
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'U');
        spacecraft.turnUp();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'D');
        spacecraft.turnUp();
        assertEquals('D', spacecraft.getDirection());
    }




    @Test
    public void testTurnDown() {
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');

        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'S');
        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'E');
        spacecraft.turnDown();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'W');
        spacecraft.turnDown();
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'U');
        spacecraft.turnDown();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new LunarSpacecraft(0, 0, 0, 'D');
        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());
    }


    @Test
    public void testExecuteCommands() {
        LunarSpacecraft spacecraft = new LunarSpacecraft(0, 0, 0, 'N');
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        spacecraft.executeCommands(commands);
        assertEquals("(-1, 1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }
}

