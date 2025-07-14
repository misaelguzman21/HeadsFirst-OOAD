public class BarkRecognizer {
    
    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = new DogDoor();
    }

    public void recognize(String bark){
        System.out.println("    BarkRecognizer: Heard a '" + bark + "'");
        door.open();
    }
}
