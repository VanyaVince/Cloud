public class Arena implements SportPlayground, EventPlayground {
    @Override
    public void makeSomeNoise(Band band) {
        System.out.println("Поприветствуйте группу : " + band.nameBund + ", " + "с лучшим хитом: " + band.bestSong);

    }

    @Override
    public void teamPlay(Team first, Team second) {
        System.out.println("Сегодня мы увидим встречу команд: " + first.toString() + " и " + second.toString());

        if (first.numberOfPlayers < second.numberOfPlayers){
            System.out.println("Победила команда " + second.nameOfTeam);
        }else
            System.out.println("Победила комнда " + first.nameOfTeam);
    }
}
