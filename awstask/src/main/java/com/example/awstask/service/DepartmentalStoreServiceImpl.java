package com.example.awstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.awstask.model.DepartmentalStore;
import com.example.awstask.repository.DepartmentalStoreRepository;

@Component
public class DepartmentalStoreServiceImpl implements DepartmentalStoreService {

	@Autowired
	DepartmentalStoreRepository departmentalStoreRepository;

	@Override
	public DepartmentalStore saveStore(DepartmentalStore departmentalStore) {
		return departmentalStoreRepository.save(departmentalStore);
	}

	@Override
	public Iterable<DepartmentalStore> getAllDetails() {
		return departmentalStoreRepository.findAll();
	}

	@Override
	public DepartmentalStore updateAllDetails(int id, DepartmentalStore departmentalStore) {
		DepartmentalStore store = departmentalStoreRepository.findById(id).get();
		store.setAmount(departmentalStore.getAmount());
		store.setName(departmentalStore.getName());
		store.setCreationDateTime(departmentalStore.getCreationDateTime());
		store.setLastUpdatedDateTime(departmentalStore.getLastUpdatedDateTime());
		store.setStatus(departmentalStore.isStatus());
		return departmentalStoreRepository.save(store);
	}

	@Override
	public void deleteDetails(int id) {
		departmentalStoreRepository.deleteById(id);
	}
}
