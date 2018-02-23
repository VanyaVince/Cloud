public class Band {
    public String nameBund;
    public int numberSongs;
    public String status;
    public String bestSong;

    public Band(String nameBund, int numberOfMusian, String status, String bestSong) {
        this.nameBund = nameBund;
        this.numberSongs = numberOfMusian;
        this.status = status;
        this.bestSong = bestSong;
    }

    public Band() {
        this.nameBund = "Amaranthe";
        this.numberSongs = 22;
        this.status = "Profi";
        this.bestSong = "Nexus";
    }
    public String toString() {
        return "Группа " + nameBund + "Количество песень " + numberSongs + "Статус " + status + "Хит" + bestSong;
    }
}

