import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReviewComponent } from './review/review.component';
import { Router, RouterModule, Routes } from '@angular/router';
import { SubmitComponent } from './submit/submit.component';

const allLinks:Routes = [
  {path:'submit',component:SubmitComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    ReviewComponent
  ],
  imports: [
    BrowserModule,AppRoutingModule,
    RouterModule.forRoot(allLinks),
    HttpClientModule,
    FormsModule

   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
