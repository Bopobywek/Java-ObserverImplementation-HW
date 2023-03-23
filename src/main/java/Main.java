import domain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game heroesOfMightAndMagicGame = new Game(
                "Heroes of Might and Magic",
                """
                        Heroes of Might and Magic tells the story of Lord Morglin Ironfist,
                        who is forced to flee his homeland through a magical portal, because his cousin,
                        Ragnar, had usurped the throne after his uncle,
                        Ragnar's father, killed Ironfist's father, the legitimate owner of the throne.""",
                List.of("OS: Windows 7 SP1, Windows 8, Windows 8.1 - both 32/64bit versions",
                        "Processor: Intel Core2 Duo E4400 @ 2.0 GHz or AMD Athlon64 X2 3800+ @ 2.0 GHz (or better)",
                        "Memory: 2 GB RAM",
                        "Graphics: nVidia GeForce 8800GT or AMD Radeon HD2900 (256MB VRAM or more with Shader Model 4" +
                                ".0)",
                        "DirectX: Version 10",
                        "Network: Broadband Internet connection",
                        "Sound Card: DirectX Compatible Sound Card with latest drivers"),
                List.of("Home Sweet Home: complete the campaign \"Long Live the Queen\"", "Fetchez la Vache!",
                        "Devilish: complete the campaign \"Dungeons and Devils\""));

        var company = new NewWorldComputingCompany();
        var player1 = new Player("Vasya Nagibator", 13);
        var player2 = new Player("1337Alexey228", 15);
        var player3 = new Player("Andruxa", 23);
        var journalist = new Journalist("Petr Vseznayev", 30);
        var developer = new Developer("John a.k.a ArchProUser", 45);

        company.addObserver(player1);
        company.addObserver(player2);
        company.addObserver(player3);
        company.addObserver(journalist);
        company.addObserver(developer);

        company.publishGame(heroesOfMightAndMagicGame);
    }
}
