

# Scopes required by Microsoft Graph Toolkit Components


## Agenda

| Scope/Permission | Resource | Required? |
| - | - | - |
| Calendars.Read | [/me/calendarview](/graph/api/calendar-list-calendarview?view=graph-rest-1.0) | Yes |
| **+ People Required Scopes** |  | Yes - MgtPeople is used to render event attendees | 


## Login

| Scope/Permission | Resource | Required? |
| - | - | - |
| User.Read | [/me](/graph/api/user-get?view=graph-rest-1.0&tabs=http) + [/me/photo/$value](/graph/api/profilephoto-get?view=graph-rest-beta) | Yes |

## Person

| Scope/Permission | Resource | Required? |
| - | - | - |
| User.Read          | [/me](/graph/api/user-get?view=graph-rest-1.0) + [/me/photo/$value](/graph/api/profilephoto-get?view=graph-rest-beta) | Yes  |
| People.Read        | [/me/people/?$search=](/graph/api/user-list-people?view=graph-rest-1.0)      | Yes - used to find a person when a person query is provided | 
| Contacts.Read      | [/me/contacts](/graph/api/user-list-contacts?view=graph-rest-1.0&tabs=cs) | Required if `MgtPerson.config.useContactsApis === true`. Default is true. Used to fetch details and photo for personal contact  | 
| User.ReadBasic.All | [/users/{id}/photo/$value](/graph/api/user-list-people?view=graph-rest-1.0)  | Yes - used to fetch user's details and photo | 
| Presence.Read      | [/me/presence](/graph/api/presence-get?view=graph-rest-beta)                 | Only if `showPresence` is `true`. | 
| Presence.Read.All  | [/users/{id}/presence](/graph/api/presence-get?view=graph-rest-beta)         | Only if `showPresence` is `true`.  |
| **+ PERSON CARD REQUIRED SCOPES** |  | Only if Person Card interaction is enabled | 

## People

| Scope/Permission | Resource | Required? |
| - | - | - |
| People.Read | [/me/people](/graph/api/user-list-people?view=graph-rest-1.0) | Yes, if `user-ids` or `group-id` are not set |
| User.ReadBasic.All| [/users/{id}](/graph/api/user-get?view=graph-rest-1.0) or [/groups/{groupId}/members](/graph/api/group-list-members?view=graph-rest-1.0) | Yes if `user-ids` or `group-id` is specified |
| Presence.Read.All  | [/users/{id}/presence](/graph/api/presence-get?view=graph-rest-beta)         | Only if `showPresence` is `true`.  |
| **+ PERSON REQUIRED SCOPES** |  | The People component uses the Person component for representing people  | 

## People Picker


| Scope/Permission | Resource | Required? |
| - | - | - |
| People.Read | [/me/people](/graph/api/user-list-people?view=graph-rest-1.0) | Yes, if `user-ids` or `group-id` are not set |
| User.ReadBasic.All| [/users/{id}](/graph/api/user-get?view=graph-rest-1.0) or [/groups/{groupId}/members](/graph/api/group-list-members?view=graph-rest-1.0) | Yes if `user-ids` or `group-id` is specified |
| Presence.Read.All  | [/users/{id}/presence](/graph/api/presence-get?view=graph-rest-beta)         | Only if `showPresence` is `true`.  |
| **+ PERSON REQUIRED SCOPES** |  | The People component uses the Person component for representing people  | 

## Person Card

## Tasks

## ToDo

## Teams Channel Picker


| Resource | Permission |
| - | - |
|  | Calendars.Read |