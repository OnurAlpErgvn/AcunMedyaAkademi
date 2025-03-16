package Mart.Hafta1;

import java.util.List;

class IdGenerator {
    static int generateId(List<?> list) {
        return list.size() + 1;
    }
}
