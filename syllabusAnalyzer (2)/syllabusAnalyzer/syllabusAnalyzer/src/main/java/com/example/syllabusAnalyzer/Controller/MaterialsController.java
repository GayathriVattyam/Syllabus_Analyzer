package com.example.syllabusAnalyzer.Controller;

import com.example.syllabusAnalyzer.Users.MaterialDetails;
import com.example.syllabusAnalyzer.Services.MaterialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/materials")
public class MaterialsController {

    @Autowired
    private MaterialServices serv;

    @PostMapping("/save")
    public void save(@RequestBody MaterialDetails material) {
        serv.saveMaterial(material);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<MaterialDetails> get(@PathVariable Long id) {
        return ResponseEntity.ok(serv.getMaterial(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        serv.deleteMaterial(id);
    }

    @PutMapping("/update")
    public ResponseEntity<MaterialDetails> update(@RequestBody MaterialDetails material) {
        return ResponseEntity.ok(serv.updateMaterial(material));
    }
}
