import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';


@Injectable({
    providedIn: 'root'
})

export class EmployeeService {
    constructor(
        private http: HttpClient,
    ) { }


  BaseURL = environment.WEB_API;


  PostAllemployeeValues(data:any){
    return this.http.post(`${this.BaseURL}/employee`,data);
  }

  GetAllemployeeValues(){
    return this.http.get(`${this.BaseURL}/employee`);
  }

  Updateemployee(data:any){
    return this.http.put(`${this.BaseURL}/employee/${data.id}`,data);
  }

  getSpecificemployee(id:number){
    return this.http.get(`${this.BaseURL}/employee/${id}`);
  }

  getSpecificemployeeHistory(id:number){
    return this.http.get(`${this.BaseURL}/employee/${id}/history?days=30`);
  }

  DeleteemployeeValues(dataId:any){
     return this.http.delete(`${this.BaseURL}/employee/${dataId}`);
  }

  GetEntityById(employeeId:any): Observable<any> {
    return this.http.get(`${this.BaseURL}/employeeid/` + employeeId);
  }

  Searchemployee(data:any): Observable<any> {
    const temp:any = [];
    const objectKeyPair = Object.entries(data);
    objectKeyPair.forEach((element, index) => {
    if (element[1]) {
    temp.push(`${element[0]}=${element[1]}`);
    }
    });
    let jwt_token = sessionStorage.getItem('JwtToken');
    return this.http.get(`${this.BaseURL}` + `/employee/get/search?jwt_token=${jwt_token}${temp.length > 0 ? `&${temp.join('&')}` : ''}`);
  }
}