package domain;

import java.util.ArrayList;
import java.util.List;

public class NewWorldComputingCompany implements GamePublisher {
    private final List<GamingCommunityMember> observers = new ArrayList<>();
    private final List<Game> games = new ArrayList<>();

    @Override
    public void addObserver(GamingCommunityMember observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(GamingCommunityMember observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (var observer : observers) {
            observer.handleGamePublishing(games.get(games.size() - 1));
        }
    }

    public void publishGame(Game game) {
        games.add(game);
        notifyObservers();
    }
}
