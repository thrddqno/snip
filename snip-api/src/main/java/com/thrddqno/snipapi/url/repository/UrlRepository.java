package com.thrddqno.snipapi.url.repository;

import com.thrddqno.snipapi.url.domain.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
}
