package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Blogs;

public interface BlogRepo extends CrudRepository<Blogs, Integer>{

}
