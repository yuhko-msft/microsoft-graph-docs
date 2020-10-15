---
title: "application resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# application resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                       | Return Type                                                           | Description                                                                                     |
| :------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------- |
| [List application](../api/application-list.md)                                               | [application](application.md) collection                              | List properties and relationships of an application object.                                     |
| [Create application](../api/application-create.md)                                           | [application](application.md)                                         | Create a new application object.                                                                |
| [Get application](../api/application-get.md)                                                 | [application](application.md)                                         | Read properties and relationships of an application object.                                     |
| [Update application](../api/application-update.md)                                           | [application](application.md)                                         | Update the properties of an application object.                                                 |
| [Delete application](../api/application-delete.md)                                           |                                                                       | Delete an application object.                                                                   |
| [addKey](../api/application-addKey.md)                                                       | keyCredential                                                         |                                                                                                 |
| [addPassword](../api/application-addPassword.md)                                             | passwordCredential                                                    |                                                                                                 |
| [checkMemberGroups](../api/application-checkMemberGroups.md)                                 |                                                                       |                                                                                                 |
| [checkMemberObjects](../api/application-checkMemberObjects.md)                               |                                                                       |                                                                                                 |
| [getAvailableExtensionProperties](../api/application-getAvailableExtensionProperties.md)     |                                                                       |                                                                                                 |
| [getByIds](../api/application-getByIds.md)                                                   |                                                                       |                                                                                                 |
| [getMemberGroups](../api/application-getMemberGroups.md)                                     |                                                                       |                                                                                                 |
| [getMemberObjects](../api/application-getMemberObjects.md)                                   |                                                                       |                                                                                                 |
| [removeKey](../api/application-removeKey.md)                                                 |                                                                       |                                                                                                 |
| [removePassword](../api/application-removePassword.md)                                       |                                                                       |                                                                                                 |
| [restore](../api/application-restore.md)                                                     | [directoryObject](../resources/-directoryobject.md)                   |                                                                                                 |
| [validateProperties](../api/application-validateProperties.md)                               |                                                                       |                                                                                                 |
| [delta](../api/application-delta.md)                                                         |                                                                       |                                                                                                 |
| [List createdOnBehalfOf](../api/application-list-createdonbehalfof.md)                       | [directoryObject](../resources/-directoryobject.md)                   | Get the directoryObject objects from a createdOnBehalfOf navigation property.                   |
| [Add createdOnBehalfOf](../api/application-post-createdonbehalfof.md)                        | [directoryObject](../resources/-directoryobject.md)                   | Add directoryObject by posting to the directoryObject collection.                               |
| [Get createdOnBehalfOf](../api/application-get-createdonbehalfof.md)                         | [directoryObject](../resources/-directoryobject.md)                   | Read the properties and relationships of a directoryObject object.                              |
| [Update createdOnBehalfOf](../api/application-update-createdonbehalfof.md)                   | [directoryObject](../resources/-directoryobject.md)                   | Update the properties of a directoryObject object.                                              |
| [Remove createdOnBehalfOf](../api/application-delete-createdonbehalfof.md)                   |                                                                       | Remove a directoryObject object.                                                                |
| [List extensionProperties](../api/application-list-extensionproperties.md)                   | [extensionProperty](../resources/-extensionproperty.md)               | Get the extensionProperty objects from an extensionProperties navigation property.              |
| [Create extensionProperties](../api/application-post-extensionproperties.md)                 | [extensionProperty](../resources/-extensionproperty.md)               | Create a new extensionProperty object.                                                          |
| [Get extensionProperties](../api/application-get-extensionproperties.md)                     | [extensionProperty](../resources/-extensionproperty.md)               | Read the properties and relationships of an extensionProperty object.                           |
| [Update extensionProperties](../api/application-update-extensionproperties.md)               | [extensionProperty](../resources/-extensionproperty.md)               | Update the properties of an extensionProperty object.                                           |
| [Delete extensionProperties](../api/application-delete-extensionproperties.md)               |                                                                       | Delete an extensionProperty object.                                                             |
| [List homeRealmDiscoveryPolicies](../api/application-list-homerealmdiscoverypolicies.md)     | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md) | Get the homeRealmDiscoveryPolicy objects from a homeRealmDiscoveryPolicies navigation property. |
| [Add homeRealmDiscoveryPolicies](../api/application-post-homerealmdiscoverypolicies.md)      | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md) | Add homeRealmDiscoveryPolicy by posting to the homeRealmDiscoveryPolicy collection.             |
| [Get homeRealmDiscoveryPolicies](../api/application-get-homerealmdiscoverypolicies.md)       | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md) | Read the properties and relationships of a homeRealmDiscoveryPolicy object.                     |
| [Update homeRealmDiscoveryPolicies](../api/application-update-homerealmdiscoverypolicies.md) | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md) | Update the properties of a homeRealmDiscoveryPolicy object.                                     |
| [Remove homeRealmDiscoveryPolicies](../api/application-delete-homerealmdiscoverypolicies.md) |                                                                       | Remove a homeRealmDiscoveryPolicy object.                                                       |
| [List owners](../api/application-list-owners.md)                                             | [directoryObject](../resources/-directoryobject.md)                   | Get the directoryObject objects from an owners navigation property.                             |
| [Add owners](../api/application-post-owners.md)                                              | [directoryObject](../resources/-directoryobject.md)                   | Add directoryObject by posting to the directoryObject collection.                               |
| [Get owners](../api/application-get-owners.md)                                               | [directoryObject](../resources/-directoryobject.md)                   | Read the properties and relationships of a directoryObject object.                              |
| [Update owners](../api/application-update-owners.md)                                         | [directoryObject](../resources/-directoryobject.md)                   | Update the properties of a directoryObject object.                                              |
| [Remove owners](../api/application-delete-owners.md)                                         |                                                                       | Remove a directoryObject object.                                                                |
| [List tokenIssuancePolicies](../api/application-list-tokenissuancepolicies.md)               | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)           | Get the tokenIssuancePolicy objects from a tokenIssuancePolicies navigation property.           |
| [Add tokenIssuancePolicies](../api/application-post-tokenissuancepolicies.md)                | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)           | Add tokenIssuancePolicy by posting to the tokenIssuancePolicy collection.                       |
| [Get tokenIssuancePolicies](../api/application-get-tokenissuancepolicies.md)                 | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)           | Read the properties and relationships of a tokenIssuancePolicy object.                          |
| [Update tokenIssuancePolicies](../api/application-update-tokenissuancepolicies.md)           | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)           | Update the properties of a tokenIssuancePolicy object.                                          |
| [Remove tokenIssuancePolicies](../api/application-delete-tokenissuancepolicies.md)           |                                                                       | Remove a tokenIssuancePolicy object.                                                            |
| [List tokenLifetimePolicies](../api/application-list-tokenlifetimepolicies.md)               | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)           | Get the tokenLifetimePolicy objects from a tokenLifetimePolicies navigation property.           |
| [Add tokenLifetimePolicies](../api/application-post-tokenlifetimepolicies.md)                | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)           | Add tokenLifetimePolicy by posting to the tokenLifetimePolicy collection.                       |
| [Get tokenLifetimePolicies](../api/application-get-tokenlifetimepolicies.md)                 | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)           | Read the properties and relationships of a tokenLifetimePolicy object.                          |
| [Update tokenLifetimePolicies](../api/application-update-tokenlifetimepolicies.md)           | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)           | Update the properties of a tokenLifetimePolicy object.                                          |
| [Remove tokenLifetimePolicies](../api/application-delete-tokenlifetimepolicies.md)           |                                                                       | Remove a tokenLifetimePolicy object.                                                            |

