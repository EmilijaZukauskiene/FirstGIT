package lt.sdacademy.advanced_features.annotations.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //taikomas programos vykdymo metu
@Target(ElementType.METHOD) //naudojama tik ant metodu
public @interface MyAnnotation {

    String value() default "";

    String name();

    int age();
}
