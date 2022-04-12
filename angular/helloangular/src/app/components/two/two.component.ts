import { Component, OnInit } from '@angular/core';
import { GenericService } from 'src/app/services/generic.service';

@Component({
  selector: 'app-two',
  templateUrl: './two.component.html',
  styleUrls: ['./two.component.css']
})
export class TwoComponent implements OnInit {

  arr : Array<number> = [64,43,12,72,23];

  //referencing the generic service in the one and two component
  constructor(private genericService : GenericService) { }

  ngOnInit(): void {
  }

}
