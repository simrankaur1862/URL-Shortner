package com.code.URLshortner.controller;

import com.code.URLshortner.model.URLmodel;
import com.code.URLshortner.service.URLservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("url/shortner")
@CrossOrigin(origins = "http://localhost:4200")
public class URLcontroller {
    @Autowired
    private URLservice urlservice;

  @GetMapping("/{id}")
   public String getOriginalUrl(@PathVariable String id){
      return urlservice.getOriginalUrl(id);
  }

  @PostMapping
    public URLmodel generateShortUrl(@RequestBody String url){
      return urlservice.generateShortUrl(url);
  }
}