## Properties

| Property                  | Type                                                                        | Description |
| :------------------------ | :-------------------------------------------------------------------------- | :---------- |
| addIns                    | [addIn](../resources/addin.md) collection                                   |             |
| api                       | [apiApplication](../resources/apiapplication.md)                            |             |
| appId                     | String                                                                      |             |
| appRoles                  | [appRole](../resources/approle.md) collection                               |             |
| applicationTemplateId     | String                                                                      |             |
| createdDateTime           | DateTimeOffset                                                              |             |
| deletedDateTime           | DateTimeOffset                                                              |             |
| description               | String                                                                      |             |
| displayName               | String                                                                      |             |
| groupMembershipClaims     | String                                                                      |             |
| id                        | String                                                                      | Read-only.  |
| identifierUris            | String collection                                                           |             |
| info                      | [informationalUrl](../resources/informationalurl.md)                        |             |
| isDeviceOnlyAuthSupported | Boolean                                                                     |             |
| isFallbackPublicClient    | Boolean                                                                     |             |
| keyCredentials            | [keyCredential](../resources/keycredential.md) collection                   |             |
| logo                      | Stream                                                                      |             |
| notes                     | String                                                                      |             |
| oauth2RequirePostResponse | Boolean                                                                     |             |
| optionalClaims            | [optionalClaims](../resources/optionalclaims.md)                            |             |
| parentalControlSettings   | [parentalControlSettings](../resources/parentalcontrolsettings.md)          |             |
| passwordCredentials       | [passwordCredential](../resources/passwordcredential.md) collection         |             |
| publicClient              | [publicClientApplication](../resources/publicclientapplication.md)          |             |
| publisherDomain           | String                                                                      |             |
| requiredResourceAccess    | [requiredResourceAccess](../resources/requiredresourceaccess.md) collection |             |
| signInAudience            | String                                                                      |             |
| tags                      | String collection                                                           |             |
| tokenEncryptionKeyId      | Guid                                                                        |             |
| web                       | [webApplication](../resources/webapplication.md)                            |             |

