---
title: "user resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# user resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                  | Return Type                                                   | Description                                                                         |
| :---------------------------------------------------------------------- | :------------------------------------------------------------ | :---------------------------------------------------------------------------------- |
| [List user](../api/user-list.md)                                        | [user](user.md) collection                                    | List properties and relationships of a user object.                                 |
| [Create user](../api/user-create.md)                                    | [user](user.md)                                               | Create a new user object.                                                           |
| [Get user](../api/user-get.md)                                          | [user](user.md)                                               | Read properties and relationships of a user object.                                 |
| [Update user](../api/user-update.md)                                    | [user](user.md)                                               | Update the properties of a user object.                                             |
| [Delete user](../api/user-delete.md)                                    |                                                               | Delete a user object.                                                               |
| [assignLicense](../api/user-assignLicense.md)                           | [user](../resources/-user.md)                                 |                                                                                     |
| [changePassword](../api/user-changePassword.md)                         |                                                               |                                                                                     |
| [checkMemberGroups](../api/user-checkMemberGroups.md)                   |                                                               |                                                                                     |
| [checkMemberObjects](../api/user-checkMemberObjects.md)                 |                                                               |                                                                                     |
| [getByIds](../api/user-getByIds.md)                                     |                                                               |                                                                                     |
| [getMemberGroups](../api/user-getMemberGroups.md)                       |                                                               |                                                                                     |
| [getMemberObjects](../api/user-getMemberObjects.md)                     |                                                               |                                                                                     |
| [getUserOwnedObjects](../api/user-getUserOwnedObjects.md)               | [directoryObject](../resources/-directoryobject.md)           |                                                                                     |
| [invalidateAllRefreshTokens](../api/user-invalidateAllRefreshTokens.md) | Boolean                                                       |                                                                                     |
| [reprocessLicenseAssignment](../api/user-reprocessLicenseAssignment.md) | [user](../resources/-user.md)                                 |                                                                                     |
| [restore](../api/user-restore.md)                                       | [directoryObject](../resources/-directoryobject.md)           |                                                                                     |
| [revokeSignInSessions](../api/user-revokeSignInSessions.md)             | Boolean                                                       |                                                                                     |
| [validateProperties](../api/user-validateProperties.md)                 |                                                               |                                                                                     |
| [delta](../api/user-delta.md)                                           |                                                               |                                                                                     |
| [linkCount](../api/user-linkCount.md)                                   | Int64                                                         |                                                                                     |
| [List appRoleAssignments](../api/user-list-approleassignments.md)       | [appRoleAssignment](../resources/-approleassignment.md)       | Get the appRoleAssignment objects from an appRoleAssignments navigation property.   |
| [Create appRoleAssignments](../api/user-post-approleassignments.md)     | [appRoleAssignment](../resources/-approleassignment.md)       | Create a new appRoleAssignment object.                                              |
| [Get appRoleAssignments](../api/user-get-approleassignments.md)         | [appRoleAssignment](../resources/-approleassignment.md)       | Read the properties and relationships of an appRoleAssignment object.               |
| [Update appRoleAssignments](../api/user-update-approleassignments.md)   | [appRoleAssignment](../resources/-approleassignment.md)       | Update the properties of an appRoleAssignment object.                               |
| [Delete appRoleAssignments](../api/user-delete-approleassignments.md)   |                                                               | Delete an appRoleAssignment object.                                                 |
| [List createdObjects](../api/user-list-createdobjects.md)               | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a createdObjects navigation property.          |
| [Add createdObjects](../api/user-post-createdobjects.md)                | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get createdObjects](../api/user-get-createdobjects.md)                 | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update createdObjects](../api/user-update-createdobjects.md)           | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove createdObjects](../api/user-delete-createdobjects.md)           |                                                               | Remove a directoryObject object.                                                    |
| [List directReports](../api/user-list-directreports.md)                 | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a directReports navigation property.           |
| [Add directReports](../api/user-post-directreports.md)                  | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get directReports](../api/user-get-directreports.md)                   | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update directReports](../api/user-update-directreports.md)             | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove directReports](../api/user-delete-directreports.md)             |                                                               | Remove a directoryObject object.                                                    |
| [List licenseDetails](../api/user-list-licensedetails.md)               | [licenseDetails](../resources/-licensedetails.md)             | Get the licenseDetails objects from a licenseDetails navigation property.           |
| [Create licenseDetails](../api/user-post-licensedetails.md)             | [licenseDetails](../resources/-licensedetails.md)             | Create a new licenseDetails object.                                                 |
| [Get licenseDetails](../api/user-get-licensedetails.md)                 | [licenseDetails](../resources/-licensedetails.md)             | Read the properties and relationships of a licenseDetails object.                   |
| [Update licenseDetails](../api/user-update-licensedetails.md)           | [licenseDetails](../resources/-licensedetails.md)             | Update the properties of a licenseDetails object.                                   |
| [Delete licenseDetails](../api/user-delete-licensedetails.md)           |                                                               | Delete a licenseDetails object.                                                     |
| [List manager](../api/user-list-manager.md)                             | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a manager navigation property.                 |
| [Add manager](../api/user-post-manager.md)                              | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get manager](../api/user-get-manager.md)                               | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update manager](../api/user-update-manager.md)                         | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove manager](../api/user-delete-manager.md)                         |                                                               | Remove a directoryObject object.                                                    |
| [List memberOf](../api/user-list-memberof.md)                           | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a memberOf navigation property.                |
| [Add memberOf](../api/user-post-memberof.md)                            | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get memberOf](../api/user-get-memberof.md)                             | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update memberOf](../api/user-update-memberof.md)                       | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove memberOf](../api/user-delete-memberof.md)                       |                                                               | Remove a directoryObject object.                                                    |
| [List ownedDevices](../api/user-list-owneddevices.md)                   | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from an ownedDevices navigation property.           |
| [Add ownedDevices](../api/user-post-owneddevices.md)                    | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get ownedDevices](../api/user-get-owneddevices.md)                     | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update ownedDevices](../api/user-update-owneddevices.md)               | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove ownedDevices](../api/user-delete-owneddevices.md)               |                                                               | Remove a directoryObject object.                                                    |
| [List ownedObjects](../api/user-list-ownedobjects.md)                   | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from an ownedObjects navigation property.           |
| [Add ownedObjects](../api/user-post-ownedobjects.md)                    | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get ownedObjects](../api/user-get-ownedobjects.md)                     | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update ownedObjects](../api/user-update-ownedobjects.md)               | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove ownedObjects](../api/user-delete-ownedobjects.md)               |                                                               | Remove a directoryObject object.                                                    |
| [List registeredDevices](../api/user-list-registereddevices.md)         | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a registeredDevices navigation property.       |
| [Add registeredDevices](../api/user-post-registereddevices.md)          | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get registeredDevices](../api/user-get-registereddevices.md)           | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update registeredDevices](../api/user-update-registereddevices.md)     | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove registeredDevices](../api/user-delete-registereddevices.md)     |                                                               | Remove a directoryObject object.                                                    |
| [List scopedRoleMemberOf](../api/user-list-scopedrolememberof.md)       | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Get the scopedRoleMembership objects from a scopedRoleMemberOf navigation property. |
| [Create scopedRoleMemberOf](../api/user-post-scopedrolememberof.md)     | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Create a new scopedRoleMembership object.                                           |
| [Get scopedRoleMemberOf](../api/user-get-scopedrolememberof.md)         | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Read the properties and relationships of a scopedRoleMembership object.             |
| [Update scopedRoleMemberOf](../api/user-update-scopedrolememberof.md)   | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Update the properties of a scopedRoleMembership object.                             |
| [Delete scopedRoleMemberOf](../api/user-delete-scopedrolememberof.md)   |                                                               | Delete a scopedRoleMembership object.                                               |
| [List transitiveMemberOf](../api/user-list-transitivememberof.md)       | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a transitiveMemberOf navigation property.      |
| [Add transitiveMemberOf](../api/user-post-transitivememberof.md)        | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                   |
| [Get transitiveMemberOf](../api/user-get-transitivememberof.md)         | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                  |
| [Update transitiveMemberOf](../api/user-update-transitivememberof.md)   | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                  |
| [Remove transitiveMemberOf](../api/user-delete-transitivememberof.md)   |                                                               | Remove a directoryObject object.                                                    |

