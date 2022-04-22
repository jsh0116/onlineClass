package com.example.onlineClass.service;

import com.example.onlineClass.entity.Member;

public interface LoginService {
    Member login(String id, String password);
}
