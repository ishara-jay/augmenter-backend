package com.hyper.augmentor.model;

import lombok.Data;

@Data
public class Image {

    public Image(String image) {
        this.image = image;
    }

    private String image;

    public String getImage() {
        return image;
    }
}
