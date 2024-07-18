// import dataStatic.Data;


public class User implements UserManagement{
  private String username;
  private String password;


  public User(String username, String password) {
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

    // for(int i = 0; i < Data.users.length; i++){
    //     if(Data.users[i][0] == username && Data.users[i][1] == password){
    //       return "Login Berhasil";
    //     }
    //   }  
    if(username == this.username && password == this.password) return "Login berhasil";
      return "Username atau password salah";
  }
}
