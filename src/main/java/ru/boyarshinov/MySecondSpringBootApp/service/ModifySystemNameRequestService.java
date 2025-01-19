package ru.boyarshinov.MySecondSpringBootApp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.boyarshinov.MySecondSpringBootApp.model.Request;
import ru.boyarshinov.MySecondSpringBootApp.model.Systems;

@Service
@Qualifier("ModifySystemNameRequestService")
public class ModifySystemNameRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request){
        request.setSystemName(Systems.S1);

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        
        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}