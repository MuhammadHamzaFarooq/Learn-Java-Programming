package bank;
class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account  a1 = new Account();
        a1.name = "Muhammad Hamza Farooq";
        a1.email = "mhamza2021999@gmail.com";
        a1.setPassword("sufyan@202020");
        System.out.println(a1.getPassword());
    }
}
