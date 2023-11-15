package com.zaurtregulov.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default "xyz.com";

    public String message() default "email mast end with xyz ";

    public Class<?>[] groups()default {};
    public Class<? extends Payload> []payload() default {};
}
