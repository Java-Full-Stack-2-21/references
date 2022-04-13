import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './routes/dashboard/dashboard.component';
import { LoginComponent } from './routes/login/login.component';
import { RegisterComponent } from './routes/register/register.component';


/* 
  To set up routing:
    - 1: create a component for each "route" that you want
    - 2: define our routes in the the routes variable in 
    app-routing.module.ts
    - 3: add the component directive <router-outlet></router-outlet> to the app.component.html
*/
const routes: Routes = [
  //http://localhost:4200/dashboard
  {path: "dashboard", component: DashboardComponent},

  //http://localhost:4200/register
  {path: "register", component: RegisterComponent},

  //http://localhost:4200
  {path: "", component: LoginComponent},

  // ** is defining any path not specified
  {path: "**", redirectTo: ""}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
