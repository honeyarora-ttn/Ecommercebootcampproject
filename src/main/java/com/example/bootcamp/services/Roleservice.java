package com.example.bootcamp.services;

import com.example.bootcamp.entities.Role;
import com.example.bootcamp.repos.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class Roleservice {

    @Autowired
    private RoleRepository roleRepository;

    public void save(String authority){
        if(roleRepository.findByAuthority(authority)==null){
            log.info("-??????????????????????????????????????????????????????????????????????????????????????????");
            roleRepository.save(new Role(authority));
        }
    }

}