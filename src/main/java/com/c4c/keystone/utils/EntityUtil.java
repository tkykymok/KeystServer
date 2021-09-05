package com.c4c.keystone.utils;

import com.c4c.keystone.constants.Flag;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

@Component
public class EntityUtil {
    final String DELETE_FLG = "deleteFlg";
    final String CREATED_DATETIME = "createdDatetime";
    final String CREATED_USER = "createdUser";
    final String LAST_MODIFIED_DATETIME = "lastModifiedDatetime";
    final String LAST_MODIFIED_USER = "lastModifiedUser";
    final String VERSION_EX_KEY = "versionExKey";

    @SneakyThrows
    public <T> void setColumns4Insert(T entity, Integer userId) {
        Field[] declaredFields = entity.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            switch (declaredField.getName()) {
                case DELETE_FLG:
                    declaredField.setAccessible(true);
                    declaredField.set(entity, Flag.OFF);
                    break;
                case CREATED_DATETIME:
                case LAST_MODIFIED_DATETIME:
                    declaredField.setAccessible(true);
                    declaredField.set(entity, LocalDateTime.now());
                    break;
                case CREATED_USER:
                case LAST_MODIFIED_USER:
                    declaredField.setAccessible(true);
                    declaredField.set(entity, userId);
                    break;
                case VERSION_EX_KEY:
                    declaredField.setAccessible(true);
                    declaredField.set(entity, 0);
                    break;
                default:
                    break;
            }
        }
    }

    @SneakyThrows
    public <T> void setColumns4Update(T entity, Integer userId) {
        Field[] declaredFields = entity.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            switch (declaredField.getName()) {
                case LAST_MODIFIED_DATETIME:
                    declaredField.setAccessible(true);
                    declaredField.set(entity, LocalDateTime.now());
                    break;
                case LAST_MODIFIED_USER:
                    declaredField.setAccessible(true);
                    declaredField.set(entity, userId);
                    break;
                default:
                    break;
            }
        }
    }

}
