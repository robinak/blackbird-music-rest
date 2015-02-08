package se.blackbirdmusic.music.track;

import static java.util.Objects.requireNonNull;

final class Track {

    public final Artist artist;
    public final String title;

    public final Artist featuring;
    public final Artist remixer;
    public final String remixTitle;

    public final Long   soundcloudTrackId;
    public final String youTubeVideoId;

    public final boolean preview;


    private Track(Builder builder) {
        requireNonNull(builder);
        this.artist            = requireNonNull(builder.artist);
        this.title             = requireNonNull(builder.title);

        this.featuring         = builder.featuring;
        this.remixer           = builder.remixer;
        this.remixTitle        = builder.remixTitle;
        this.soundcloudTrackId = builder.soundcloudTrackId;
        this.youTubeVideoId    = builder.youTubeVideoId;
        this.preview           = builder.preview;
    }

    static class Builder {
        private Artist artist;
        private Artist featuring;
        private String title;
        private Artist remixer;
        private String remixTitle;
        private long soundcloudTrackId;
        private String youTubeVideoId;
        private boolean preview;

        public Builder artist(Artist artist) {
            this.artist = artist;
            return this;
        }

        public Builder featuring(Artist featuring) {
            this.featuring = featuring;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder remixer(Artist remixer) {
            this.remixer = remixer;
            return this;
        }

        public Builder remixTitle(String remixTitle) {
            this.remixTitle = remixTitle;
            return this;
        }

        public Builder soundcloudTrackId(Long soundcloudTrackId) {
            this.soundcloudTrackId = soundcloudTrackId;
            return this;
        }

        public Builder youTubeVideoId(String youTubeVideoId) {
            this.youTubeVideoId = youTubeVideoId;
            return this;
        }

        public Builder preview() {
            this.preview = true;
            return this;
        }

        public Track build() {
            return new Track(this);
        }
    }

}
