package org.choongang.pokemon.entities.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpriteOther {
    private SpriteImage dream_world;
    private SpriteImage home;
    private SpriteImage showdown;
    @JsonAlias("official-artwork")
    private SpriteImage official_artwork;
}
