package com.skilldistillery.album.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.album.data.AlbumDAO;
import com.skilldistillery.album.entities.Album;

@Controller
public class AlbumController {

	@Autowired
	private AlbumDAO albumDAO;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
		List<Album> albums = albumDAO.findAll();
		model.addAttribute("albums", albums);
		return "home";
	}
	
	@RequestMapping("addAlbum.do")
	public ModelAndView addAlbum(Album album) {
		ModelAndView mv = new ModelAndView();
		album = albumDAO.create(album);
		mv.addObject("album", album);
		mv.setViewName("addAlbum");
		return mv;
	}
}
