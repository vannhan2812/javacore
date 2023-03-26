package Entity;

import java.util.Arrays;
import java.util.List;

public class Inventory {
    private long productId;
    private long warehouseId;
    private int quantity;

    static List<Inventory> inventories = Arrays.asList(
            new Inventory(1L,1L,2),
            new Inventory(2L,2L,1),
            new Inventory(3L,3L,8),
            new Inventory(4L,3L,4),
            new Inventory(3L,3L,9),
            new Inventory(3L,3L,5)
    );

    public Inventory(long productId, long warehouseId, int quantity) {
        this.productId = productId;
        this.warehouseId = warehouseId;
        this.quantity = quantity;
    }

    public Inventory() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Entity.Inventory{" +
                "productId=" + productId +
                ", warehouseId=" + warehouseId +
                ", quantity=" + quantity +
                '}';
    }
    public void findMaxQuantity(List<Inventory> inventories) {
        Inventory max;
        max = inventories.get(0);
        for (int i = 0; i< inventories.size(); i++) {
            if(inventories.get(i).getQuantity() > max.getQuantity()){
                max = inventories.get(i);
            }
            System.out.println("Max at the time of "+i+" is :"+max);
        }
    }
}