## Properties

| Property                        | Type                                                                                  | Description |
| :------------------------------ | :------------------------------------------------------------------------------------ | :---------- |
| accountEnabled                  | Boolean                                                                               |             |
| ageGroup                        | String                                                                                |             |
| assignedLicenses                | [assignedLicense](../resources/assignedlicense.md) collection                         |             |
| assignedPlans                   | [assignedPlan](../resources/assignedplan.md) collection                               |             |
| businessPhones                  | String collection                                                                     |             |
| city                            | String                                                                                |             |
| companyName                     | String                                                                                |             |
| consentProvidedForMinor         | String                                                                                |             |
| country                         | String                                                                                |             |
| createdDateTime                 | DateTimeOffset                                                                        |             |
| creationType                    | String                                                                                |             |
| deletedDateTime                 | DateTimeOffset                                                                        |             |
| department                      | String                                                                                |             |
| deviceKeys                      | [deviceKey](../resources/devicekey.md) collection                                     |             |
| displayName                     | String                                                                                |             |
| employeeHireDate                | DateTimeOffset                                                                        |             |
| employeeId                      | String                                                                                |             |
| employeeOrgData                 | [employeeOrgData](../resources/employeeorgdata.md)                                    |             |
| employeeType                    | String                                                                                |             |
| externalUserState               | String                                                                                |             |
| externalUserStateChangeDateTime | String                                                                                |             |
| faxNumber                       | String                                                                                |             |
| givenName                       | String                                                                                |             |
| id                              | String                                                                                | Read-only.  |
| identities                      | [objectIdentity](../resources/objectidentity.md) collection                           |             |
| imAddresses                     | String collection                                                                     |             |
| infoCatalogs                    | String collection                                                                     |             |
| isResourceAccount               | Boolean                                                                               |             |
| jobTitle                        | String                                                                                |             |
| lastPasswordChangeDateTime      | DateTimeOffset                                                                        |             |
| legalAgeGroupClassification     | String                                                                                |             |
| licenseAssignmentStates         | [licenseAssignmentState](../resources/licenseassignmentstate.md) collection           |             |
| mail                            | String                                                                                |             |
| mailNickname                    | String                                                                                |             |
| mobilePhone                     | String                                                                                |             |
| officeLocation                  | String                                                                                |             |
| onPremisesDistinguishedName     | String                                                                                |             |
| onPremisesDomainName            | String                                                                                |             |
| onPremisesExtensionAttributes   | [onPremisesExtensionAttributes](../resources/onpremisesextensionattributes.md)        |             |
| onPremisesImmutableId           | String                                                                                |             |
| onPremisesLastSyncDateTime      | DateTimeOffset                                                                        |             |
| onPremisesProvisioningErrors    | [onPremisesProvisioningError](../resources/onpremisesprovisioningerror.md) collection |             |
| onPremisesSamAccountName        | String                                                                                |             |
| onPremisesSecurityIdentifier    | String                                                                                |             |
| onPremisesSyncEnabled           | Boolean                                                                               |             |
| onPremisesUserPrincipalName     | String                                                                                |             |
| otherMails                      | String collection                                                                     |             |
| passwordPolicies                | String                                                                                |             |
| passwordProfile                 | [passwordProfile](../resources/passwordprofile.md)                                    |             |
| postalCode                      | String                                                                                |             |
| preferredDataLocation           | String                                                                                |             |
| preferredLanguage               | String                                                                                |             |
| provisionedPlans                | [provisionedPlan](../resources/provisionedplan.md) collection                         |             |
| proxyAddresses                  | String collection                                                                     |             |
| refreshTokensValidFromDateTime  | DateTimeOffset                                                                        |             |
| showInAddressList               | Boolean                                                                               |             |
| signInSessionsValidFromDateTime | DateTimeOffset                                                                        |             |
| state                           | String                                                                                |             |
| streetAddress                   | String                                                                                |             |
| surname                         | String                                                                                |             |
| usageLocation                   | String                                                                                |             |
| userPrincipalName               | String                                                                                |             |
| userType                        | String                                                                                |             |

