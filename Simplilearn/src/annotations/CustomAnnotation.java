package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Retention: Custom Annotation Ausführung zur Laufzeit
@Retention(RetentionPolicy.RUNTIME)
// @Target: An was soll die Custom Annotation ausgeführt werden?
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface CustomAnnotation {
    int value();
}
