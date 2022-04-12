import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GenericService {
  /* A service is utilized when you want methods and variables to be utilized in MULTIPLE components

    What is Inversion of Control?
      When you give up some functionality to another entity

    What is Dependency Injection?
      - Its a subset of Inversion of Control
      - Its when you give up the creation of your dependencies to another entity 
  
  */

  constructor() { }

  sortArr(arr : Array<number>) : Array<number> {
      return arr.sort(function(a : number,b : number){
            if(a < b){
              return 1;
            }else{
              return -1;
            }
      });
  }
}
