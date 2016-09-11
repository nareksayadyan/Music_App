package am.aca.musicapp.common.model.type;

/**
 * Created by Narek on 11.09.2016.
 */
public enum MusicType {
    CLASSIC(0),
    ROCK(1),
    POP(2),
    JAZZ(3),
    RAP(4),
    RABIZ(5);
    private int id;

    MusicType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
