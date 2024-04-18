import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.css']
})
export class TitleComponent implements OnInit, OnChanges {

  @Input() nome:string = "";
  constructor() { }

  ngOnInit(): void {
    console.log("Iniciou");
    this.nome = "Raquel"
  }

  ngOnChanges(): void {
    console.log(`new value is ${this.nome}`);
  }

}