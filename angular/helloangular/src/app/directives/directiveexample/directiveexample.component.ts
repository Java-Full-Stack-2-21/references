import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directiveexample',
  templateUrl: './directiveexample.component.html',
  styleUrls: ['./directiveexample.component.css']
})
export class DirectiveexampleComponent implements OnInit {

  names : Array<string> = ["Lalitha", "Zachary", "Donneice", "Matthew"];
  isSpecial : boolean = true;
  isVerySpecial : boolean = true;
  isSuperSpecial : boolean = false;
  classes : object = {};
  styles : object = {};
  bgColor: string = "pink";
  isVisible: boolean = false;

  constructor() {
    this.setClasses();
    this.setStyles();
  }

  toggleBackgroundColor(){
    this.bgColor = this.bgColor == "pink" ? "lightgreen" : "pink";

    // if(this.bgColor == "pink")
    //   this.bgColor = "lightgreen";
    // else  
    //   this.bgColor = "pink";

    this.setStyles();
  }

  setStyles(){
    this.styles = {
      "background-color": this.bgColor,
      "color": "blue",
      "padding": "20px",
      "border-radius": "8px"
    }
  }

  setClasses(){
    this.classes = {
      "special": this.isSpecial,
      "verySpecial": this.isVerySpecial,
      "superSpecial": this.isSuperSpecial
    }
  }

  ngOnInit(): void {
  }

}
