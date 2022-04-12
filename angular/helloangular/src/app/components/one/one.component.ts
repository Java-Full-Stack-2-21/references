import { Component, OnInit } from '@angular/core';

//decorator: adds metadata to an enetity
@Component({
  selector: 'app-one', //html tag we will use to reference this component <app-one></app-one>
  templateUrl: './one.component.html', //location of the html file in relation to this component
  styleUrls: ['./one.component.css'] // location of the css files related to this component
})
export class OneComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
