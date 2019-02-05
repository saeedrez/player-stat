package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.PlayerStat;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Long>{

	PlayerStat findByPlayerId(Integer playerId);

}
