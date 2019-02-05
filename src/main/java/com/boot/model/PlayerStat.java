package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerStat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Integer ranking;
	Integer seasonId;
	String seasonName;
	Integer tournementId;
	Integer tournementRegionId;
	String tournementRegionCode;
	String regionCode;
	String tournementName;
	String tournementShortName;
	String firstName;
	String lastName;
	Integer playerId;
	Boolean isActive;
	Boolean isOpta;
	Integer teamId;
	String teamName;
	String playedPositions;
	Integer age;
	Integer height;
	Integer weight;
	String positionText;
	Integer apps;
	Integer subOn;
	Long minsPlayed;
	Double rating;
	Integer goal;
	Integer assistTotal;
	Integer yellowCard;
	Integer redCard;
	Double shotsPerGame;
	Double aerialWonPerGame;
	Integer manOfTheMatch;
	String name;
	Boolean isManOfTheMatch;
	String playedPositionsShort;
	Double passSuccess;
		
	public PlayerStat() { }


	public PlayerStat(Long id, Integer ranking, Integer seasonId, String seasonName, Integer tournementId,
			Integer tournementRegionId, String tournementRegionCode, String regionCode, String tournementName,
			String tournementShortName, String firstName, String lastName, Integer playerId, Boolean isActive,
			Boolean isOpta, Integer teamId, String teamName, String playedPositions, Integer age, Integer height,
			Integer weight, String positionText, Integer apps, Integer subOn, Long minsPlayed, Double rating,
			Integer goal, Integer assistTotal, Integer yellowCard, Integer redCard, Double shotsPerGame,
			Double aerialWonPerGame, Integer manOfTheMatch, String name, Boolean isManOfTheMatch,
			String playedPositionsShort, Double passSuccess) {
		super();
		this.id = id;
		this.ranking = ranking;
		this.seasonId = seasonId;
		this.seasonName = seasonName;
		this.tournementId = tournementId;
		this.tournementRegionId = tournementRegionId;
		this.tournementRegionCode = tournementRegionCode;
		this.regionCode = regionCode;
		this.tournementName = tournementName;
		this.tournementShortName = tournementShortName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.playerId = playerId;
		this.isActive = isActive;
		this.isOpta = isOpta;
		this.teamId = teamId;
		this.teamName = teamName;
		this.playedPositions = playedPositions;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.positionText = positionText;
		this.apps = apps;
		this.subOn = subOn;
		this.minsPlayed = minsPlayed;
		this.rating = rating;
		this.goal = goal;
		this.assistTotal = assistTotal;
		this.yellowCard = yellowCard;
		this.redCard = redCard;
		this.shotsPerGame = shotsPerGame;
		this.aerialWonPerGame = aerialWonPerGame;
		this.manOfTheMatch = manOfTheMatch;
		this.name = name;
		this.isManOfTheMatch = isManOfTheMatch;
		this.playedPositionsShort = playedPositionsShort;
		this.passSuccess = passSuccess;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Integer getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public Integer getTournementId() {
		return tournementId;
	}

	public void setTournementId(Integer tournementId) {
		this.tournementId = tournementId;
	}

	public Integer getTournementRegionId() {
		return tournementRegionId;
	}

	public void setTournementRegionId(Integer tournementRegionId) {
		this.tournementRegionId = tournementRegionId;
	}

	public String getTournementRegionCode() {
		return tournementRegionCode;
	}

	public void setTournementRegionCode(String tournementRegionCode) {
		this.tournementRegionCode = tournementRegionCode;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getTournementName() {
		return tournementName;
	}

	public void setTournementName(String tournementName) {
		this.tournementName = tournementName;
	}

	public String getTournementShortName() {
		return tournementShortName;
	}

	public void setTournementShortName(String tournementShortName) {
		this.tournementShortName = tournementShortName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsOpta() {
		return isOpta;
	}

	public void setIsOpta(Boolean isOpta) {
		this.isOpta = isOpta;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getPlayedPositions() {
		return playedPositions;
	}

	public void setPlayedPositions(String playedPositions) {
		this.playedPositions = playedPositions;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getPositionText() {
		return positionText;
	}

	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}

	public Integer getApps() {
		return apps;
	}

	public void setApps(Integer apps) {
		this.apps = apps;
	}

	public Integer getSubOn() {
		return subOn;
	}

	public void setSubOn(Integer subOn) {
		this.subOn = subOn;
	}

	public Long getMinsPlayed() {
		return minsPlayed;
	}

	public void setMinsPlayed(Long minsPlayed) {
		this.minsPlayed = minsPlayed;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getGoal() {
		return goal;
	}

	public void setGoal(Integer goal) {
		this.goal = goal;
	}

	public Integer getAssistTotal() {
		return assistTotal;
	}

	public void setAssistTotal(Integer assistTotal) {
		this.assistTotal = assistTotal;
	}

	public Integer getYellowCard() {
		return yellowCard;
	}

	public void setYellowCard(Integer yellowCard) {
		this.yellowCard = yellowCard;
	}

	public Integer getRedCard() {
		return redCard;
	}

	public void setRedCard(Integer redCard) {
		this.redCard = redCard;
	}

	public Double getShotsPerGame() {
		return shotsPerGame;
	}

	public void setShotsPerGame(Double shotsPerGame) {
		this.shotsPerGame = shotsPerGame;
	}

	public Double getAerialWonPerGame() {
		return aerialWonPerGame;
	}

	public void setAerialWonPerGame(Double aerialWonPerGame) {
		this.aerialWonPerGame = aerialWonPerGame;
	}

	public Integer getManOfTheMatch() {
		return manOfTheMatch;
	}

	public void setManOfTheMatch(Integer manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsManOfTheMatch() {
		return isManOfTheMatch;
	}

	public void setIsManOfTheMatch(Boolean isManOfTheMatch) {
		this.isManOfTheMatch = isManOfTheMatch;
	}

	public String getPlayedPositionsShort() {
		return playedPositionsShort;
	}

	public void setPlayedPositionsShort(String playedPositionsShort) {
		this.playedPositionsShort = playedPositionsShort;
	}

	public Double getPassSuccess() {
		return passSuccess;
	}

	public void setPassSuccess(Double passSuccess) {
		this.passSuccess = passSuccess;
	}
	
}
