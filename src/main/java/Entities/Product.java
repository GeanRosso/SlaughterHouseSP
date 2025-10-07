package Entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
@Entity
public class Product
{
  @Id
  private int productid;
  private String productType;
  @ElementCollection
  private List<Integer> trayReference;
  private int totalWeight;

  public Product(String productType)
  {
    this.productType = productType;
  }

  public Product() {}

  public void addTrayReference(int trayId, int trayWeight)
  {
    trayReference.add(trayId);
    totalWeight += trayWeight;
  }

  public int getProductid()
  {
    return productid;
  }

  public String getProductType()
  {
    return productType;
  }

  public int getTotalWeight()
  {
    return totalWeight;
  }

  public List<Integer> getTrayReference(){
    return trayReference;
  }

  public void setProductid(int productid)
  {
    this.productid = productid;
  }

  public void setTotalWeight(int totalWeight)
  {
    this.totalWeight = totalWeight;
  }
}
