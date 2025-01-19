package ru.boyarshinov.MySecondSpringBootApp.service;

import org.springframework.stereotype.Service;
import ru.boyarshinov.MySecondSpringBootApp.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
