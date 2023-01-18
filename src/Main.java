public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        car lada = new car();
        lada.brand = "Lada";
        lada.model = "Granda";
        lada.engineVolume = 1.7f;
        lada.color = "Желтый";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        car audi = new car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0f;
        audi.color = "Черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        car bmw = new car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0f;
        bmw.color = "Черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        car kia = new car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4f;
        kia.color = "Красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        car hyundai = new car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6f;
        hyundai.color = "Оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        lada.information();
        audi.information();
        bmw.information();
        kia.information();
        hyundai.information();
        car Car = new car("Lada", "Granta", 1.7f, "Желтый", 2015, "Россия");
        Car.information();
        car Car1 = new car("Audi", "A8 50 L TDI quattro", 3.0f, "Черный", 2020, "Германия");
        Car1.information();
        car Car2 = new car("BMW", "Z8", 3.0f, "Черный", 2021, "Германия");
        Car2.information();
        car Car3 = new car("Kia", "Sportage 4-го поколения", 2.4f, "Красный", 2018, "Южная Корея");
        Car3.information();
        car Car4 = new car("Hyundai", "Avante", 1.6f, "Оранжевый", 2016, "Южная Корея");
        Car4.information();

        // Домашнее задание 2
        human maxim = new human();
        maxim.name = "Максим";
        maxim.yearOfBirth = 1988;
        maxim.town = "Минск";
        maxim.jobTitle = "бренд-менеджер";
        human anya = new human();
        anya.name = "Аня";
        anya.yearOfBirth = 1993;
        anya.town = "Москва";
        anya.jobTitle = "методист образовательных программ";
        human katya = new human();
        katya.name = "Катя";
        katya.yearOfBirth = 1992;
        katya.town = "Калининград";
        katya.jobTitle = "продакт-менеджер";
        human artem = new human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.jobTitle = "директор по развитию бизнеса";
        maxim.hi();
        anya.hi();
        katya.hi();
        artem.hi();
        // Домашнее задание 2
        human maxim2 = new human("Максим", "Минск", 1988, "бренд-менеджер");
        human anya2 = new human("Аня", "Москва", 1993, "методист образовательных программ");
        human katya2 = new human("Катя", "Калининград", 1992, "продакт-менеджер");
        human artem2 = new human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        maxim2.hi();
        anya2.hi();
        katya2.hi();
        artem2.hi();
    }
}

