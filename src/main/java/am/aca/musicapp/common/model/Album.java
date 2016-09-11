package am.aca.musicapp.common.model;

import java.util.List;

/**
 * Created by Narek on 11.09.2016.
 */
public class Album {
    private int id;
    private String albumName;
    private List<Track> albumTrakcs;
    private int ownerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Track> getAlbumTrakcs() {
        return albumTrakcs;
    }

    public void setAlbumTrakcs(List<Track> albumTrakcs) {
        this.albumTrakcs = albumTrakcs;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;

        Album album = (Album) o;

        return getId() == album.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }
}
