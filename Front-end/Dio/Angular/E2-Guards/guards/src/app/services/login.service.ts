import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  doLogin():void{
    localStorage.setItem('token', 'oipasjdklaj212');
  }

  doLogout():void{
    localStorage.clear();
  }
}
