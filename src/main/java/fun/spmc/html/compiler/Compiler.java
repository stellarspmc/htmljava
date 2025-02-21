package fun.spmc.html.compiler;

import fun.spmc.html.filetype.CSSFile;
import fun.spmc.html.filetype.Compile;
import fun.spmc.html.filetype.HTMLFile;
import fun.spmc.html.util.HTMLProperty;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;
import static org.reflections.scanners.Scanners.TypesAnnotated;

public class Compiler {

    public static void main(String[] args) {
        System.out.println(discover());
    }

    protected static Set<Class<?>> discover() {
        Reflections reflections = new Reflections("fun");
        return reflections.get(SubTypes.of(TypesAnnotated.with(Compile.class)).asClass());
    }

    public static void compile() throws InvocationTargetException, IllegalAccessException {
        for (Class<?> clazz: discover()) {
            String fileName = "";
            for (Method method : Compile.class.getDeclaredMethods()) {
                fileName = (String) method.invoke(Compile.class, (Object[])null);
            }

            if (clazz.isInstance(HTMLFile.class)) {

            } else if (clazz.isInstance(CSSFile.class)) {

            }
        }
    }
}
