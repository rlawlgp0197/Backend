package com.smhrd.player.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.player.service.PlayerService;

@RestController // 리액트 서버로 데이터만 응답
@CrossOrigin("http://3.35.209.92:3000")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	// select * from player;
	@RequestMapping("/PlayerList.do")
	public JSONArray PlayerList() {
		System.out.println("Spring: PlayerList.do");
		// 리액트 서버로 json데이터 응답
		return playerService.PlayerList();	
	}
	
	@RequestMapping("/PlayerDetail.do")
	public JSONArray PlayerDetail(@RequestParam String name) {
		System.out.println("이름:"+name);
		return playerService.PlayerList();
	}
	
	// 숙제 JsonObject -> put메소드 활용
}
