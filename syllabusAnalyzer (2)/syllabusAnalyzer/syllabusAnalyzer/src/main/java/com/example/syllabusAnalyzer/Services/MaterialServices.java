package com.example.syllabusAnalyzer.Services;

import com.example.syllabusAnalyzer.Users.MaterialDetails;
import com.example.syllabusAnalyzer.Repositories.MaterialsRepositories;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServices {

    @Autowired
    private MaterialsRepositories repo;

    public void saveMaterial(MaterialDetails material) {
        repo.save(material);
    }

    public MaterialDetails getMaterial(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Material not found with ID: " + id));
    }

    public void deleteMaterial(Long id) {
        repo.delete(getMaterial(id));
    }

    public MaterialDetails updateMaterial(MaterialDetails material) {
        MaterialDetails existing = getMaterial(material.getM_id());

        existing.setTopic_id(material.getTopic_id());
        existing.setTitle(material.getTitle());
        existing.setLink(material.getLink());
        existing.setM_type(material.getM_type());

        return repo.save(existing);
    }
}
