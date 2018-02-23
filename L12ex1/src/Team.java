public class Team {
    public String nameOfTeam;
    public int numberOfPlayers;
    public String coach;
    public String status;

    public Team(String nameOfTeam, int numberOfPlayers, String coach, String status) {
        this.nameOfTeam = nameOfTeam;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
        this.status = status;
    }

    public Team() {
        this.nameOfTeam = "MemphisGrizzlies";
        this.numberOfPlayers = 18;
        this.coach = "Devid Uoger";
        this.status = "Beginners";
    }
    public String toString() {
        String info =   nameOfTeam + ", " + " Кочиство игроков " + numberOfPlayers +  ", Тренер " + coach + ", Статус " + status;
        return info;
    }
}
