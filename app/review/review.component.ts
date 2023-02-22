import { Component, OnInit,  } from '@angular/core';
import { Review } from '../review';
import { ReviewOperationsService } from '../review-operations.service';




@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css'],



})


export class ReviewComponent {
  model:Review = new Review(0,'','','',0,0);
  submitted = false;
  success = false;
  error = false;
  numberOfStars = [1,2,3,4,5];
  status = false;
  message = '';
  constructor(private ReviewOperationsService:ReviewOperationsService) {}

  onSubmit(){
    this.ReviewOperationsService.submitReview(this.model).subscribe(

      data=>{
        this.status=true;
        this.message="review submitted";
      },
      error=>{

      }
    )

  }



  
 


}
