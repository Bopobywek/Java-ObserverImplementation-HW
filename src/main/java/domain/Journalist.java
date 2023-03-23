package domain;

public class Journalist extends Person implements GamingCommunityMember {
    public Journalist(String name, int age) {
        super(name, age);
    }

    @Override
    public void handleGamePublishing(Game game) {
        System.out.println("I'm " + getName() + " and I'm " + getAge()
                + " years old JOURNALIST.\nI liked the new game called " + game.name()
                + " so much that I memorized her description:\n"
                + game.description() + "\n"
        );
    }
}
