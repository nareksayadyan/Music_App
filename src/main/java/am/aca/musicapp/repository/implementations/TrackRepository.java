package am.aca.musicapp.repository.implementations;

import am.aca.musicapp.common.model.Track;
import am.aca.musicapp.repository.interfaces.TrackRepositoryInterface;

/**
 * Created by Narek on 11.09.2016.
 */
public class TrackRepository implements TrackRepositoryInterface {
    private static TrackRepository trackRepository = null;

    private TrackRepository() {}

    public static TrackRepository getInstance() {
        if (trackRepository == null) {
            trackRepository = new TrackRepository();
        }
        return trackRepository;
    }

    @Override
    public Track create(Track obj) {
        return null;
    }

    @Override
    public Track read(Track obj) {
        return null;
    }

    @Override
    public Track update(Track obj) {
        return null;
    }

    @Override
    public void delete(Track obj) {

    }
}
