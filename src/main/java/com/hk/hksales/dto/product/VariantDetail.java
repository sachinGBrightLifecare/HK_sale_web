package com.hk.hksales.dto.product;

public class VariantDetail {
    private String variantId;
    private String name;
    private String imageUrl;
    private String description;
    private Double mrp;
    private Double discountMrp;
    private Integer rating;


    public VariantDetail(){}

    public VariantDetail(String variantId, String name, String imageUrl, String description, Double mrp, Double discountMrp) {
        this.variantId = variantId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.mrp = mrp;
        this.discountMrp = discountMrp;
    }


    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Double getDiscountMrp() {
        return discountMrp;
    }

    public void setDiscountMrp(Double discountMrp) {
        this.discountMrp = discountMrp;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
