/**
 * 
 */
package com.leave.request.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.request.model.RequestType;
import com.leave.request.repository.RequestTypeRepository;

/**
 * @author Eraine
 *
 */
@Service
public class RequestTypeServiceImpl implements RequestTypeService {

	@Autowired
	private RequestTypeRepository repository;

	
	public void save(RequestType requestType) {
		repository.save(requestType);
	}

	
	public Long getCount() {
		return repository.count();
	}

	
	public List<RequestType> findAll() {
		return repository.findAll();
	}

}
