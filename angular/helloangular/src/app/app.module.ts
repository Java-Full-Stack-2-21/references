import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { OneComponent } from './components/one/one.component';
import { TwoComponent } from './components/two/two.component';
import { OnewaybindingComponent } from './binding/onewaybinding/onewaybinding.component';
import { TwowaybindingComponent } from './binding/twowaybinding/twowaybinding.component';
import { FormsModule } from '@angular/forms';
import { PipeexampleComponent } from './pipes/pipeexample/pipeexample.component';
import { PiglatinPipe } from './pipes/piglatin.pipe';
import { DirectiveexampleComponent } from './directives/directiveexample/directiveexample.component';
import { ParentComponent } from './lifcecyclehooks/parent/parent.component';
import { ChildComponent } from './lifcecyclehooks/child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    OneComponent,
    TwoComponent,
    OnewaybindingComponent,
    TwowaybindingComponent,
    PipeexampleComponent,
    PiglatinPipe,
    DirectiveexampleComponent,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
