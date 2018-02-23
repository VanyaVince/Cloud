public class Pub implements EventPlayground {
    public String nameOfPub;

    public Pub(String nameOfPub){
        this.nameOfPub = nameOfPub;
    }
    @Override
    public void makeSomeNoise(Band band){
        System.out.println("Всех ждем в пабе - " + nameOfPub + ", " + "для вас выступает группа " + band.nameBund);
    }
}
