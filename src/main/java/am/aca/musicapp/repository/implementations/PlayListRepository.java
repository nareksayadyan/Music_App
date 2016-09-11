package am.aca.musicapp.repository.implementations;

import am.aca.musicapp.common.model.PlayList;
import am.aca.musicapp.repository.interfaces.PlayListRepositoryInterface;

/**
 * Created by Narek on 11.09.2016.
 */
public class PlayListRepository implements PlayListRepositoryInterface {
    private static PlayListRepository playListRepository = null;

    private PlayListRepository() {}

    public static PlayListRepository getInstance() {
        if (playListRepository == null) {
            playListRepository = new PlayListRepository();
        }
        return playListRepository;
    }

    @Override
    public PlayList create(PlayList obj) {
        return null;
    }

    @Override
    public PlayList read(PlayList obj) {
        return null;
    }

    @Override
    public PlayList update(PlayList obj) {
        return null;
    }

    @Override
    public void delete(PlayList obj) {

    }
}
