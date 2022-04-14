import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  isVisible : boolean = false;
  inputFromParent : string = "";

  constructor() { }

  ngOnInit(): void {
  }

  toggleChild(){

    this.isVisible = !this.isVisible;

    // if(this.isVisible == true){
    //   this.isVisible = false;
    // }else{
    //   this.isVisible = true;
    // }
  }

}
