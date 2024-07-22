import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    User userKevinn = new User("Kevin", "kevin@testmail.com", "085712402640", "kevinn", "kevin123");
    User userJulia = new User("Julia", "julia@testmail.com", "085511592741", "juliaa", "julia123");
    User userAlexx = new User("Alex", "alex@testmail.com", "085616794980", "alexx", "alex123");

    // 22/07/2024 - Memasukkan user ke dalam collection
    List<User> userList = new ArrayList<User>();
    userList.add(userKevinn);
    userList.add(userJulia);
    userList.add(userAlexx);

    // User userJuliaa = new User("juliaa", "julia123");
    // User userAlexx = new User("alexx", "alex123");

    // Asset asset1 = new Asset("ASUS A46CM", 1, "Available");
    // Asset asset2 = new Asset("ASUS A46CB", 1, "Available");
    // Asset asset3 = new Asset("LENOVO IDEAPAD 330", 1, "Borrowed");
    // Asset asset4 = new Asset("ACER INSPIRE 5", 1, "Available");
    // Asset asset5 = new Asset("SAMSUNG GALAXY S24", 2, "Borrowed");
    // Asset asset6 = new Asset("HP ENVY 13", 1, "Borrowed");
    // Asset asset7 = new Asset("Huawei P40", 2, "Available");
    // Asset asset8 = new Asset("Microsoft Surface Laptop 3", 1, "Borrowed");
    // Asset asset9 = new Asset("LG Velvet", 2, "Available");
    // Asset asset10 = new Asset("Razer Blade Stealth 13", 1, "Borrowed");

    
    // Asset [] arrayAsset = new Asset[10];
    // arrayAsset[0] = asset1;
    // arrayAsset[1] = asset2;
    // arrayAsset[2] = asset3;
    // arrayAsset[3] = asset4;
    // arrayAsset[4] = asset5;
    // arrayAsset[5] = asset6;
    // arrayAsset[6] = asset7;
    // arrayAsset[7] = asset8;
    // arrayAsset[8] = asset9;
    // arrayAsset[9] = asset10;

    // 22/07/2024 - Mencoba menggunakan collection 
    List<Asset> assetList = new ArrayList<Asset>();
    assetList.add(new Asset("ASUS A46CM", 1, "Available"));
    assetList.add(new Asset("ASUS A46CB", 1, "Available"));
    assetList.add(new Asset("LENOVO IDEAPAD 330", 1, "Borrowed"));
    assetList.add(new Asset("ACER INSPIRE 5", 1, "Available"));
    assetList.add(new Asset("SAMSUNG GALAXY S24", 2, "Borrowed"));
    assetList.add(new Asset("HP ENVY 13", 1, "Borrowed"));
    assetList.add(new Asset("Huawei P40", 2, "Available"));
    assetList.add(new Asset("Microsoft Surface Laptop 3", 1, "Borrowed"));
    assetList.add(new Asset("LG Velvet", 2, "Available"));
    assetList.add(new Asset("Razer Blade Stealth 13", 1, "Borrowed"));
    
    // System.out.println(arrayAsset[0]);

    // System.out.println(userKevinn.login("kevinn", "kevin123"));
    // userKevinn.displayDetail();

    // for( int i = 0; i < arrayAsset.length; i++){
    //   arrayAsset[i].displayAsset();
    // } 

    // System.out.println("Asset yang available");
    // for(int i = 0; i < arrayAsset.length; i++){
    //   arrayAsset[i].displayAsset("Available");
    // }
    // System.out.println("=======================================");
    // System.out.println("Asset yang borrowed");
    // for(int i = 0; i < arrayAsset.length; i++){
    //   arrayAsset[i].displayAsset("Borrowed");
    // }

    // 22-07-2024 - Mencoba menggunakan stream
    // Menampilkan semua asset
  System.out.println("=== Display all asset ===");
    assetList.forEach(a -> {
      System.out.println(a.getAssetName() + " " + a.getAssetType() + " "+ a.getAssetStatus());
      System.out.println("-----------------");
  });

  System.out.println("================================");
  System.out.println("=== Display Available Asset ===");

  // Menampilkan semua asset dengan status available
  assetList.stream()
    .filter(a -> a.getAssetStatus() == "Available")
    .forEach(x -> {
      System.out.println(x.getAssetName() + " " + x.getAssetType() + " "+ x.getAssetStatus());
      System.out.println("-----------------");
    });

  System.out.println("================================");
  System.out.println("=== Display Borrowed Asset ===");

  // Menampilkan semua asset dengan status available
  assetList.stream()
    .filter(a -> a.getAssetStatus() == "Borrowed")
    .forEach(x -> {
      System.out.println(x.getAssetName() + " " + x.getAssetType() + " "+ x.getAssetStatus());
      System.out.println("-----------------");
    });
  }
}