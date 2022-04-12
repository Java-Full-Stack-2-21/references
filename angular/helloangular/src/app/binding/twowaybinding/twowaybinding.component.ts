import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twowaybinding',
  templateUrl: './twowaybinding.component.html',
  styleUrls: ['./twowaybinding.component.css']
})
export class TwowaybindingComponent implements OnInit {

  inputData : string = "";
  constructor() { }

  // handleInput(event : any){
  //     this.inputData = event.target.value;
  // }

  ngOnInit(): void {
  }

}
