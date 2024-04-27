package ExAbra;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Parse {
    public List<HistoricalАigures> parseHistoricalАigures(List<String> lines){
        List<HistoricalАigures> historicalАiguresList=new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(", ");
            String country = parts[0];
            String name = parts[1];
            int birthYear = Integer.parseInt(parts[2]);
            int deathYear = Integer.parseInt(parts[3]);
            historicalАiguresList.add(new HistoricalАigures(name, country, birthYear, deathYear));
        }
        return historicalАiguresList;
    }
    public HistoricalАigures findPersonByName(List<HistoricalАigures> humans, String name){
        for(HistoricalАigures historicalАigures: humans){
            if(historicalАigures.getName().equals(name)){
                return historicalАigures;
            }
        }
        return null;
    }
    public List<HistoricalEvent> parseHistoricalEvent(List<String> lines, List<HistoricalАigures> historicalАigures){
        List<HistoricalEvent> historicalEventList=new ArrayList<>();
        for (String line : lines) {
            String[] parts=line.split(", ");
            String event=parts[0];
            HistoricalАigures aigures=findPersonByName(historicalАigures,parts[1]);
            int birthYear=Integer.parseInt(parts[2]);
            int deathYear=Integer.parseInt(parts[3]);
            historicalEventList.add(new HistoricalEvent(birthYear,event,aigures, deathYear));
        }
        return historicalEventList;
    }
}
