import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor(private _http:HttpClient) { }


  
  public getQuestionsByQuiz(qid:any) {
    return this._http.get(`${baseUrl}/question/questions/all/`+qid);
  }

  
  public addQuestion(question:any) {
    return this._http.post(`${baseUrl}/question/`,question);
  }

  
  public deleteQuestion(questionId:any) {
    return this._http.delete(`${baseUrl}/question/`+questionId)
  }


  
   public getQuestionsByQuizforUser(qid:any) {
    return this._http.get(`${baseUrl}/question/quiz/`+qid);
  }

  
  public submitExam(questions:any) {
    return this._http.post(`${baseUrl}/question/submit-exam`,questions);
  }
}
