package se.blackbirdmusic.music.track.soundcloud;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collection;

@Repository
public class EmbeddedLinkRepository {

    Collection<EmbeddedLink> getAll() {
        return Arrays.asList(
                new EmbeddedLink.Builder()
                        .trackIdentifier("104829763")
                        .autoplay(true)
                        .hideRelated(true)
                        .showComments(true)
                        .showReposts(true)
                        .showUser(true)
                        .visual(true)
                        .build()
        );
    }
}
