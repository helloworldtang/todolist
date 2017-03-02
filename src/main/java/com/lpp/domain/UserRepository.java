package com.lpp.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tangcheng on 2017/3/2.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
