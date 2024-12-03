package com.example;

public class StoreItem {
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    private StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price;
        this.shortDescription = storeItemBuilder.shortDescription;
        this.longDescription = storeItemBuilder.longDescription;
        this.stockAvailable = storeItemBuilder.stockAvailable;
        this.packagingType = storeItemBuilder.packagingType;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null!");
        }
    }

    public static class StoreItemBuilder {
        private final String name;
        private final Double price;
        private String shortDescription;
        private String longDescription;
        private Integer stockAvailable;
        private String packagingType;

        public StoreItemBuilder(String name, Double price) {
            this.name = name;
            this.price = price;
            if (name == null || price == null) {
                throw new IllegalArgumentException("Name and price must not be null!");
            }
        }

        // setter-like methods to set the rest of the optional fields
        public StoreItemBuilder shortDescription(String val) {
            this.shortDescription = val;
            return this;
        }

        public StoreItemBuilder longDescription(String val) {
            this.longDescription = val;
            return this;
        }

        public StoreItemBuilder stockAvailable(Integer val) {
            this.stockAvailable = val;
            return this;
        }

        public StoreItemBuilder packagingType(String val) {
            this.packagingType = val;
            return this;
        }

        public StoreItem build() {
            return new StoreItem(this);
        }

    } // end of Builder class

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
}
