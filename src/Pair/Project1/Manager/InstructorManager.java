package Pair.Project1.Manager;
import Pair.Project1.Entities.Instructor;
import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private List<Instructor> instructors;

    public InstructorManager() {
        instructors = new ArrayList<>();
        instructors.add(new Instructor(1, "Muhammet İnan"));
        instructors.add(new Instructor(2, "Engin Demiroğ"));
    }

    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    public void delete(Instructor instructor) {
        instructors.remove(instructor);
    }

    public void update(Instructor oldInstructor, Instructor newInstructor) {
        int index = instructors.indexOf(oldInstructor);
        if (index != -1) {
            instructors.set(index, newInstructor);
        }
    }

    public Instructor getById(int id) { // Hata düzeltilmiş versiyon
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }
}
