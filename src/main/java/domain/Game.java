package domain;

import java.util.List;

public record Game(String name, String description, List<String> systemRequirements, List<String> achievements) {
}
