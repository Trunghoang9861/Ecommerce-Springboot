package com.springboot.library.service.impl;

import com.springboot.library.dto.AdminDto;
import com.springboot.library.model.Admin;
import com.springboot.library.repository.AdminRepository;
import com.springboot.library.repository.RoleReopository;
import com.springboot.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleReopository roleReopository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setPassword(adminDto.getPassword());
        admin.setUsername(adminDto.getUsername());
        admin.setRoles(Arrays.asList(roleReopository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
