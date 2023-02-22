export class ReviewDto {

    id: number;
    customerName:string;
    itemName:string;
    message: string;
    restaurantId: number;
    starRating: number;
   

    constructor(id:number, customerName:string, itemName:string,message: string, restaurantId: number, starRating:number){
        this.id=id;
        this.customerName=customerName;
        this.itemName=itemName;
        this.message=message; 
        this.restaurantId=restaurantId;
        this.starRating=starRating;
        
    }

}
