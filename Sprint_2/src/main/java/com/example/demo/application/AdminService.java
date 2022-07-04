package com.example.demo.application;

import com.example.demo.Core.Admin;

public class AdminService implements IAdminService{
    Admin admin = new Admin();

    @Override
    public boolean verify(int id) {
        return admin.verifyDriver(id);
    }

    
}
