package se.blackbirdmusic.music.track;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collection;

@Repository
public class TrackRepository {

    private static final Artist BLACKBIRD = new Artist("Blackbird");
    private static final Artist PERPETIOUS_DREAMER = new Artist("Perpetious Dreamer");
    private static final Artist AMANDA_KLINTHÄLL = new Artist("Amanda Klinthäll");
    private static final Artist SANDY_RIVERA = new Artist("Sandy Rivera");
    private static final Artist RAE = new Artist("Rae");
    private static final Artist FERRY_CORSTEN = new Artist("Ferry Corsten");

    Collection<Track> getAll() {
        return Arrays.asList(
                new Track.Builder()
                        .artist(BLACKBIRD)
                        .title("Homeland")
                        .remixTitle("Jämtlandssången")
                        .soundcloudTrackId(104829763L)
                        .build(),
                new Track.Builder()
                        .artist(PERPETIOUS_DREAMER)
                        .title("The Sound Of Goodbye")
                        .remixer(BLACKBIRD)
                        .remixTitle("Reconstruction")
                        .soundcloudTrackId(72324163L)
                        .preview()
                        .build(),
                new Track.Builder()
                        .artist(AMANDA_KLINTHÄLL)
                        .title("Dance With The Devil")
                        .remixer(BLACKBIRD)
                        .remixTitle("Remix")
                        .soundcloudTrackId(62554243L)
                        .build(),
                new Track.Builder()
                        .artist(SANDY_RIVERA)
                        .featuring(RAE)
                        .title("Persuasion")
                        .remixer(BLACKBIRD)
                        .remixTitle("Deep Mix")
                        .soundcloudTrackId(43234055L)
                        .youTubeVideoId("cM68W2KUrAU")
                        .build(),
                new Track.Builder()
                        .artist(FERRY_CORSTEN)
                        .title("Check This Out")
                        .remixer(BLACKBIRD)
                        .remixTitle("Remix")
                        .soundcloudTrackId(26314741L)
                        .build(),
                new Track.Builder()
                        .artist(BLACKBIRD)
                        .title("My Style")
                        .soundcloudTrackId(1010871L)
                        .build()
        );
    }
}
