package pokedex.brothers.com.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import retrofit2.Response
import pokedex.brothers.com.pokedex.connection.RetrofiteFacade
import pokedex.brothers.com.pokedex.model.Pokemon
import pokedex.brothers.com.pokedex.model.PokemonResult
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pokemon = Pokemon("Bulbasauro")
        val pokemon2 = Pokemon("Bulbasauro")

        RetrofiteFacade.create().getAllPokemon().enqueue(object : Callback<PokemonResult> {
            override fun onResponse(call: Call<PokemonResult>, response: Response<PokemonResult>) {
                val pokemons = response.body()?.pokemons
                Log.i("P0KE", "$pokemons")
            }

            override fun onFailure(call: Call<PokemonResult>?, t: Throwable?) {
                t?.printStackTrace()
            }
        })



}}
