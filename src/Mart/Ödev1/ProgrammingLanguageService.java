package Mart.Ödev1;

import java.util.List;

class ProgrammingLanguageService {
    ProgrammingLanguageRepository repository = new ProgrammingLanguageRepository();

    void add(ProgrammingLanguage language) {
        repository.add(language);
    }

    List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }

    ProgrammingLanguage getByName(String name) {
        return repository.getAll().stream().filter(l -> l.name.equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
