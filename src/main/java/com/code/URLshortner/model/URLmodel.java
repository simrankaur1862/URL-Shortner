package com.code.URLshortner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "urlmodel")
public class URLmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String shorturl;
    private String originalurl;
}
