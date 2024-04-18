import { AfterContentChecked, AfterViewChecked, Component, DoCheck, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.css']
})
export class CheckSampleComponent implements OnInit, DoCheck, AfterContentChecked, AfterViewChecked, OnDestroy {
  quantidade:number = 0;
  constructor() { }
  ngOnDestroy(): void {
    console.log('Bye Bye');
  }

  ngOnInit(): void {
  }

  ngDoCheck(): void {
    console.log('ngDoCheck');
  }

  ngAfterContentChecked(): void {
    console.log('ngAfterContentChecked');
  }

  ngAfterViewChecked(): void {
    console.log('ngAfterViewChecked');
  }

  adicionar():void{
    this.quantidade += 1;
  }

  decrementar():void{
    this.quantidade -= 1;
  }

}
