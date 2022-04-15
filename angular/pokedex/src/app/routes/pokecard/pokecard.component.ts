import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/Pokemon';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-pokecard',
  templateUrl: './pokecard.component.html',
  styleUrls: ['./pokecard.component.css']
})
export class PokecardComponent implements OnInit {

  currentImg : string = "";
  //this is how you can initialize a model with no data yet
  pokemon : Pokemon = <Pokemon>{};

  constructor(private apiServ : ApiService) { }

  ngOnInit(): void {
      this.getOnePokemon();
  }

  changeImg(){
    if(this.currentImg === this.pokemon.sprites.front_default){
      this.currentImg = this.pokemon.sprites.front_shiny;
    }else{
      this.currentImg = this.pokemon.sprites.front_default;
    }
  }

  getOnePokemon(){
    this.apiServ.getOnePokemon().subscribe(responseBody => {
        this.pokemon = responseBody;
        this.currentImg = this.pokemon.sprites.front_default;
    });
  }

  getOnePokemonGivenId(){
    this.apiServ.getOnePokemonGivenId(this.pokemon.id + 1).subscribe(responseBody => {
        this.pokemon = responseBody;
        this.currentImg = this.pokemon.sprites.front_default;
    });
  }

}
