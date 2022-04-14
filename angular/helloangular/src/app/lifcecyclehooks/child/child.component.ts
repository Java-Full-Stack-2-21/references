import { Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit, OnDestroy, OnChanges, DoCheck {

  childVar : string = "";
  interval : any;
  counter : number = 0;

  @Input()
  variableInChild : string = "";

  /* 
    All components have a lifecycle:
      - component gets created
      - component is rendered to the screen
      - child components get created and rendered
      - component checks for changes of data bound properties
      - component is destroyed
  

    There are functions for each stage of the component lifecycle that get called when the stage of the lifecycle happens

    - ngOnInit(): called when the component is rendered to the screen
    - ngOnDestroy(): called when the component is destroyed
      - in angular thats when the component is removed from the screen
    - ngOnChanges() : when @Input properties change (parent properties that are in the child)
    - ngDoCheck() : gets called anytime a property changes in the child

    https://angular.io/guide/lifecycle-hooks
  */



  constructor() {
    console.log("constructor called");
  }

  /* since ngOnChanges get called so frequently, heavy computations should not be utilized in this method */
  ngOnChanges(): void {
    console.log("ngOnChanges called");
  }

  ngOnInit(): void {
    console.log("ngOnInit called");

    // this.interval = setInterval(() => {
    //   console.log(this.counter++);
    // }, 1000);
  }

  ngOnDestroy() : void {
    console.log("ngOnDestroy called");
    // clearInterval(this.interval);
  }

  ngDoCheck(): void {
    console.log("ngDoCheck called");
  }

}
