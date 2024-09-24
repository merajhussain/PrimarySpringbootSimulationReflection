public class Main {
    public static void main(String[] args) {


        try {
            GreetingService greetingService = GreetingServiceFactory.getPrimaryGreetingService();
            System.out.println(greetingService.greet("James"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}