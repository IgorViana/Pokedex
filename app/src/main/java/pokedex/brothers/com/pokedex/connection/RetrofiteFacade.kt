package pokedex.brothers.com.pokedex.connection

import pokedex.brothers.com.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET



object RetrofiteFacade {

    fun create() : PokemonAPI {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val service = retrofit.create(PokemonAPI::class.java)

        return service
    }

}