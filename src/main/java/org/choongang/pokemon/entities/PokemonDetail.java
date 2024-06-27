package org.choongang.pokemon.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PokemonDetail extends AbstractPokemonDetail {
    private long seq;
    private long num;
    private String name;
    private int weight;
    private int height;
    private int baseExperience;
    private String frontImage;
    private String backImage;
    private String rawData;
    private String nameKr;
    private String description;
}
