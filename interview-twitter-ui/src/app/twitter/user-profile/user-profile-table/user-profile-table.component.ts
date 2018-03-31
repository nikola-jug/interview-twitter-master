import {Component, Input} from '@angular/core';
import {UserModel} from "../../../models/user.model";

@Component({
  selector: 'app-user-profile-table',
  templateUrl: './user-profile-table.component.html',
  styleUrls: ['./user-profile-table.component.css']
})
export class UserProfileTableComponent {

  @Input() user: UserModel;

}
