import com.davidremington.KaraokeMachine;
import com.davidremington.model.SongBook;

public class Karaoke {

    public static void main(String[] args){
        SongBook songBook = new SongBook();
        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();
    }
}
