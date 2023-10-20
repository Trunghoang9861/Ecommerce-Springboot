package com.springboot.library.service;

import com.springboot.library.dto.AdminDto;
import com.springboot.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