## Relationships

| Relationship               | Type                                                                            | Description |
| :------------------------- | :------------------------------------------------------------------------------ | :---------- |
| createdOnBehalfOf          | [directoryObject](../resources/directoryobject.md)                              |             |
| extensionProperties        | [extensionProperty](../resources/extensionproperty.md) collection               |             |
| homeRealmDiscoveryPolicies | [homeRealmDiscoveryPolicy](../resources/homerealmdiscoverypolicy.md) collection |             |
| owners                     | [directoryObject](../resources/directoryobject.md) collection                   |             |
| tokenIssuancePolicies      | [tokenIssuancePolicy](../resources/tokenissuancepolicy.md) collection           |             |
| tokenLifetimePolicies      | [tokenLifetimePolicy](../resources/tokenlifetimepolicy.md) collection           |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.application",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.application",
  "addIns": [{"@odata.type": "microsoft.graph.addIn"}],
  "api": {"@odata.type": "microsoft.graph.apiApplication"},
  "appId": "String",
  "appRoles": [{"@odata.type": "microsoft.graph.appRole"}],
  "applicationTemplateId": "String",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "groupMembershipClaims": "String",
  "id": "String (identifier)",
  "identifierUris": ["String"],
  "info": {"@odata.type": "microsoft.graph.informationalUrl"},
  "isDeviceOnlyAuthSupported": "Boolean",
  "isFallbackPublicClient": "Boolean",
  "keyCredentials": [{"@odata.type": "microsoft.graph.keyCredential"}],
  "logo": "Stream",
  "notes": "String",
  "oauth2RequirePostResponse": "Boolean",
  "optionalClaims": {"@odata.type": "microsoft.graph.optionalClaims"},
  "parentalControlSettings": {"@odata.type": "microsoft.graph.parentalControlSettings"},
  "passwordCredentials": [{"@odata.type": "microsoft.graph.passwordCredential"}],
  "publicClient": {"@odata.type": "microsoft.graph.publicClientApplication"},
  "publisherDomain": "String",
  "requiredResourceAccess": [{"@odata.type": "microsoft.graph.requiredResourceAccess"}],
  "signInAudience": "String",
  "tags": ["String"],
  "tokenEncryptionKeyId": "Guid",
  "web": {"@odata.type": "microsoft.graph.webApplication"}
}
```
