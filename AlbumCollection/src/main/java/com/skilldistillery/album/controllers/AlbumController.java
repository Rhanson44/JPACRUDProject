package com.skilldistillery.album.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.album.data.AlbumDAO;

import ch.qos.logback.core.model.Model;

@Controller
public class AlbumController {

	@Autowired
	private AlbumDAO albumDAO;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
		return "home";
	}
}
