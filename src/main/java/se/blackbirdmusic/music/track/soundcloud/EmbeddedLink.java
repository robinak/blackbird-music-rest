package se.blackbirdmusic.music.track.soundcloud;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.util.Objects.requireNonNull;

public final class EmbeddedLink {

    public final TrackIdentifier trackId;
    public final boolean autoplay;
    public final boolean hideRelated;
    public final boolean showComments;
    public final boolean showUser;
    public final boolean showReposts;
    public final boolean visual;

    private EmbeddedLink(Builder builder) {
        requireNonNull(builder);
        this.trackId = new TrackIdentifier(builder.trackId);
        this.autoplay       = builder.autoplay;
        this.hideRelated    = builder.hideRelated;
        this.showComments   = builder.showComments;
        this.showUser       = builder.showUser;
        this.showReposts    = builder.showReposts;
        this.visual         = builder.visual;
    }

    @JsonCreator
    public static EmbeddedLink from(
            @JsonProperty("trackId")      String trackId,
            @JsonProperty("autoplay")     boolean autoplay,
            @JsonProperty("hideRelated")  boolean hideRelated,
            @JsonProperty("showComments") boolean showComments,
            @JsonProperty("showUser")     boolean showUser,
            @JsonProperty("showReposts")  boolean showReposts,
            @JsonProperty("visual")       boolean visual

    ) {
        return new Builder()
                .trackIdentifier(trackId)
                .autoplay(autoplay)
                .hideRelated(hideRelated)
                .showComments(showComments)
                .showUser(showUser)
                .showReposts(showReposts)
                .visual(visual)
                .build();
    }

    public static final class Builder {
        private String trackId;
        private boolean autoplay;
        private boolean hideRelated;
        private boolean showComments;
        private boolean showUser;
        private boolean showReposts;
        private boolean visual;

        Builder trackIdentifier(String trackIdentifier) {
            this.trackId = trackIdentifier;
            return this;
        }

        Builder autoplay(boolean autoplay) {
            this.autoplay = autoplay;
            return this;
        }

        Builder hideRelated(boolean hideRelated) {
            this.hideRelated = hideRelated;
            return this;
        }

        Builder showComments(boolean showComments) {
            this.showComments = showComments;
            return this;
        }

        Builder showUser(boolean showUser) {
            this.showUser = showUser;
            return this;
        }

        Builder showReposts(boolean showReposts) {
            this.showReposts = showReposts;
            return this;
        }

        Builder visual(boolean visual) {
            this.visual = visual;
            return this;
        }

        EmbeddedLink build() {
            return new EmbeddedLink(this);
        }
    }

}
