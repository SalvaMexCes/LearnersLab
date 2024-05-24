package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
     public void testAdd() {
        People people = new People();
        Person person1 = new Person(1, "Cesar");
        Person person2 = new Person(2, "Alex");
        people.add(person1);
        people.add(person2);

        assertEquals(2, people.count());
        assertTrue(people.contains(person1) && people.contains(person2));
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person person1 = new Person(1, "Cesar");
        Person person2 = new Person(2, "Alex");
        people.add(person1);
        people.add(person2);
        people.remove(person1);

        assertEquals(1, people.count());
        assertFalse(people.contains(person1));
        assertTrue(!people.contains(person1));
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person1 = new Person(1, "Cesar");
        Person person2 = new Person(2, "Alex");
        people.add(person1);
        people.add(person2);
        Person foundID = people.findByID(1);

        assertEquals("Cesar", foundID.getName());

        foundID = people.findByID(3);
        assertNull(foundID);
    }

}