import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ngCreditCard'
})
export class NgCreditCardPipe implements PipeTransform {

  transform(value: number): string {
    if (value) {
      return value.toString().replace(/\D/g, '').replace(/\s+/g, '').replace(/(\d{4})/g, '$1 ').trim();
    } else {
      return '';
    }
  }

}
