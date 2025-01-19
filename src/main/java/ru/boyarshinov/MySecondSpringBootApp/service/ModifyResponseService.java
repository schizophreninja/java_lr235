package ru.boyarshinov.MySecondSpringBootApp.service;

import org.springframework.stereotype.Service;
import ru.boyarshinov.MySecondSpringBootApp.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
