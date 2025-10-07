package Entities;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StationThree
{
  private final ProductRepository productRepo;
  private final PartsRepository partsRepo;

  public StationThree(ProductRepository productRepo, PartsRepository partsRepo) {
    this.productRepo = productRepo;
    this.partsRepo = partsRepo;
  }

  public Product packSingleProd(List<Tray> trays, String partType, int pieceCount) {
    if (pieceCount <= 0) throw new IllegalArgumentException("pieceCount must be > 0");
    if (partType == null || partType.isBlank()) throw new IllegalArgumentException("partType required");

    String wanted = partType.trim().toUpperCase();
    Product product = new Product("SINGLE_TYPE_" + wanted);

    int collected = 0;
    int totalWeight = 0;
    Set<Integer> usedTrayIds = new HashSet<>();

    for (Tray tray : trays) {
      if (!tray.getPartType().equalsIgnoreCase(wanted)) continue;
      List<Part> parts = tray.getParts();
      if (parts == null || parts.isEmpty()) continue;

      for (Part p : parts) {
        if (collected >= pieceCount) break;
        totalWeight += (int) Math.round(p.getWeight());
        usedTrayIds.add(tray.getTrayId());
        collected++;
      }
      if (collected >= pieceCount) break;
    }

    if (collected < pieceCount) {
      throw new IllegalStateException("Not enough parts of type " + wanted +
          " (needed " + pieceCount + ", found " + collected + ")");
    }

    for (Integer trayId : usedTrayIds) {
      product.addTrayReference(trayId, 0); // if you track per-tray used weight, pass it here
    }
    product.setTotalWeight(totalWeight);
    return productRepo.save(product);
  }


  public Product packHalfAnimal(List<Tray> trays) {
    Product product = new Product("HALF_ANIMAL");

    int totalWeight = 0;
    Set<Integer> usedTrayIds = new HashSet<>();
    List<String> required = List.of("HEAD", "LEG", "GUTS", "MEAT");

    for (String type : required) {
      Part chosen = null;
      Tray source = null;

      for (Tray tray : trays) {
        if (!tray.getPartType().equalsIgnoreCase(type)) continue;
        List<Part> parts = tray.getParts();
        if (parts != null && !parts.isEmpty()) {
          chosen = parts.get(0);
          source = tray;
          break;
        }
      }

      if (chosen == null) {
        throw new IllegalStateException("Missing required part type: " + type);
      }

      totalWeight += (int) Math.round(chosen.getWeight());
      usedTrayIds.add(source.getTrayId());
    }

    for (Integer trayId : usedTrayIds) {
      product.addTrayReference(trayId, 0);
    }
    product.setTotalWeight(totalWeight);
    return productRepo.save(product);
  }
}
