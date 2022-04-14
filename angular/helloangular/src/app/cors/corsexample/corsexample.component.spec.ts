import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CorsexampleComponent } from './corsexample.component';

describe('CorsexampleComponent', () => {
  let component: CorsexampleComponent;
  let fixture: ComponentFixture<CorsexampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CorsexampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CorsexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
