package com.example.awstask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.awstask.model.DepartmentalStore;
import com.example.awstask.service.DepartmentalStoreService;

@RestController
@RequestMapping("/api")
public class DepartmentalStoreController {

	@Autowired
	private DepartmentalStoreService departmentalStoreService;

	@PostMapping("/postDetails")
	public DepartmentalStore saveStore(@RequestBody DepartmentalStore departmentalStore) {
		return departmentalStoreService.saveStore(departmentalStore);
	}

	@GetMapping("/getAllDetails")
	public Iterable<DepartmentalStore> findAllDetails() {
		return departmentalStoreService.getAllDetails();
	}

	@PutMapping("/updateDetails/{id}")
	public DepartmentalStore updateDetails(@PathVariable int id, @RequestBody DepartmentalStore departmentalStore) {
		return departmentalStoreService.updateAllDetails(id, departmentalStore);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteDetails(@PathVariable int id) {
		departmentalStoreService.deleteDetails(id);
		return "deleted";
	}
}
