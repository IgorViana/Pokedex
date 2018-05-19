package pokedex.brothers.com.pokedex.connection


import pokedex.brothers.com.pokedex.model.Pokemon
import pokedex.brothers.com.pokedex.model.PokemonResult
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET


interface PokemonAPI {

    @GET("pokemon/")
    fun getAllPokemon(): Call<PokemonResult>

}