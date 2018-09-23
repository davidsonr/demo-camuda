package demo.camunda.task;

import static org.slf4j.LoggerFactory.getLogger;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartProcessesService {

    private final Logger logger = getLogger(this.getClass());

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    private String processInstanceId;

    @EventListener
    public void notify(final PostDeployEvent unused) {

/*      processInstanceId = runtimeService.startProcessInstanceByKey("Sample").getProcessInstanceId();
        logger.info("started instance: {}", processInstanceId);
        Task task = taskService.createTaskQuery().processInstanceId(processInstanceId).singleResult();
        taskService.complete(task.getId());
        logger.info("completed task: {}", task);*/
        // now jobExecutor should execute the async job
        //processInstanceId = runtimeService.startProcessInstanceByKey("CurrentSeason").getProcessInstanceId();
        //logger.info("season started instance: {}", processInstanceId);

        processInstanceId = runtimeService.startProcessInstanceByKey("DishGenerator").getProcessInstanceId();
        logger.info("season started instance: {}", processInstanceId);
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }
}
