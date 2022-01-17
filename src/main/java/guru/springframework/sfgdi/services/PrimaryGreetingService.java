package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/27/19.
 */
// We are using java binding via GreetingServiceConfig instead
//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
