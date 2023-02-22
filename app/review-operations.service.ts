import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Review } from './review';
import { ReviewDto } from './review.dto';

@Injectable({
  providedIn: 'root'
})
export class ReviewOperationsService {

  baseURL:string = 'http://localhost:2023';
  submitReviewEndPoint:string=this.baseURL+'/review/register';
  ReviewByRestaurantIdEndPoint:string=this.baseURL+'/review/restaurant';
  //localhost:2023/review/restaurant/675
  
  
  constructor(private http:HttpClient) {

    
  }

  getReviewByRestaurantId(restaurantId:number):Observable<ReviewDto[]>{
    console.log("inside method 1" +this.ReviewByRestaurantIdEndPoint);
    this.ReviewByRestaurantIdEndPoint= this.ReviewByRestaurantIdEndPoint+'/'+restaurantId;
    console.log("after getting review 2"+ this.ReviewByRestaurantIdEndPoint);

    return this.http.get<ReviewDto[]>(`${this.ReviewByRestaurantIdEndPoint}`);
  }


 

  submitReview(review:Review):Observable<Review>{

    console.log("inside method 1: Review added" +review);
    return this.http.post<Review>(`${this.submitReviewEndPoint}`,Review);
  }


  }

  

