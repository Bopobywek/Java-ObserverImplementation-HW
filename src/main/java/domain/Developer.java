package domain;

public class Developer extends Person implements GamingCommunityMember {

    public Developer(String name, int age) {
        super(name, age);
    }

    @Override
    public void handleGamePublishing(Game game) {
        System.out.println("I'm " + getName() + " and I'm " + getAge()
                + " years old GAMER.\nI liked the new game called " + game.name()
                + " so much that that I memorized her system requirements:\n"
                + String.join(",\n", game.systemRequirements()) + "\n"
        );
    }
}
