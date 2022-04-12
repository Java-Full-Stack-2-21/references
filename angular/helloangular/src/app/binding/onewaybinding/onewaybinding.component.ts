import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'onewaybinding',
  templateUrl: './onewaybinding.component.html',
  styleUrls: ['./onewaybinding.component.css']
})
export class OnewaybindingComponent implements OnInit {

  /* 
    What is one way binding
      - will bind the data from the component ts file to the html file in the component

    TS to HTML bindings:
      - interpolation
        - with interpolation, you use the {{}} syntax on the html page to reference variables in the ts file
      - property binding
        - properties of html elements
        - []=""  <--- as an attribute

    HTML to TS binding:
      - event binding
        - relating a method call to an event
        - (EVENT)="METHOD()"
  */

  interpolationVariable : string = "Hello Interpolation";
  propertyBindingVariable : string = "<h1>Hello Property Binding!</h1>";
  idVal : number = 42;
  isPink : boolean = true;

  createAlert(){
    this.isPink = !this.isPink;
  }

  constructor() { }

  ngOnInit(): void {
  }

  

}
