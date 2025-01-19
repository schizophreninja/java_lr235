package ru.boyarshinov.MySecondSpringBootApp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String uid; // Уникальный идентификатор сообщение
    private String operationUid; // Уникальный идентификатор операции
    private String systemTime; // Время создания сообщения
    private Codes code; // Код ошибки
    private Double annualBonus; // Годовая премия
    private ErrorCodes errorCode; // Расшифровка кода
    private ErrorMessages errorMessage; // Сообщение об ошибке

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", code='" + code + '\'' +
                ", annualBonus='" + annualBonus + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
