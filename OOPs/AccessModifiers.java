public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Raunak Raj";
        myAcc.setPassword("Hello");
    }

}

class BankAccount {
    public String userName;
    private String password;

    void setPassword(String pwd) {
        password = pwd;

    }

}
