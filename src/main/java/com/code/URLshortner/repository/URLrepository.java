package com.code.URLshortner.repository;

import com.code.URLshortner.model.URLmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface URLrepository extends JpaRepository<URLmodel,Integer> {

    @Query(value = "select originalurl from Url where shorturl = ?1 LIMIT 1", nativeQuery = true)
    String findByShortUrl(String id);
}