## Relationships

| Relationship       | Type                                                                    | Description |
| :----------------- | :---------------------------------------------------------------------- | :---------- |
| appRoleAssignments | [appRoleAssignment](../resources/approleassignment.md) collection       |             |
| createdObjects     | [directoryObject](../resources/directoryobject.md) collection           |             |
| directReports      | [directoryObject](../resources/directoryobject.md) collection           |             |
| licenseDetails     | [licenseDetails](../resources/licensedetails.md) collection             |             |
| manager            | [directoryObject](../resources/directoryobject.md)                      |             |
| memberOf           | [directoryObject](../resources/directoryobject.md) collection           |             |
| ownedDevices       | [directoryObject](../resources/directoryobject.md) collection           |             |
| ownedObjects       | [directoryObject](../resources/directoryobject.md) collection           |             |
| registeredDevices  | [directoryObject](../resources/directoryobject.md) collection           |             |
| scopedRoleMemberOf | [scopedRoleMembership](../resources/scopedrolemembership.md) collection |             |
| transitiveMemberOf | [directoryObject](../resources/directoryobject.md) collection           |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.user",
  "accountEnabled": "Boolean",
  "ageGroup": "String",
  "assignedLicenses": [{"@odata.type": "microsoft.graph.assignedLicense"}],
  "assignedPlans": [{"@odata.type": "microsoft.graph.assignedPlan"}],
  "businessPhones": ["String"],
  "city": "String",
  "companyName": "String",
  "consentProvidedForMinor": "String",
  "country": "String",
  "createdDateTime": "DateTimeOffset",
  "creationType": "String",
  "deletedDateTime": "DateTimeOffset",
  "department": "String",
  "deviceKeys": [{"@odata.type": "microsoft.graph.deviceKey"}],
  "displayName": "String",
  "employeeHireDate": "DateTimeOffset",
  "employeeId": "String",
  "employeeOrgData": {"@odata.type": "microsoft.graph.employeeOrgData"},
  "employeeType": "String",
  "externalUserState": "String",
  "externalUserStateChangeDateTime": "String",
  "faxNumber": "String",
  "givenName": "String",
  "id": "String (identifier)",
  "identities": [{"@odata.type": "microsoft.graph.objectIdentity"}],
  "imAddresses": ["String"],
  "infoCatalogs": ["String"],
  "isResourceAccount": "Boolean",
  "jobTitle": "String",
  "lastPasswordChangeDateTime": "DateTimeOffset",
  "legalAgeGroupClassification": "String",
  "licenseAssignmentStates": [{"@odata.type": "microsoft.graph.licenseAssignmentState"}],
  "mail": "String",
  "mailNickname": "String",
  "mobilePhone": "String",
  "officeLocation": "String",
  "onPremisesDistinguishedName": "String",
  "onPremisesDomainName": "String",
  "onPremisesExtensionAttributes": {"@odata.type": "microsoft.graph.onPremisesExtensionAttributes"},
  "onPremisesImmutableId": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesProvisioningErrors": [{"@odata.type": "microsoft.graph.onPremisesProvisioningError"}],
  "onPremisesSamAccountName": "String",
  "onPremisesSecurityIdentifier": "String",
  "onPremisesSyncEnabled": "Boolean",
  "onPremisesUserPrincipalName": "String",
  "otherMails": ["String"],
  "passwordPolicies": "String",
  "passwordProfile": {"@odata.type": "microsoft.graph.passwordProfile"},
  "postalCode": "String",
  "preferredDataLocation": "String",
  "preferredLanguage": "String",
  "provisionedPlans": [{"@odata.type": "microsoft.graph.provisionedPlan"}],
  "proxyAddresses": ["String"],
  "refreshTokensValidFromDateTime": "DateTimeOffset",
  "showInAddressList": "Boolean",
  "signInSessionsValidFromDateTime": "DateTimeOffset",
  "state": "String",
  "streetAddress": "String",
  "surname": "String",
  "usageLocation": "String",
  "userPrincipalName": "String",
  "userType": "String"
}
```
