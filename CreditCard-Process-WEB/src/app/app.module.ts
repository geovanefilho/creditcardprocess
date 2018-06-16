import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { MatTabsModule, MatToolbarModule, MatButtonModule, MatFormFieldModule,
    MatInputModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { CreditCardComponent } from './files/credit-card/credit-card.component';
import { CreditCardListComponent } from './files/credit-card/credit-card-list.component';
import { CreditCardEditComponent } from './files/credit-card/credit-card-edit.component';
import { NgCreditCardPipe } from './pipes/ng-credit-card.pipe';

@NgModule({
  declarations: [
    AppComponent,
    CreditCardComponent,
    CreditCardListComponent,
    CreditCardEditComponent,
    NgCreditCardPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    MatTabsModule,
    MatToolbarModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
