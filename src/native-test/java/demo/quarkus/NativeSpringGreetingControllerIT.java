package demo.quarkus;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeSpringGreetingControllerIT extends SpringGreetingControllerTest {

    // Execute the same tests but in native mode.
}