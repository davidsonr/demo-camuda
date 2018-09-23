package demo.camunda.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// based on this https://github.com/camunda/camunda-bpm-examples/tree/master/spring-boot-starter/example-simple

@Component
public class SeasonDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void execute(DelegateExecution execution) throws Exception {
        String season = "Winter";
        execution.setVariable("season", "Winter");
        logger.info("executed set season {}", season);
    }
}
