import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/services/user.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-singup',
  templateUrl: './singup.component.html',
  styleUrls: ['./singup.component.css']
})
export class SingupComponent implements OnInit {

  constructor(private userService:UserService,private _snackBar: MatSnackBar) {
     
   };

  public user={
    username:"",
    password:"",
    firstName:"",
    lastName:"",
    email:"",
    phone:""
  };
  ngOnInit(): void {
  }

  formSubmit(){
    console.log(this.user);
    if(this.user.username=="" || this.user.username==null){    
     this._snackBar.open("Username is required !!","ok",{
       duration:3000
     });
      return;
    }


    

    this.userService.addUser(this.user).subscribe(
      (data:any)=>{
        console.log(data)
        

        Swal.fire('Successfully done !! ','User name is '+data.username,'success');
      },
      (error)=>{

        console.log(error)
        Swal.fire('Opps something went wrong !! ','Registration Failed','error');
       
      }
    )

  }

}
