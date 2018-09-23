package demo.camunda.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DishReviewDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void execute(DelegateExecution execution) throws Exception {
        logger.info("reviewing output of dish decision");
        logger.info("available keys:{}", execution.getVariables().keySet());
        String dish = (String) execution.getVariable("dish");
        logger.info("dish is {} ", dish);
    }
}
