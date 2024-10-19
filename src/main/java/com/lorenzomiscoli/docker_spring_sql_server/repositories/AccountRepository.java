package com.lorenzomiscoli.docker_spring_sql_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lorenzomiscoli.docker_spring_sql_server.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
