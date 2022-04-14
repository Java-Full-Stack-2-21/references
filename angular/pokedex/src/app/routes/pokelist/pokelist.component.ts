import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-pokelist',
  templateUrl: './pokelist.component.html',
  styleUrls: ['./pokelist.component.css']
})
export class PokelistComponent implements OnInit {

  pokemons : Array<any> = [];

  constructor(private pokeApi : ApiService) { }

  ngOnInit(): void {
    this.getAllPokemon();
  }

  getAllPokemon(){
    this.pokeApi.getAllPokemon().subscribe(responseBody => {
        //this.pokemons = responseBody.results.map((pokemon: { name: string; }) => pokemon.name);
        this.pokemons = responseBody.results;
      });
  }

  goToPokemon(e : any){
    console.log(e.target.innerText);
  }

}
