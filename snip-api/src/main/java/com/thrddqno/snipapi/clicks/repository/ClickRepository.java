package com.thrddqno.snipapi.clicks.repository;

import com.thrddqno.snipapi.clicks.domain.Click;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClickRepository extends JpaRepository<Click, Long> {
}
