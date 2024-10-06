package org.example.DevSync2.service;

import org.example.DevSync2.entity.Tag;
import org.example.DevSync2.repository.TagRepository;

import java.util.List;

public class TagService {

    private final TagRepository tagRepository = new TagRepository();

    public boolean save(Tag tag) {
        return tagRepository.save(tag);
    }

    public boolean delete(Tag tag) {
        return tagRepository.delete(tag);
    }

    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    public Tag findById(Long id) {
        return tagRepository.findById(id);
    }

}
