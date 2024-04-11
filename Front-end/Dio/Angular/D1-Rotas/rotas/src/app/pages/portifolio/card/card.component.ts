import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor(
    private parametrizador: ActivatedRoute,
    private navegador:Router) { 
    this.parametrizador.firstChild?.params.subscribe(
      res => console.log(res)
    )

    this.parametrizador.queryParams.subscribe(
      res => console.log(res)
    )
  }

  //Forançando a voltar uma rota
  ngOnInit(): void {
    setInterval(()=>{
      this.navegador.navigate(['/'])
    }, 5000)
  }

}
