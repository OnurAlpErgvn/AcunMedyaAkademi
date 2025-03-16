package Mart.Hafta1;

import java.util.ArrayList;
import java.util.List;

class ProgrammingLanguageRepository {
    List<ProgrammingLanguage> languages = new ArrayList<>(List.of(
            new ProgrammingLanguage(1, "Java"),
            new ProgrammingLanguage(2, "Python"),
            new ProgrammingLanguage(3, "C#")
    ));

    void add(ProgrammingLanguage language) {
        languages.add(language);
    }

    List<ProgrammingLanguage> getAll() {
        return languages;
    }

    void delete(int id) {
        languages.removeIf(l -> l.id == id);
    }

    void update(int id, String newName) {
        getById(id).name = newName;
    }

    ProgrammingLanguage getById(int id) {
        return languages.stream().filter(l -> l.id == id).findFirst().orElse(null);
    }
}
