package com.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entities.users_f;

@Repository
public interface LoginRepo extends JpaRepository<users_f, String> {

	public users_f findByName(String name);
}
