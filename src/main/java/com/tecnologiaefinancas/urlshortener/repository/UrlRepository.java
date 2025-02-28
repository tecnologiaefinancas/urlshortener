package com.tecnologiaefinancas.urlshortener.repository;

import com.tecnologiaefinancas.urlshortener.entity.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String > {
}
