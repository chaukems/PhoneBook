import { Component, Inject, Optional, OnInit, ViewChild } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { MatDialog, MatTable } from '@angular/material';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

export interface UsersData {
  name: string;
  id: number;
  entries: any;
}


export interface phoneEntry {
  name: string;
  phoneNumber: string
}

const ELEMENT_DATA: phoneEntry[] = [];

@Component({
  selector: 'app-add-entry-dialog-box',
  templateUrl: './add-entry-dialog-box.component.html',
  styleUrls: ['./add-entry-dialog-box.component.css']
})
export class AddEntryDialogBoxComponent implements OnInit {

  displayedColumns: string[] = ['name', 'phoneNumber', 'action'];
  dataSource = ELEMENT_DATA;

  entryFormGroup: FormGroup;

  action: string;
  local_data: any;
  phoneNumber: any;
  name: any;

  @ViewChild(MatTable, { static: true }) table: MatTable<any>;

  constructor(
    public dialogRef: MatDialogRef<AddEntryDialogBoxComponent>,
    //@Optional() is used to prevent error if no data is passed
    @Optional() @Inject(MAT_DIALOG_DATA) public data: UsersData, private _formBuilder: FormBuilder) {
    data.entries = this.dataSource;
    this.local_data = { ...data };
    this.action = this.local_data.action;
  }

  ngOnInit() {
    this.entryFormGroup = this._formBuilder.group({
      name: ['', Validators.required],
      phonenumber: ['', Validators.required]
    });
  }

  doAction() {
    this.dataSource = ELEMENT_DATA;
    this.dialogRef.close({ event: this.action, data: this.local_data });
  }

  closeDialog() {
    this.dialogRef.close({ event: 'Cancel' });
  }

  addEntry() {
    if (!this.entryFormGroup.controls.name.value || !this.entryFormGroup.controls.phonenumber.value) {
      return;
    }

    this.dataSource.push({
      name: this.entryFormGroup.controls.name.value,
      phoneNumber: this.entryFormGroup.controls.phonenumber.value
    });
    this.table.renderRows();
  }

  deleteItem(element) {
    this.dataSource = this.dataSource.filter((value, key) => {
      return value.name != element.name;
    });
  }
}