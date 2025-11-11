package com.green.lms.cls.service;

import com.green.lms.cls.mapper.ClassMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassService {
    private final ClassMapper classMapper;
}
