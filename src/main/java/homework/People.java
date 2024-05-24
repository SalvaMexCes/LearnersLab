package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    private List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findByID(long ID) {
        for (Person person : personList) {
            if (person.getID() == ID) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.removeIf(person -> person.getID() == id);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}
