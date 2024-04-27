package ExAbra;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Read read=new Read();
        Parse parse=new Parse();
        List<HistoricalАigures> historicalАiguresList=parse.parseHistoricalАigures(read.read("Historical figures.txt"));
        List<HistoricalEvent> historicalEventList=parse.parseHistoricalEvent(read.read("Event.txt"), historicalАiguresList);
        Statistics statistics=new Statistics();
        System.out.println(statistics.statisticsCountry(historicalEventList));
    }
}
class Statistics{
    public Map<String,Integer> statistics(List<HistoricalАigures> historicalАigures){
        Map<String,Integer> statistic=new TreeMap<>();
        for(HistoricalАigures human: historicalАigures){
            if(!statistic.containsKey(human.getCountry())){
                statistic.put(human.getCountry(),1);
            }
            else {
                int count = statistic.get(human.getCountry());
                statistic.put(human.getCountry(), count + 1);
            }
        }
        return statistic;
    }
    public Map<String, Integer> statisticsCountry(List<HistoricalEvent> historicalEventList){
        Map<String, Integer> stringIntegerMap=new TreeMap<>();
        for (HistoricalEvent historicalEvent:historicalEventList) {
            HistoricalАigures historicalАigures=historicalEvent.getRelatedPerson();
            if(!stringIntegerMap.containsKey(historicalАigures.getName()) && checkEvenInLife(historicalEvent)){
                stringIntegerMap.put(historicalАigures.getName(),1);
            } else if (checkEvenInLife(historicalEvent)) {
                int count=stringIntegerMap.get(historicalАigures.getName());
                stringIntegerMap.put(historicalАigures.getName(), count + 1);
            }
        }
        return stringIntegerMap;
    }
    private boolean checkEvenInLife(HistoricalEvent historicalEvent){
        int life_2=findTwoLife(historicalEvent);
        return historicalEvent.getStartYear()>=life_2;
    }

    private int findTwoLife(HistoricalEvent historicalEvent) {
        int life=historicalEvent.getRelatedPerson().getYearOfDeath()-historicalEvent.getRelatedPerson().getYearOfBirth();
        return historicalEvent.getRelatedPerson().getYearOfBirth()+life/2;
    }
}
