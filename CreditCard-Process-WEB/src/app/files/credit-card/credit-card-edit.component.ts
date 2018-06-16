import { CreditCard } from '../../models/creditcard';
import { Component, OnInit, Input } from '@angular/core';
import { NgCreditCardPipe } from '../../pipes/ng-credit-card.pipe';
import { CreditCardService } from '../../services/credit-card.service';

@Component({
  selector: 'app-creditcard-edit',
  templateUrl: './../../pages/credit-card/credit-card-edit.html',
  styleUrls: ['./credit-card.component.css']
})
export class CreditCardEditComponent implements OnInit {

  card: CreditCard;
  isEdit: boolean;
  mostrar: boolean;
  
  @Input()
  set setIsEdit(isEdit: boolean) {
    this.isEdit = isEdit;
  }

  constructor(private creditCardService: CreditCardService) { }

  ngOnInit() {
    this.mostrar = false;
    this.card = {
      id : null,
      givenName : '',
      cardNumber : null,
      limit : null,
      balance : null,
      error : null
    };
  }
  
  currencyInputChanged(value) {
    var num = value.replace(/[$,]/g, "");
    return Number(num);
  }
  
  save() {
    var saved = this.creditCardService.save(this.card);
    if (saved != null && saved.error == null && saved.id != null) {
      this.card = {
        id : null,
        givenName : '',
        cardNumber : null,
        limit : null,
        balance : null,
        error : null
      };
      this.mostrar = false;
    } else {
      if (saved != null) {
        this.card.error = saved.error;
        this.mostrar = true;
      }
    }
  }

}
