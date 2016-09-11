package am.aca.musicapp.repository.implementations;

import am.aca.musicapp.common.model.Album;
import am.aca.musicapp.repository.interfaces.AlbumRepositoryInterface;

/**
 * Created by Narek on 11.09.2016.
 */
public class AlbumRepository implements AlbumRepositoryInterface {
    private static AlbumRepository albumRepository = null;

    private AlbumRepository() {}

    public static AlbumRepository getInstance() {
        if (albumRepository == null) {
            albumRepository = new AlbumRepository();
        }
        return albumRepository;
    }

    @Override
    public Album create(Album obj) {
        return null;
    }

    @Override
    public Album read(Album obj) {
        return null;
    }

    @Override
    public Album update(Album obj) {
        return null;
    }

    @Override
    public void delete(Album obj) {

    }
}
