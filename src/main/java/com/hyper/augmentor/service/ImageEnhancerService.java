package com.hyper.augmentor.service;

import com.hyper.augmentor.model.Image;
import org.springframework.stereotype.Service;

@Service
public class ImageEnhancerService {

    public Image enhance(Image image){
        return image;
    }
}
