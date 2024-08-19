package com.skilldistillery.album.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("addAlbumForm.do")
	public ModelAndView showAddAlbumForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addAlbum");
		return mv;
	}
	
	@RequestMapping(path="addAlbum.do", method=RequestMethod.POST)
	public ModelAndView addAlbum(Album album) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("album", albumDAO.create(album));
		mv.setViewName("redirect:home.do");
		return mv;
	}
	
	@RequestMapping("goHome.do")
	public ModelAndView goHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:home.do");
		return mv;
	}
	
	@RequestMapping(path="deleteAlbum.do", method=RequestMethod.POST)
	public ModelAndView deleteAlbum(@RequestParam("albumId") int albumId) {
		ModelAndView mv = new ModelAndView();
		albumDAO.deleteById(albumId);
		mv.setViewName("redirect:home.do");
		return mv;
	}
	
	@RequestMapping("updateAlbumForm.do")
	public ModelAndView showUpdateAlbumForm(@RequestParam("albumId2") int albumId) {
	    ModelAndView mv = new ModelAndView();
	    Album album = albumDAO.findById(albumId);
	    mv.addObject("album", album);
	    mv.setViewName("updateAlbum");
	    return mv;
	}

	
	@RequestMapping(path="updateAlbum.do", method=RequestMethod.POST)
	public ModelAndView updateAlbum(Album album, @RequestParam("albumId2") int albumId) {
	    ModelAndView mv = new ModelAndView();
	    album.setId(albumId);
	    albumDAO.update(album);
	    mv.setViewName("redirect:home.do");
	    return mv;
	}

	
}
