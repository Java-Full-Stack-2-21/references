import { Component, OnInit } from '@angular/core';
import { GenericService } from 'src/app/services/generic.service';

//decorator: adds metadata to an enetity
@Component({
  selector: 'app-one', //html tag we will use to reference this component <app-one></app-one>
  templateUrl: './one.component.html', //location of the html file in relation to this component
  styleUrls: ['./one.component.css'] // location of the css files related to this component
})
export class OneComponent implements OnInit {

  arr : Array<number> = [85,43,12,54,23];
  
  //we are referencing a service here so we can 
  //  access the logic of the sort method we have already written
  constructor(private genericService : GenericService) { }

  ngOnInit(): void {
  }

  sort(){
    this.arr = this.genericService.sortArr(this.arr);
    this.printArr();
  }

  printArr(){
    console.log(this.arr);
  }

}
