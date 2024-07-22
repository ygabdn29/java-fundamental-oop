public class Asset implements AssetManagement{
  private String assetName;
  private int assetType;
  private String assetStatus; 


  public Asset(String assetName, int assetType, String assetStatus) {
    this.assetName = assetName;
    this.assetType = assetType;
    this.assetStatus = assetStatus;
  }

  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public int getAssetType() {
    return assetType;
  }

  public void setAssetType(int assetType) {
    this.assetType = assetType;
  }

  public String getAssetStatus() {
    return assetStatus;
  }

  public void setAssetStatus(String assetStatus) {
    this.assetStatus = assetStatus;
  }

  @Override
  public void displayAsset() {
    System.out.println("Asset Name: "+ getAssetName());

    if(getAssetType() == 1) {
      System.out.println("Asset Type: Laptop" );
    }
    if(getAssetType() == 2) {
      System.out.println("Asset Type: Handphone" );
    }
    System.out.println("--------------------------------");
  }
  
  @Override 
  public void displayAsset(String assetStatus){
    if(getAssetStatus() == assetStatus) {

    System.out.println("Asset Name: "+ getAssetName());
  
    if(getAssetType() == 1) {
      System.out.println("Asset Type: Laptop" );
    }
    if(getAssetType() == 2) {
      System.out.println("Asset Type: Handphone" );
    }

    System.out.println("Asset Status: " + getAssetStatus());
    System.out.println("-------------------------------------");
  }
  }

}
