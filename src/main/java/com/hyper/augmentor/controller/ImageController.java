package com.hyper.augmentor.controller;

import com.hyper.augmentor.model.Image;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @PostMapping("/enhance")
    public Image enhance(@RequestBody Image image){
        return image;
    }
}
