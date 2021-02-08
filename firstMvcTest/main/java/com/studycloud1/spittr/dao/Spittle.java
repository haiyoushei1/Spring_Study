package com.studycloud1.spittr.dao;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

/*
对于表单提交，可以使用javax.validation.constraints中的注解对属性进行修饰，一般notnull，size就够了。
需要在使用的时候使用@Vaild开启变量的检验。在方法的形参处在变量前加。
 */
public class Spittle {
    @NotNull
    private final Long id;
    @NotNull
    @Size(min = 3, max = 16)
    private final String message;
    private Double latitude;
    private Double longitude;


    public Spittle(Long id, String message, Double latitude, Double longitude) {
        this.id = id;
        this.message = message;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spittle spittle = (Spittle) o;
        return id.equals(spittle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
