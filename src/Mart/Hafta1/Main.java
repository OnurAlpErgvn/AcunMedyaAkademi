package Mart.Hafta1;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgrammingLanguageService langService = new ProgrammingLanguageService();
        TechnologyService techService = new TechnologyService();

        while (true) {
            System.out.println("1- Programlama Dili Ekle");
            System.out.println("2- Teknoloji Ekle");
            System.out.println("3- Programlama Dillerini Listele");
            System.out.println("4- Teknolojileri Listele");
            System.out.println("5- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            if (secim == 1) {
                System.out.print("Programlama Dili Adı: ");
                String name = scanner.nextLine();
                langService.add(new ProgrammingLanguage(IdGenerator.generateId(langService.getAll()), name));
            } else if (secim == 2) {
                System.out.print("Teknoloji Adı: ");
                String name = scanner.nextLine();
                System.out.print("Bağlı Olduğu Programlama Dili Adı: ");
                String langName = scanner.nextLine();
                ProgrammingLanguage lang = langService.getByName(langName);
                if (lang != null) {
                    techService.add(new Technology(IdGenerator.generateId(techService.getAll()), name, lang));
                } else {
                    System.out.println("Geçersiz Programlama Dili Adı!");
                }
            } else if (secim == 3) {
                System.out.println("Programlama Dilleri:");
                for (ProgrammingLanguage lang : langService.getAll()) {
                    System.out.println(lang.id + " - " + lang.name);
                }
            } else if (secim == 4) {
                System.out.println("Teknolojiler:");
                for (Technology tech : techService.getAll()) {
                    System.out.println(tech.id + " - " + tech.name + " (" + tech.programmingLanguage.name + ")");
                }
            } else if (secim == 5) {
                break;
            } else {
                System.out.println("Geçersiz seçim!");
            }
        }
        scanner.close();
    }
}
