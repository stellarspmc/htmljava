package fun.spmc.html.compiler;

import fun.spmc.html.filetype.Compile;
import org.reflections.Reflections;

import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;
import static org.reflections.scanners.Scanners.TypesAnnotated;

public class CompileDiscoverer {

    public static void main(String[] args) {
        System.out.println(discover());
    }

    public static Set<Class<?>> discover() {
        Reflections reflections = new Reflections("fun");
        return reflections.get(SubTypes.of(TypesAnnotated.with(Compile.class)).asClass());
    }

}