package se.blackbirdmusic.music.track.soundcloud;

import static java.util.Objects.requireNonNull;

public class TrackIdentifier {

    public final String value;

    TrackIdentifier(String value) {
        requireNonNull(value);
        this.value = value;
    }
}
