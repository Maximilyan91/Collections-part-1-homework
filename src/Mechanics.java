import Transport.Transport;

public class Mechanics <M extends Transport> {

    private String name;
    private String surname;
    private String workCompany;

    public Mechanics(String name, String surname, String workCompany) {
        this.name = name;
        this.surname = surname;
        this.workCompany = workCompany;
    }


    public void doMaintenance() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getWorkCompany() {
        return workCompany;
    }
}



