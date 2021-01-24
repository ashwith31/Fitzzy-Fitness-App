package com.example.fitnesscapstone.dataModels;

public class homefrag_recycler_data {
    int imageId;
    String cardTitle;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public homefrag_recycler_data() {
    }

    public homefrag_recycler_data(int imageId, String cardTitle) {
        this.imageId = imageId;
        this.cardTitle = cardTitle;
    }
}
