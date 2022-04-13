import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DirectiveexampleComponent } from './directiveexample.component';

describe('DirectiveexampleComponent', () => {
  let component: DirectiveexampleComponent;
  let fixture: ComponentFixture<DirectiveexampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DirectiveexampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DirectiveexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
