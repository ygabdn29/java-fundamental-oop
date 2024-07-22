// import dataStatic.Data;

public class User  extends Employee implements UserManagement{
  private String username;
  private String password;




  public User(String name, String email, String phone, String username, String password) {
    super(name, email, phone);
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String login(String username, String password) {
    if(username.length() == 0 || password.length() == 0) return "Invalid Login Attempt";

    if(username == this.username && password == this.password) return "Login berhasil";
    
    return "Username atau password salah";
  }

  // Override method
  @Override
  public void displayDetail(){
    System.out.println("Username:  " + username);
  }
}
