package com.example.syllabusAnalyzer.Services;

import com.example.syllabusAnalyzer.Users.TopicDetails;
import com.example.syllabusAnalyzer.Repositories.TopicsRepositories;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsServices {

    @Autowired
    private TopicsRepositories repo;

    public void saveTopic(TopicDetails topic) {
        repo.save(topic);
    }

    public TopicDetails getTopic(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Topic not found with ID: " + id));
    }

    public void deleteTopic(Long id) {
        repo.delete(getTopic(id));
    }

    public TopicDetails updateTopic(TopicDetails topic) {
        TopicDetails existingTopic = getTopic(topic.getTopic_id());

        existingTopic.setCourse_id(topic.getCourse_id());
        existingTopic.setTopic_name(topic.getTopic_name());
        existingTopic.setOrder_index(topic.getOrder_index());
        existingTopic.setTotal_subtopics(topic.getTotal_subtopics());
        existingTopic.setCreatedAt(topic.getCreatedAt());

        return repo.save(existingTopic);
    }
}
