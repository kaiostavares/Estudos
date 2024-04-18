import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-atributos',
  templateUrl: './comp-atributos.component.html',
  styleUrls: ['./comp-atributos.component.css']
})
export class CompAtributosComponent implements OnInit {
  estilo:string = ""
  corFundo:string = "red"
  color:string = "white"
  item:string = ""
  lista:string[] = [];
  isEnableBlock:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  trocar():void{
    if(this.estilo === "disable"){
      this.estilo = "enable"
    }else{
      this.estilo = "disable"
    }
  }

  aidicionarItem(item:string):void{
    this.lista.push(item);
  }

}