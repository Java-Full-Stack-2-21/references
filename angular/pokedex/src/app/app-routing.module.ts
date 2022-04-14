import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PokecardComponent } from './routes/pokecard/pokecard.component';
import { PokelistComponent } from './routes/pokelist/pokelist.component';

const routes: Routes = [
  {path: "card", component: PokecardComponent},
  {path: "", component: PokelistComponent},
  {path: "**", redirectTo: ""} // redirecting anything else to pokelist
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
