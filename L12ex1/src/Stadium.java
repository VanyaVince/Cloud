public class Stadium implements SportPlayground {

    public String nameOfStadion;
    public int meet;

    public Stadium(String nameOfStadion, int meet) {
        this.nameOfStadion = nameOfStadion;
        this.meet = meet;
    }
    @Override
    public void teamPlay(Team first, Team second) {
        System.out.println("Встречайте на стадионе " + nameOfStadion + ", " + " Команда - " + first.nameOfTeam +
                 " встречается c - " + second.nameOfTeam + ", " + " общее количесвто встреч команд = " + meet);

    }
}
