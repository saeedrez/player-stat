package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.PlayerStat;
import com.boot.repository.PlayerStatRepository;

@RestController
@RequestMapping("api/v1/")
public class PlayerStatController {

	@Autowired
	PlayerStatRepository playerStatRepository;
	
	@RequestMapping(value = "players", method = RequestMethod.GET)
	public List<PlayerStat> list() {
		return playerStatRepository.findAll();
	}

	@RequestMapping(value = "players/{playerId}", method = RequestMethod.GET)
	public PlayerStat get(@PathVariable Integer playerId) {
		return playerStatRepository.findByPlayerId(playerId);
	}

}
