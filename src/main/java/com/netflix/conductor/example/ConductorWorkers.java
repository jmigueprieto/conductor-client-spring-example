package com.netflix.conductor.example;

import com.netflix.conductor.sdk.workflow.task.WorkerTask;
import org.springframework.stereotype.Component;

@Component
public class ConductorWorkers {

    @WorkerTask(value = "hello-world", threadCount = 5, pollingInterval = 200)
    public String helloWorld() {
        return "Hello World!";
    }
}
