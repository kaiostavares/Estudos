import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  produtos:string[] = [
    "Teclado",
  "Mouse",
    "Monitor",
    "Celular"
  ]
  menuType:string = "admin"

  constructor() { }

  ngOnInit(): void {
  }

  Adicionar(conditional:boolean):void{
    conditional? this.produtos.push("Kaio") : this.produtos.pop();
  }

  remover(index:number): void{
    this.produtos.splice(index, 1);
  }
}
