package Mart.Hafta1;

import java.util.List;

class TechnologyService {
    TechnologyRepository repository = new TechnologyRepository();

    void add(Technology technology) {
        repository.add(technology);
    }

    List<Technology> getAll() {
        return repository.getAll();
    }
}
