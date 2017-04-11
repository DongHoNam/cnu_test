package univ.lecture.riotapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tchi on 2017. 4. 1..
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Summoner {
    private int id;
    private long now;
    private double result;
    
//    public Summoner(int queriedId, long queriedNow, double queriedResult){
//    	this.id = queriedId;
//    	this.now = queriedNow;
//    	this.result = queriedResult;
//    }
}
