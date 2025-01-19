package ru.boyarshinov.MySecondSpringBootApp.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.boyarshinov.MySecondSpringBootApp.exception.UnsupportedCodeException;
import ru.boyarshinov.MySecondSpringBootApp.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if(bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
        else if(bindingResult.getFieldValue("uid").equals("123")) {
            throw new UnsupportedCodeException("uid 123 недоступен!");
        }
    }
}
