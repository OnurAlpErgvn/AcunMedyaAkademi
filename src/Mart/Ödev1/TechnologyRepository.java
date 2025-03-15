package Mart.Ödev1;

import java.util.ArrayList;
import java.util.List;

class TechnologyRepository {
    List<Technology> technologies = new ArrayList<>(List.of(
            new Technology(1, "Spring Boot", new ProgrammingLanguage(1, "Java"))
    ));

    void add(Technology technology) {
        technologies.add(technology);
    }

    List<Technology> getAll() {
        return technologies;
    }

    void delete(int id) {
        technologies.removeIf(t -> t.id == id);
    }

    void update(int id, String newName) {
        getById(id).name = newName;
    }

    Technology getById(int id) {
        return technologies.stream().filter(t -> t.id == id).findFirst().orElse(null);
    }
}
