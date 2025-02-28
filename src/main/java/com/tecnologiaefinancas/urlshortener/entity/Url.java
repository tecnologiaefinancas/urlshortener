package com.tecnologiaefinancas.urlshortener.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "urls")
public class Url {

    @Id
    private String id;

    private String fullUrl;

    @Indexed(expireAfter = "1")
    private LocalDateTime expiresAt;

    public Url(){}

    public Url(String id, String fullUrl, LocalDateTime expiresAt){
        this.id = id;
        this.fullUrl = fullUrl;
        this.expiresAt = expiresAt;
    }

    public String getId(){
        return id;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public LocalDateTime getExpiresAt(){
        return expiresAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullUrl(String fullUrl){
        this.fullUrl = fullUrl;
    }

    public void setExpiresAt(LocalDateTime expiresAt){
        this.expiresAt = expiresAt;
    }
}
