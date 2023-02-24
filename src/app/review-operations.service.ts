import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Review } from './review';
import { ReviewDto } from './review.dto';

@Injectable({
  providedIn: 'root'
})
export class ReviewOperationsService {
  constructor(private http:HttpClient) {}


  baseURL:string = 'http://localhost:2023';
  submitReviewEndPoint:string=this.baseURL+'/review/register';
  ReviewByRestaurantIdEndPoint:string=this.baseURL+'/review/restaurant';
  //localhost:2023/review/restaurant/675
  
  
 
  getReviewByRestaurantId(restaurantId:number):Observable<ReviewDto[]>{
    console.log("inside method 1" +this.ReviewByRestaurantIdEndPoint);
    this.ReviewByRestaurantIdEndPoint= this.ReviewByRestaurantIdEndPoint+'/'+restaurantId;
    console.log("after getting review 2"+ this.ReviewByRestaurantIdEndPoint);

    return this.http.get<ReviewDto[]>(`${this.ReviewByRestaurantIdEndPoint}`);
  }


  
  

 

  submitReview(review:Review):Observable<Review>{

    console.log("inside method 1: Review added" +review);
    
    console.log("customerId "+review.id);
    console.log("customerName "+review.customerName);
    console.log("customerId "+review.itemName);
    
    console.log("customerId "+review.starRating);
    console.log("customerId "+review.message);
    console.log("customerId "+review.restaurantId);


    return this.http.post<Review>(`${this.submitReviewEndPoint}`,review);
  }


  }

  
  
