package com.example.awstask.service;

import com.example.awstask.model.DepartmentalStore;

public interface DepartmentalStoreService {

	public DepartmentalStore saveStore(DepartmentalStore departmentalStore);

	public Iterable<DepartmentalStore> getAllDetails();

	void deleteDetails(int id);

	DepartmentalStore updateAllDetails(int id, DepartmentalStore departmentalStore);
}
