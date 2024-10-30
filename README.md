## Annotated Workers with Spring

Quick example that shows how to use `conductor-client-spring` to run annotated workers.

## Getting Started

1. Add this dependency to your project.

```groovy
implementation 'org.conductoross:conductor-client-spring:4.0.1'
```

2. Configure the conductor client in `application.properties`.

```properties
conductor.client.base-path=http://localhost:8080/api
```

3. Annotate methods in your Component with `@WorkerTask`, e.g.: [ConductorWorkers](/src/main/java/com/netflix/conductor/example/ConductorWorkers.java):

```java
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

```

4. That's it! - Run the project.

```shell
 ./gradlew bootRun
```