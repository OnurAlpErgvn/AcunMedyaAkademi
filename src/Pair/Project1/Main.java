package Pair.Project1;
import Pair.Project1.Entities.Instructor;
import Pair.Project1.Manager.InstructorManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InstructorManager instructorManager = new InstructorManager();
        List<Instructor> instructors = instructorManager.getInstructors();

        System.out.println("------------------------------------");

        instructorManager.add(new Instructor(3, "Onur Alp Ergüven")); // add method
        for (var item : instructors) {
            System.out.println(item.getId() + " " + item.getName());
        }
        System.out.println("------------------------------------");

        instructorManager.delete(instructors.get(2)); // delete method
        for (var item : instructors) {
            System.out.println(item.getId() + " " + item.getName());
        }
        System.out.println("-------------------------------------");

        Instructor foundInstructor = instructorManager.getById(2); // getById method
        if (foundInstructor != null) {
            System.out.println("Found Instructor: " + foundInstructor.getName());
        } else {
            System.out.println("Instructor not found!");
        }

        System.out.println("-------------------------------------");

        Instructor newInstructor = new Instructor(2, "Gökhan Mutlu"); // update method
        Instructor oldInstructor = instructorManager.getById(2);
        if (oldInstructor != null) {
            instructorManager.update(oldInstructor, newInstructor);
        }

        for (var item : instructors) {
            System.out.println(item.getId() + " " + item.getName());
        }
    }
}
