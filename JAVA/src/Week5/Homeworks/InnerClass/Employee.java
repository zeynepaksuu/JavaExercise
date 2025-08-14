package Week5.Homeworks.InnerClass;

public class Employee {
    private String name;
    private String surname;
    private ContactInfo contactInfo;

    public Employee(String name, String surname, String telephone, String email) {
        this.name = name;
        this.surname = surname;
        this.contactInfo = new ContactInfo(telephone, email);
    }

    static class ContactInfo {
        private String telephone;
        private String email;

        public ContactInfo(String telephone, String email) {
            this.telephone = telephone;
            this.email = email;
        }

        public String getTelephone() {
            return telephone;
        }

        public String getEmail() {
            return email;
        }
    }

    public void display() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Phone: " + contactInfo.getTelephone());
        System.out.println("Email: " + contactInfo.getEmail());
    }
}
