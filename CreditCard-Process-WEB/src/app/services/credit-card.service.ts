import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { CreditCard } from '../models/creditcard';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CreditCardService {

  getAllURL = 'http://localhost:8080/CreditCard-Process-API-0.0.1-SNAPSHOT/getAll';
  saveURL = 'http://localhost:8080/CreditCard-Process-API-0.0.1-SNAPSHOT/save';
  
  cards : CreditCard[];
  saved: CreditCard;
  
  constructor(private http: HttpClient) { }
  
  getCreditCards() : CreditCard[] {
    this.http.get<CreditCard[]>(this.getAllURL).subscribe(data => {
            this.cards = data;
        });
    return this.cards;
  }
  
  save(card: CreditCard) : CreditCard {
    card.error = null;
    this.http.post<CreditCard>(this.saveURL, card, {headers: {'Access-Control-Allow-Origin':'*'}}).subscribe(
      data => {
            this.saved = data;
        })
    return this.saved;
  };
}
