package demo.camunda.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/start-process")
    public String startProcess() {
        //runtimeService.startProcessInstanceByKey("loanApproval"); // TODO implement endpoint here
        return "NOT DOING ANYTHING WITH THIS YET :-)";
    }
}