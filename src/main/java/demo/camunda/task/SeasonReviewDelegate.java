package demo.camunda.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class SeasonReviewDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void execute(DelegateExecution execution) throws Exception {
        String season = (String) execution.getVariable("season");
        logger.info("season value is {} ", season);
    }
}
