package com.example.simple.service.impl;

import com.example.simple.service.NoticeService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class NoticeServiceImpl implements NoticeService {
    @Override
    public void login(int id) {
        System.out.println(id);
    }
}
