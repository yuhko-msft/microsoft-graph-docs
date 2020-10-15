---
title: "managedEBook resource type"
description: "An abstract class containing the base properties for Managed eBook."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# managedEBook resource type

Namespace: microsoft.graph

An abstract class containing the base properties for Managed eBook.

## Methods

| Method                                                                           | Return Type                                                               | Description                                                                           |
| :------------------------------------------------------------------------------- | :------------------------------------------------------------------------ | :------------------------------------------------------------------------------------ |
| [List managedEBook](../api/intune-managedebook-list.md)                          | [managedEBook](intune-managedEBook.md) collection                         | List properties and relationships of a managedEBook object.                           |
| [Create managedEBook](../api/intune-managedebook-create.md)                      | [managedEBook](intune-managedEBook.md)                                    | Create a new managedEBook object.                                                     |
| [Get managedEBook](../api/intune-managedebook-get.md)                            | [managedEBook](intune-managedEBook.md)                                    | Read properties and relationships of a managedEBook object.                           |
| [Update managedEBook](../api/intune-managedebook-update.md)                      | [managedEBook](intune-managedEBook.md)                                    | Update the properties of a managedEBook object.                                       |
| [Delete managedEBook](../api/intune-managedebook-delete.md)                      |                                                                           | Delete a managedEBook object.                                                         |
| [assign](../api/intune-managedebook-assign.md)                                   |                                                                           |                                                                                       |
| [List assignments](../api/intune-managedebook-list-assignments.md)               | [managedEBookAssignment](../resources/intune-managedebookassignment.md)   | Get the managedEBookAssignment objects from an assignments navigation property.       |
| [Create assignments](../api/intune-managedebook-post-assignments.md)             | [managedEBookAssignment](../resources/intune-managedebookassignment.md)   | Create a new managedEBookAssignment object.                                           |
| [Get assignments](../api/intune-managedebook-get-assignments.md)                 | [managedEBookAssignment](../resources/intune-managedebookassignment.md)   | Read the properties and relationships of a managedEBookAssignment object.             |
| [Update assignments](../api/intune-managedebook-update-assignments.md)           | [managedEBookAssignment](../resources/intune-managedebookassignment.md)   | Update the properties of a managedEBookAssignment object.                             |
| [Delete assignments](../api/intune-managedebook-delete-assignments.md)           |                                                                           | Delete a managedEBookAssignment object.                                               |
| [List deviceStates](../api/intune-managedebook-list-devicestates.md)             | [deviceInstallState](../resources/intune-deviceinstallstate.md)           | Get the deviceInstallState objects from a deviceStates navigation property.           |
| [Create deviceStates](../api/intune-managedebook-post-devicestates.md)           | [deviceInstallState](../resources/intune-deviceinstallstate.md)           | Create a new deviceInstallState object.                                               |
| [Get deviceStates](../api/intune-managedebook-get-devicestates.md)               | [deviceInstallState](../resources/intune-deviceinstallstate.md)           | Read the properties and relationships of a deviceInstallState object.                 |
| [Update deviceStates](../api/intune-managedebook-update-devicestates.md)         | [deviceInstallState](../resources/intune-deviceinstallstate.md)           | Update the properties of a deviceInstallState object.                                 |
| [Delete deviceStates](../api/intune-managedebook-delete-devicestates.md)         |                                                                           | Delete a deviceInstallState object.                                                   |
| [List installSummary](../api/intune-managedebook-list-installsummary.md)         | [eBookInstallSummary](../resources/intune-ebookinstallsummary.md)         | Get the eBookInstallSummary objects from an installSummary navigation property.       |
| [Create installSummary](../api/intune-managedebook-post-installsummary.md)       | [eBookInstallSummary](../resources/intune-ebookinstallsummary.md)         | Create a new eBookInstallSummary object.                                              |
| [Get installSummary](../api/intune-managedebook-get-installsummary.md)           | [eBookInstallSummary](../resources/intune-ebookinstallsummary.md)         | Read the properties and relationships of an eBookInstallSummary object.               |
| [Update installSummary](../api/intune-managedebook-update-installsummary.md)     | [eBookInstallSummary](../resources/intune-ebookinstallsummary.md)         | Update the properties of an eBookInstallSummary object.                               |
| [Delete installSummary](../api/intune-managedebook-delete-installsummary.md)     |                                                                           | Delete an eBookInstallSummary object.                                                 |
| [List userStateSummary](../api/intune-managedebook-list-userstatesummary.md)     | [userInstallStateSummary](../resources/intune-userinstallstatesummary.md) | Get the userInstallStateSummary objects from an userStateSummary navigation property. |
| [Create userStateSummary](../api/intune-managedebook-post-userstatesummary.md)   | [userInstallStateSummary](../resources/intune-userinstallstatesummary.md) | Create a new userInstallStateSummary object.                                          |
| [Get userStateSummary](../api/intune-managedebook-get-userstatesummary.md)       | [userInstallStateSummary](../resources/intune-userinstallstatesummary.md) | Read the properties and relationships of a userInstallStateSummary object.            |
| [Update userStateSummary](../api/intune-managedebook-update-userstatesummary.md) | [userInstallStateSummary](../resources/intune-userinstallstatesummary.md) | Update the properties of a userInstallStateSummary object.                            |
| [Delete userStateSummary](../api/intune-managedebook-delete-userstatesummary.md) |                                                                           | Delete a userInstallStateSummary object.                                              |

## Properties

| Property              | Type                                       | Description                                         |
| :-------------------- | :----------------------------------------- | :-------------------------------------------------- |
| createdDateTime       | DateTimeOffset                             | The date and time when the eBook file was created.  |
| description           | String                                     | Description.                                        |
| displayName           | String                                     | Name of the eBook.                                  |
| id                    | String                                     | Key of the entity. Read-only.                       |
| informationUrl        | String                                     | The more information Url.                           |
| largeCover            | [mimeContent](../resources/mimecontent.md) | Book cover.                                         |
| lastModifiedDateTime  | DateTimeOffset                             | The date and time when the eBook was last modified. |
| privacyInformationUrl | String                                     | The privacy statement Url.                          |
| publishedDateTime     | DateTimeOffset                             | The date and time when the eBook was published.     |
| publisher             | String                                     | Publisher.                                          |

## Relationships

| Relationship     | Type                                                                          | Description                                     |
| :--------------- | :---------------------------------------------------------------------------- | :---------------------------------------------- |
| assignments      | [managedEBookAssignment](../resources/managedebookassignment.md) collection   | The list of assignments for this eBook.         |
| deviceStates     | [deviceInstallState](../resources/deviceinstallstate.md) collection           | The list of installation states for this eBook. |
| installSummary   | [eBookInstallSummary](../resources/ebookinstallsummary.md)                    | Mobile App Install Summary.                     |
| userStateSummary | [userInstallStateSummary](../resources/userinstallstatesummary.md) collection | The list of installation states for this eBook. |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedEBook",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.managedEBook",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "informationUrl": "String",
  "largeCover": {"@odata.type": "microsoft.graph.mimeContent"},
  "lastModifiedDateTime": "DateTimeOffset",
  "privacyInformationUrl": "String",
  "publishedDateTime": "DateTimeOffset",
  "publisher": "String"
}
```
