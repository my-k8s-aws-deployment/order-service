package org.codedecode.order.dto;

public class FoodItemsDTO {

    private long id;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Number price;
    private Integer restaurantId;
    private Integer quantity;

    public FoodItemsDTO() {
    }

    public FoodItemsDTO(long itemId, String itemName, String itemDescription, Number price, boolean isVeg, Integer restaurantId, Integer quantity) {
        this.id = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.isVeg = isVeg;
        this.restaurantId = restaurantId;
        this.quantity = quantity;
    }

    public long getItemId() {
        return id;
    }

    public void setItemId(long itemId) {
        this.id = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "FoodItemDTO{" +
                "itemId=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", isVeg=" + isVeg +
                ", price=" + price +
                ", restaurantId=" + restaurantId +
                ", quantity=" + quantity +
                '}';
    }
}


