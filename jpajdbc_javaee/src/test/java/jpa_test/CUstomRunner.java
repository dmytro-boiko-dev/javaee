package jpa_test;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CUstomRunner extends BlockJUnit4ClassRunner {
    public CUstomRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(new RunListener(){
            @Override
            public void testRunStarted(Description description) throws Exception {
                super.testRunStarted(description);
            }

            @Override
            public void testRunFinished(Result result) throws Exception {
                super.testRunFinished(result);
            }

            @Override
            public void testStarted(Description description) throws Exception {
                super.testStarted(description);
            }

            @Override
            public void testFinished(Description description) throws Exception {
                super.testFinished(description);
            }

            @Override
            public void testFailure(Failure failure) throws Exception {
                super.testFailure(failure);
            }

            @Override
            public void testAssumptionFailure(Failure failure) {
                super.testAssumptionFailure(failure);
            }

            @Override
            public void testIgnored(Description description) throws Exception {
                super.testIgnored(description);
            }
        });
        super.run(notifier);
    }
}
