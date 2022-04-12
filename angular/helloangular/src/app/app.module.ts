import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { OneComponent } from './components/one/one.component';
import { TwoComponent } from './components/two/two.component';
import { OnewaybindingComponent } from './binding/onewaybinding/onewaybinding.component';

@NgModule({
  declarations: [
    AppComponent,
    OneComponent,
    TwoComponent,
    OnewaybindingComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
