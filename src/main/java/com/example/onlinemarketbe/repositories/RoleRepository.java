package com.example.onlinemarketbe.repositories;

import com.example.onlinemarketbe.model.ERole;
import com.example.onlinemarketbe.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    public Role findRoleById(int id);
    public Role findRoleByName(ERole name);
}
