public class App {
    public static void main(String[] args) {
        Team t1 = new Team("GoldenStateWarrios", 19, "StivKerr", "Champions");
        Team t2 = new Team();
        Band b1 = new Band();
        SportPlayground dresdenDe = new Arena();
        dresdenDe.teamPlay(t1,t2);
        EventPlayground dresdenDe1 = new Arena();
        dresdenDe1.makeSomeNoise(b1);
        EventPlayground spirit_state = new Pub("Long Spirit state");
        spirit_state.makeSomeNoise(b1);
        SportPlayground yankees = new Stadium("Yankees", 7);
        yankees.teamPlay(t1,t2);

    }
}
