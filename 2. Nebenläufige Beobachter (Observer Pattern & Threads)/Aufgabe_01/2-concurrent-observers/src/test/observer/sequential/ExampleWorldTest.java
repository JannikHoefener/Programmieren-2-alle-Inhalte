package test.observer.sequential;

import main.observer.sequential.ConcreteObservee;
import main.observer.sequential.ConcreteObserver;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleWorldTest {

    private static final Logger LOGGER = Logger.getLogger(ExampleWorldTest.class.getName());

    @Test
    public void simulateUpdatesTest() {
        // Arrange
        final var observee = new ConcreteObservee();
        final var observer1 = new ConcreteObserver();
        final var observer2 = new ConcreteObserver();
        final var observer3 = new ConcreteObserver();

        observee.register(observer1);
        observee.register(observer2);
        observee.register(observer3);

        observer1.setObservee(observee);
        observer2.setObservee(observee);
        observer3.setObservee(observee);

        final var waitTime = 500;

        // Act
        final var start = Instant.now();

        observee.changeState(waitTime);

        final var finish = Instant.now();
        final var elapsedTime = Duration.between(start, finish).toMillis();
        LOGGER.info(String.format("Elapsed time in milliseconds: %d ", elapsedTime));

        // Assert
        assertEquals(waitTime, observer1.getValue());
        assertEquals(waitTime, observer2.getValue());
        assertEquals(waitTime, observer3.getValue());
    }
}
