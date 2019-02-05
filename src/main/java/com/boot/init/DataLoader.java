package com.boot.init;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.boot.model.PlayerStat;
import com.boot.repository.PlayerStatRepository;
import com.opencsv.CSVReader;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
    private PlayerStatRepository playerStatRepository;

//    @Autowired
//    public DataLoader(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public void run(ApplicationArguments args) {
    	System.out.println("==> init dataloader");
    	List<String[]> dl = readDataSourceFromFile();
    	playerStatRepository.deleteAll();
    	playerStatRepository.flush();
    	for (String[] pStat : dl) {
    		PlayerStat playerStat = new PlayerStat();
    		playerStat.setRanking(Integer.valueOf(pStat[0]));
    		playerStat.setSeasonId(Integer.valueOf(pStat[1]));
    		playerStat.setSeasonName(pStat[2]);
    		playerStat.setTournementId(Integer.valueOf(pStat[3]));
    		playerStat.setTournementRegionId(Integer.valueOf(pStat[4]));
    		playerStat.setTournementRegionCode(pStat[5]);
    		playerStat.setRegionCode(pStat[6]);
    		playerStat.setTournementName(pStat[7]);
    		playerStat.setTournementShortName(pStat[8]);
    		playerStat.setFirstName(pStat[9]);
    		playerStat.setLastName(pStat[10]);
    		playerStat.setPlayerId(Integer.valueOf(pStat[11]));
    		playerStat.setIsActive(Boolean.valueOf(pStat[12]));
    		playerStat.setIsOpta(Boolean.valueOf(pStat[13]));
    		playerStat.setTeamId(Integer.valueOf(pStat[14]));
    		playerStat.setTeamName(pStat[15]);
    		playerStat.setPlayedPositions(pStat[16]);
    		playerStat.setAge(Integer.valueOf(pStat[17]));
    		playerStat.setHeight(Integer.valueOf(pStat[18]));
    		playerStat.setWeight(Integer.valueOf(pStat[19]));
    		playerStat.setPositionText(pStat[20]);
    		playerStat.setApps(Integer.valueOf(pStat[21]));
    		playerStat.setSubOn(Integer.valueOf(pStat[22]));
    		playerStat.setMinsPlayed(Long.valueOf(pStat[23]));
    		playerStat.setRating(Double.valueOf(pStat[24]));
    		playerStat.setGoal(Integer.valueOf(pStat[25]));
    		playerStat.setAssistTotal(Integer.valueOf(pStat[26]));
    		playerStat.setYellowCard(Integer.valueOf(pStat[27]));
    		playerStat.setRedCard(Integer.valueOf(pStat[28]));
    		playerStat.setShotsPerGame(Double.valueOf(pStat[29]));
    		playerStat.setAerialWonPerGame(Double.valueOf(pStat[30]));
    		playerStat.setManOfTheMatch(Integer.valueOf(pStat[31]));
    		playerStat.setName(pStat[32]);
    		playerStat.setIsManOfTheMatch(Boolean.valueOf(pStat[33]));
    		playerStat.setPlayedPositionsShort(pStat[34]);
    		playerStat.setPassSuccess(Double.valueOf(pStat[35]));    		    		
            playerStatRepository.save(playerStat);
    		
    	}
    }
    
    private List<String[]> readDataSourceFromFile() {
        String csvFile = "data/players.csv";
        InputStreamReader streamReader = null;
        List<String[]> dataList = new ArrayList<String[]>();
        CSVReader reader;
        
        ClassPathResource resource = new ClassPathResource(csvFile);
        try {
			streamReader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        
            try {
            	reader = new CSVReader(streamReader);
                String[] line;
                while ((line = reader.readNext()) != null) {
                  if (line[0].equalsIgnoreCase("ranking"))
                	continue; // drop the header
                dataList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
	
        	
        return dataList;
    }
    
//    private List<String[]> readDataSourceFromFile() {
//        String csvFile = "data/players.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//        String[] playerStat = null;
//        InputStreamReader streamReader = null;
//        List<String[]> dataList = new ArrayList<String[]>();
//        
////        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
////        InputStream is = classloader.getResourceAsStream(csvFile);
//        ClassPathResource resource = new ClassPathResource(csvFile);
//        try {
//			streamReader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//        
////        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//        try {
//        	BufferedReader br = new BufferedReader(streamReader);
//
//            while ((line = br.readLine()) != null) {
//            	System.out.println("==> Line: " + line);
//                // use comma as separator
//                playerStat = line.split(cvsSplitBy);
//                if (playerStat[0].equalsIgnoreCase("ranking"))
//                	continue; // drop the header
//                dataList.add(playerStat);
//                System.out.println("playerId = " + 
//                		playerStat[11] + " , playedPositions = " + playerStat[33] + "]");
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return dataList;
//    }
//}
}
