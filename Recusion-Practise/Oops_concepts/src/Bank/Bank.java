package Bank;
class Account {
    public String name;
    protected String email;
    private String password;
    // private wale ko niche access nhi kr skte isliye ab topic aya ek.
    // getters and setters.
    public String getPassword(){
        return this.password;
    }
    public void  setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Ritik";
        account1.email = "ritiksh2408@gmail.com";
       // account1.password = "abcd"; // error h kyuki private function not access.
      account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
