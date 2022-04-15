import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pokemon } from '../models/Pokemon';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  pokeName : string = "pikachu";

  constructor(private httpCli : HttpClient) { }

  getAllPokemon() {
    return this.httpCli.get<any>("https://pokeapi.co/api/v2/pokemon?limit=151");
  }

  getOnePokemon(){
    return this.httpCli.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${this.pokeName}`);
  }

  getOnePokemonGivenId(id : number){
    return this.httpCli.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${id}`);
  }

  
}
