package ExAbra;

public class HistoricalEvent {
    private String eventName;
    private HistoricalАigures relatedPerson;
    private int startYear;
    private int endYear;

    public HistoricalEvent(int endYear, String eventName, HistoricalАigures relatedPerson, int startYear) {
        this.endYear = endYear;
        this.eventName = eventName;
        this.relatedPerson = relatedPerson;
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String getEventName() {
        return eventName;
    }

    public HistoricalАigures getRelatedPerson() {
        return relatedPerson;
    }

    public int getStartYear() {
        return startYear;
    }

    @Override
    public String toString() {
        return "HistoricalEvent{" +
                "endYear=" + endYear +
                ", eventName='" + eventName + '\'' +
                ", relatedPerson=" + relatedPerson +
                ", startYear=" + startYear +
                '}';
    }
}
