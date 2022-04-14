import { HttpClient } from '@angular/common/http';
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

  constructor(private httpCli : HttpClient) { }

  sortArr(arr : Array<number>) : Array<number> {
      return arr.sort(function(a : number,b : number){
            if(a < b){
              return 1;
            }else{
              return -1;
            }
      });
  }

  login(name: string, description: string, platform: string){
    return this.httpCli.post<any>(`http://localhost:9000/session`, {
       "name": name,
       "description": description,
       "platform": platform
    }
    , {
      withCredentials: true
    });
  }

  checkSession(){
    return this.httpCli.get<any>('http://localhost:9000/session', {
      withCredentials: true
    });
  }

  logout(){
    return this.httpCli.delete<any>('http://localhost:9000/session', {
      withCredentials: true
    });
  }
}
