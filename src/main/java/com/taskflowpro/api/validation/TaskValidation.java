// src/main/java/com/taskflowpro/api/validation/TaskValidation.java
package com.taskflowpro.api.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = TaskValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskValidation {
    String message() default "Invalid task";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}