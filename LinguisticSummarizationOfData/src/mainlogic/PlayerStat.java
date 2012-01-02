/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlogic;

/**
 *
 * @author Ariel
 */
public class PlayerStat {
    
    String playerID;
    int year;
    int stint;
    String teamID;
    String leagueID;
    int wins;
    int losses;
    int games;
    int gamesStarted;
    int completeGames;
    int shutouts;
    int saves;
    int outsPitched;
    int hits;
    int earnedRuns;
    int homeRuns;
    int walks;
    int strikeOuts;
    int opponentsBattingAvg;
    double earnedRunAvg;
    double intentionalWalks;
    int wildPitches;
    int battersHitByPitch;
    int balks;
    int battersFacedByPitcher;
    int gamesFinished;
    int runsAllowed;
 
    @Override
    public String toString() {
        return "PlayerStat{" + "playerID=" + playerID + ", year=" + year + ", stint=" + stint + ", teamID=" + teamID + ", leagueID=" + leagueID + ", wins=" + wins + ", losses=" + losses + ", games=" + games + ", gamesStarted=" + gamesStarted + ", completeGames=" + completeGames + ", shutouts=" + shutouts + ", saves=" + saves + ", outsPitched=" + outsPitched + ", hits=" + hits + ", earnedRuns=" + earnedRuns + ", homeRuns=" + homeRuns + ", walks=" + walks + ", strikeOuts=" + strikeOuts + ", opponentsBattingAvg=" + opponentsBattingAvg + ", earnedRunAvg=" + earnedRunAvg + ", intentionalWalks=" + intentionalWalks + ", wildPitches=" + wildPitches + ", battersHitByPitch=" + battersHitByPitch + ", balks=" + balks + ", battersFacedByPitcher=" + battersFacedByPitcher + ", gamesFinished=" + gamesFinished + ", runsAllowed=" + runsAllowed + '}';
    }
    
   public String showMainStrings() {
        return "PlayerStat{" + "playerID=" + playerID + ", year=" + year +  ", teamID=" + teamID + ", leagueID=" + leagueID  + '}';
    }
}
