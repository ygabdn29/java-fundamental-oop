public class Employee {
  private String name;
  private String email;
  private String phone;
  
  public Employee(String name, String email, String phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
  }

  // Method yang akan di override oleh class
  public void displayDetail(){
    System.out.println("Employee name: " + name);
    System.out.println("Employee email: " + email);
    System.out.println("Employee phone number: " + phone);
  }
}
