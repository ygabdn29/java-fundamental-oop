public class Asset implements AssetManagement{
  private String assetName;
  private int assetType;

  public Asset(String assetName, int assetType) {
    this.assetName = assetName;
    this.assetType = assetType;
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

}
