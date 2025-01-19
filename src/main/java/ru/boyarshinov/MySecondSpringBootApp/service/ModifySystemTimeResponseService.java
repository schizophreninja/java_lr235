package ru.boyarshinov.MySecondSpringBootApp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.boyarshinov.MySecondSpringBootApp.model.Response;
import ru.boyarshinov.MySecondSpringBootApp.util.DateTimeUtil;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

        log.info("modify response: {}", response);

        return response;
    }
}
