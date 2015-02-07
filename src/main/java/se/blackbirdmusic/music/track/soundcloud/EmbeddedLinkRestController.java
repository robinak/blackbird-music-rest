package se.blackbirdmusic.music.track.soundcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/soundcloud/embeddedlinks")
public class EmbeddedLinkRestController {

    private final EmbeddedLinkRepository embeddedLinkRepository;

    @Autowired
    EmbeddedLinkRestController(EmbeddedLinkRepository embeddedLinkRepository){
        this.embeddedLinkRepository = embeddedLinkRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<EmbeddedLink> getAll() {
        return this.embeddedLinkRepository.getAll();
    }
}
