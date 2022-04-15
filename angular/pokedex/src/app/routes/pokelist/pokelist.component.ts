import { Component, DoCheck, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-pokelist',
  templateUrl: './pokelist.component.html',
  styleUrls: ['./pokelist.component.css']
})
export class PokelistComponent implements OnInit, DoCheck {

  filterInput : string = "";
  pokemons : Array<any> = [];
  filteredPokemon : Array<any> = [];

  //router allows to navigate to new routes
  constructor(private pokeApi : ApiService, private router : Router) { }

  ngDoCheck(): void {
      this.filteredPokemon = this.pokemons.filter((pokemon : any) => pokemon.name.includes(this.filterInput.toLowerCase()));
  }

  ngOnInit(): void {
    this.getAllPokemon();
  }

  getAllPokemon(){
    this.pokeApi.getAllPokemon().subscribe(responseBody => {
        //this.pokemons = responseBody.results.map((pokemon: { name: string; }) => pokemon.name);
        this.pokemons = responseBody.results;
        this.filteredPokemon = this.pokemons;
      });
  }

  goToPokemon(e : any){
    let name : string = e.target.innerText;
    this.pokeApi.pokeName = name.toLowerCase();

    //this is equivalent to window.location = ""  in js
    this.router.navigate(['/card'])
  }

}
