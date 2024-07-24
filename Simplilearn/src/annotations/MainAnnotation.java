package annotations;

import java.lang.reflect.Method;

public class MainAnnotation {

    @CustomAnnotation(value= 10)
    public void sayHello() {
        System.out.println("Using a custom Annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MainAnnotation mainAnnotation = new MainAnnotation();
        Method method = mainAnnotation.getClass().getMethod("sayHello");
    }
}
