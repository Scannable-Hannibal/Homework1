package hello;

import org.joda.time.LocalTime;
// The below libraries were added by IDEA to fix errors
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

@RunWith(MockitoJUnitRunner.class)

public class HelloWorld {
    public static void main(String[] args) {
        MockitoAnnotations.initMocks(Greeter);

        @Rule MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}