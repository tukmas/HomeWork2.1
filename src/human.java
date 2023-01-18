public class human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    human() {
    }
    human(String name, String town, int yearOfBirth, String jobTitle) {
        if(name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if(town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if(yearOfBirth >= 0 ) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if(jobTitle != null) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }

    void hi() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}