package homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testConstructor() {
        long expectedID = 1L;
        String expectedName = "Cesar Machado";
        Person person = new Person(expectedID, expectedName);

        assertEquals(expectedID, person.getID());
        assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName() {
        Person person = new Person(1L, "Cesar Machado");
        String newName = "Jane Doe";
        person.setName(newName);

        assertEquals(newName, person.getName());
    }
}