package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {

        return Arrays.asList(
                new Topics(1, "Spring", "Spring description"),
                new Topics(2, "Java script", "Java script description")
        );
    }
}
