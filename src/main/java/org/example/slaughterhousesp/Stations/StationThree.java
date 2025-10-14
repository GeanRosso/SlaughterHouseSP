package org.example.slaughterhousesp.Stations;

import org.example.slaughterhousesp.Repositories.PartsRepository;
import org.example.slaughterhousesp.Repositories.ProductRepository;
import org.example.slaughterhousesp.Entities.Product;
import org.example.slaughterhousesp.Entities.Tray;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StationThree
{
  private ProductRepository productRepo;
  private PartsRepository partsRepo ;

  public StationThree(ProductRepository productRepo, PartsRepository partsRepo) {
    this.productRepo = productRepo;
    this.partsRepo = partsRepo;
  }

  public Product packSingleProduct(Tray tray)
  {
    Product product = new Product(tray);
    product.setTotalWeight(tray.getPart().getWeight());
    // save the product to the database
    productRepo.save(product);
    return product;
  }

  //(double) half animal product, two trays, different part type
  public Product packHalfAnimalProduct(Tray tray1, Tray tray2)
  {
    if (tray1.getPart().getId() != tray2.getPart().getId() && tray1.getAnimal().getId() == tray2.getAnimal().getId())
    {
      Product product = new Product(tray1, tray2);
      product.setTotalWeight(tray1.getPart().getWeight() + tray2.getPart().getWeight());
      // save the product to the database
      productRepo.save(product);
      return product;
    }
    else
    {
      throw new IllegalArgumentException("Trays must contain parts from the same animal and different part types.");
    }
  }
}
