package domain;

public interface GamePublisher {
    void addObserver(GamingCommunityMember observer);
    void removeObserver(GamingCommunityMember observer);
    void notifyObservers();
}
