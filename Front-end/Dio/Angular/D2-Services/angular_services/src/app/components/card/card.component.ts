import { Component, OnInit } from '@angular/core';
import { PokemonData } from 'src/app/models/pokemonData';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  pokemom:PokemonData
  constructor(
    private service:PokemonService
  ) { 
    this.pokemom = {
      id:0,
      name:'',
      sprites:{
        front_default: ''
      },
      types: [{
        slot:0,
        type:{
          name:'',
          url:''
        }
      }]
    }
  }

  ngOnInit(): void {
    this.getPokemon('pikachu')
  }

  getPokemon(searchName:string){
    this.service.getPokemon(searchName).subscribe({
      next: (res) => {
        this.pokemom = {
          id: res.id,
          name: res.name,
          sprites: res.sprites,
          types: res.types
        }
      },
    })
  }
}
