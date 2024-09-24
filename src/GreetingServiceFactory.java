import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class GreetingServiceFactory {

    public static GreetingService getPrimaryGreetingService() throws Exception {

        List<Class<? extends GreetingService>> implementations = new ArrayList<>();
        implementations.add(EnglishGreetingService.class);
        implementations.add(SpanishGreetingService.class);


        for (Class<? extends GreetingService> implementation : implementations) {
            if (implementation.isAnnotationPresent(Primary.class)) {
                // If the @Primary annotation is present, return that instance
                Constructor<? extends GreetingService> constructor = implementation.getConstructor();
                return constructor.newInstance();
            }
        }


        return (implementations.size()>0)?implementations.get(0).getConstructor().newInstance():null;
    }
}

