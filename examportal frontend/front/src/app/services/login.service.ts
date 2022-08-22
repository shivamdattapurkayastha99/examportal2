import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import baseUrl from './helper';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})


export class LoginService {
public loginStatusSubject=new Subject<boolean>();
  constructor(private http:HttpClient,private router:Router) { }

public getCurrentUser() {
  return this.http.get(`${baseUrl}/current-user`);
}



  public genrateToken(loginData:any) {
    return this.http.post(`${baseUrl}/genrate-token`,loginData)
  }

  
  public loginUser(token:any) {
    localStorage.setItem("token",token);
    
    return true;
  }


  
  public isUserLoggedIn() {
    let tokenStr=localStorage.getItem("token");

    if(tokenStr==undefined || tokenStr=='' || tokenStr==null){
      return false;
    }else{
      return true;
    }
  }



public removeTokenFromStorage() {
  localStorage.removeItem("token");
  localStorage.removeItem("user");
  this.router.navigate(['login']);
  return true;
}


public getTokenFromLocalStorage() {
  return localStorage.getItem("token");
}



public setUserDetailsLocalStorage(user:any) {
  localStorage.setItem("user",JSON.stringify(user));
}


public getUserDetailsFromLocalStorage() {
  let userStr=localStorage.getItem("user");

  if(userStr!=null){
    return JSON.parse(userStr);
  }else{
    this.removeTokenFromStorage();
    return null;
  }
}



public getUserRole() {
  let user=this.getUserDetailsFromLocalStorage();

  return user.authorities[0].authority;

}



}
