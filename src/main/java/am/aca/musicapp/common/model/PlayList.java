package am.aca.musicapp.common.model;

import am.aca.musicapp.common.model.type.RatingType;

import java.util.List;

/**
 * Created by Narek on 11.09.2016.
 */
public class PlayList {
    private int id;
    private String playListName;
    private List<Track> playListTraks;
    private List<User> usersAccess;
    private RatingType ratingType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Track> getPlayListTraks() {
        return playListTraks;
    }

    public void setPlayListTraks(List<Track> playListTraks) {
        this.playListTraks = playListTraks;
    }

    public List<User> getUsersAccess() {
        return usersAccess;
    }

    public void setUsersAccess(List<User> usersAccess) {
        this.usersAccess = usersAccess;
    }

    public RatingType getRatingType() {
        return ratingType;
    }

    public void setRatingType(RatingType ratingType) {
        this.ratingType = ratingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayList)) return false;

        PlayList playList = (PlayList) o;

        return getId() == playList.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }
}
