import { CreditCard } from '../../models/creditcard';
import { Component, OnInit } from '@angular/core';
import { ViewChild, AfterViewInit } from '@angular/core';
import { NgCreditCardPipe } from '../../pipes/ng-credit-card.pipe';
import { CreditCardListComponent } from './credit-card-list.component';
import { CreditCardEditComponent } from './credit-card-edit.component';

@Component({
  selector: 'app-creditcard',
  templateUrl: '../../pages/credit-card/credit-card.component.html',
  styleUrls: ['./credit-card.component.css']
})
export class CreditCardComponent implements AfterViewInit {

  cards: CreditCard[];
  selectedCreditCard: CreditCard;
  isList = null;

  constructor() { }

  ngAfterViewInit() {
  }
  
  setIsList() { this.isList = true }
  setIsEdit() { this.isList = false }

}
