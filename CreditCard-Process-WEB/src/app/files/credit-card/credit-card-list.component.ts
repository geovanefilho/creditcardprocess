import { CreditCard } from '../../models/creditcard';
import { Component, OnInit, Input } from '@angular/core';
import { NgCreditCardPipe } from '../../pipes/ng-credit-card.pipe';
import { CreditCardService } from '../../services/credit-card.service';

@Component({
  selector: 'app-creditcard-list',
  templateUrl: './../../pages/credit-card/credit-card-list.html',
  styleUrls: ['./credit-card.component.css']
})
export class CreditCardListComponent implements OnInit {

  cards: CreditCard[];
  @Input() isList: boolean;
  
  @Input()
  set setIsList(isList: boolean) {
    if (isList) {
      this.cards = this.creditCardService.getCreditCards();
    } else {
      this.cards = [];
    }
  }

  constructor(private creditCardService: CreditCardService) { }

  ngOnInit() {
    this.cards = this.creditCardService.getCreditCards();
  }

}
