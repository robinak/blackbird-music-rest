package se.blackbirdmusic.music.track.soundcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/soundcloud/tracks")
public class TrackRestController {

    private final TrackRepository trackRepository;

    @Autowired
    TrackRestController(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<Track> getAll() {
        return this.trackRepository.getAll();
    }
}
