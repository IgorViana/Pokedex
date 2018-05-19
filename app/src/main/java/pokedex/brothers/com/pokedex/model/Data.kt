package pokedex.brothers.com.pokedex.model

import com.google.gson.annotations.SerializedName

data class Pokemon(var name: String)

data class PokemonResult(
        @SerializedName("results")
        var pokemons: List<Pokemon>)