package Week2.Exercises.Practices.OOP.Encapsulation;

public class User {

    private String username;
    private String password;

    public User(String password, String username) {
        setPassword(password);
        this.password = password;
        setUsername(username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() >=8 && password.length() <=11) {
            this.password = password;
        }else {
            System.out.println("en az 8 en fazla 11 haneli bir sifre giriniz.");
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username.length() >=1 && username.length() <=12) {
            this.username = username;
        }else {
            System.out.println("en az 1 en fazla 12 haneli bir username giriniz.");
        }

    }
}
