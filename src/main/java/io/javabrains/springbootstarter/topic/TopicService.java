package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring topic", "Spring description"),
            new Topic("Java script", "Java script topic", "Java script description")));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id))
                .findFirst().get();
    }


    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void deleteTopic(String id) {
        for (Topic t : topics) {
            if (t.getId().equals(id)) {
                topics.remove(t);
                return;
            }
        }
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++){
            if (topics.get(i).getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }
}
