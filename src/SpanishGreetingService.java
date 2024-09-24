

@Primary
public class SpanishGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hola, " + name;
    }
}

