package annotationEx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            //PrintAnnotation 하나씩 넣기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            //설정 정보를 이용해서 선 출력하기
            printLine(printAnnotation);
            //메소드 호출
            method.invoke(new Service());
            //설정 정보를 이용해서 선 출력
            printLine(printAnnotation);
            System.out.println();
        }
    }


    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            //number 얻기
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
        }
        System.out.println();
    }
}
