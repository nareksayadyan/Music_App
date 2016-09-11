package am.aca.musicapp.common.model.type;

/**
 * Created by Narek on 11.09.2016.
 */
public enum RatingType {
    OneStar(0),
    TwoStar(1),
    ThreeStar(2),
    FourStar(3),
    FiveStar(4);
    private int id;

    RatingType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
