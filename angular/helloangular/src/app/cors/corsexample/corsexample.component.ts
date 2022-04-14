import { Component, OnInit } from '@angular/core';
import { GenericService } from 'src/app/services/generic.service';

@Component({
  selector: 'app-corsexample',
  templateUrl: './corsexample.component.html',
  styleUrls: ['./corsexample.component.css']
})
export class CorsexampleComponent implements OnInit {

  constructor(private genericService : GenericService) { }

  name: string = "Ratchet and Clank";
  description: string = "racoon taking over the universe";
  platform: string = "playstation";

  ngOnInit(): void {
  }

  login(){
    this.genericService.login(this.name, this.description, this.platform).subscribe(responseBody => {
        console.log(responseBody)
    });
  }

  checkSession(){
    this.genericService.checkSession().subscribe(responseBody => {
        console.log(responseBody);
    })
  }

  logout(){
    this.genericService.logout().subscribe(responseBody => {
      console.log(responseBody);
    })
  }

}
