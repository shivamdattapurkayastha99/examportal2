import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  constructor(private _http:HttpClient) { }

  
  public getQuizzes() {
    return this._http.get(`${baseUrl}/quiz/`)
  }

  
  public addNewQuiz(quizData:any) {
    return this._http.post(`${baseUrl}/quiz/`,quizData);
  }

  
  public deleteQuizById(qid:any) {
    return this._http.delete(`${baseUrl}/quiz/${qid}`);
  }


  
  public getQuizById(qid:any) {
    return this._http.get(`${baseUrl}/quiz/${qid}`);
  }

  
  public updateQuiz(quiz:any) {
    return this._http.put(`${baseUrl}/quiz/`,quiz)
  }


  
  public getQuizzessByCategory(cid:any) {

    return this._http.get(`${baseUrl}/quiz/category/${cid}`)
    
  }



  
  public getActiveQuizzes() {
    return this._http.get(`${baseUrl}/quiz/active`)
  }

  
  public getActiveQuizzesByCategory(cid:any) {
    return this._http.get(`${baseUrl}/quiz/category/active/${cid}`)
  }
}
