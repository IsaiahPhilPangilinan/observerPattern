package observerPattern;

public class Subscriber implements SubscriberObserver {

    public String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(NewsAgency newsAgency) {

    }
}
