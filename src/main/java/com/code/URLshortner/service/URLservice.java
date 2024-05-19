package com.code.URLshortner.service;

import com.code.URLshortner.model.URLmodel;
import com.code.URLshortner.repository.URLrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.code.URLshortner.logic.GenerateShortUrl.getShortUrl;
import static com.code.URLshortner.logic.GenerateShortUrl.isUrlValid;

@Service
public class URLservice {
    @Autowired
    private URLrepository urlRepository;

    public String getOriginalUrl(String id){

        return urlRepository.findByShortUrl(id);
    }

    public URLmodel generateShortUrl(String url) {
        if(! isUrlValid(url)) {
            System.out.println("URL is not valid");
            return null;
        }

        URLmodel urlObject = new URLmodel();
        urlObject.setOriginalurl(url);
        urlObject.setShorturl(getShortUrl(url));

        return urlRepository.save(urlObject);
    }
}
