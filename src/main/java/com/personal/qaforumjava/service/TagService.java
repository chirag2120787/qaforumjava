package com.personal.qaforumjava.service;

import com.personal.qaforumjava.models.Tag;
import com.personal.qaforumjava.repository.TagRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TagService {
    private final TagRepository tagRepository;
    private final QuestionTagService questionTagService;

    public void handleQuestionTags(Long questionId, List<Tag> tags) {
        for (Tag tag: tags) {
            if (tag.getId() != null) {
                continue;
            }
            Tag createdTag = createTag(tag);
            tag.setId(createdTag.getId());
            questionTagService.createQuestionTag(tag.getId(), questionId);
        }
    }

    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }

    public Tag getTagById(Long id) {
        return tagRepository.getReferenceById(id);
    }

}
