package se.blackbirdmusic.music.track.soundcloud;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collection;

@Repository
public class TrackRepository {

    private static final long HOMELAND_ID = 104829763;
    private static final long SOUND_OF_GOODBYE_ID = 72324163;
    private static final long DANCE_WITH_THE_DEVIL_REMIX_ID = 62554243;
    private static final long PERSUASION_REMIX_ID = 43234055;
    private static final long CHECK_THIS_OUT_REMIX_ID = 26314741;
    private static final long MI_STYLE_ID = 1010871;

    Collection<Track> getAll() {
        return Arrays.asList(
                new Track(HOMELAND_ID),
                new Track(SOUND_OF_GOODBYE_ID),
                new Track(DANCE_WITH_THE_DEVIL_REMIX_ID),
                new Track(PERSUASION_REMIX_ID),
                new Track(CHECK_THIS_OUT_REMIX_ID),
                new Track(MI_STYLE_ID)
        );
    }
}
