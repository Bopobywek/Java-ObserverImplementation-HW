package domain;

public class Player extends Person implements GamingCommunityMember {

    public Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void handleGamePublishing(Game game) {
        System.out.println("I'm " + getName() + " and I'm " + getAge()
                + " years old GAMER.\nI liked the new game called " + game.name()
                + " so much that I'm going to get all the achievements that it has, namely:\n"
                + String.join(",\n", game.achievements()) + "\n"
        );
    }
}
