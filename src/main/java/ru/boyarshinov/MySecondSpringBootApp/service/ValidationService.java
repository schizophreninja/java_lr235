package ru.boyarshinov.MySecondSpringBootApp.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.boyarshinov.MySecondSpringBootApp.exception.UnsupportedCodeException;
import ru.boyarshinov.MySecondSpringBootApp.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}
