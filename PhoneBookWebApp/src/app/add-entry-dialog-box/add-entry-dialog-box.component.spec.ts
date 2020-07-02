import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEntryDialogBoxComponent } from './add-entry-dialog-box.component';

describe('AddEntryDialogBoxComponent', () => {
  let component: AddEntryDialogBoxComponent;
  let fixture: ComponentFixture<AddEntryDialogBoxComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddEntryDialogBoxComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEntryDialogBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
