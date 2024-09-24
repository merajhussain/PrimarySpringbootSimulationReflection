import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // Applicable at the class level
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime for reflection
public @interface Primary {
}
