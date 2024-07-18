public class Main {
  public static void main(String[] args) {
    User userKevinn = new User("kevinn", "kevin123");
    User userJuliaa = new User("juliaa", "julia123");
    User userAlexx = new User("alexx", "alex123");

    Asset asset1 = new Asset("ASUS A46CM", 1);
    Asset asset2 = new Asset("ASUS A46CB", 1);
    Asset asset3 = new Asset("LENOVO IDEAPAD 330", 1);
    Asset asset4 = new Asset("ACER INSPIRE 5", 1);
    Asset asset5 = new Asset("SAMSUNG GALAXY S24", 2);
    Asset asset6 = new Asset("HP ENVY 13", 1);
    Asset asset7 = new Asset("Huawei P40", 2);
    Asset asset8 = new Asset("Microsoft Surface Laptop 3", 1);
    Asset asset9 = new Asset("LG Velvet", 2);
    Asset asset10 = new Asset("Razer Blade Stealth 13", 1);

    Asset [] arrayAsset = new Asset[10];
    arrayAsset[0] = asset1;
    arrayAsset[1] = asset2;
    arrayAsset[2] = asset3;
    arrayAsset[3] = asset4;
    arrayAsset[4] = asset5;
    arrayAsset[5] = asset6;
    arrayAsset[6] = asset7;
    arrayAsset[7] = asset8;
    arrayAsset[8] = asset9;
    arrayAsset[9] = asset10;

    System.out.println(userKevinn.login());

    for( int i = 0; i < arrayAsset.length; i++){
      arrayAsset[i].displayAsset();
    } 
  }
   
}