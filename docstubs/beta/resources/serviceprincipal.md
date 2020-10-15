---
title: "servicePrincipal resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# servicePrincipal resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                                            | Return Type                                                                             | Description                                                                                                      |
| :---------------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------- |
| [List servicePrincipal](../api/serviceprincipal-list.md)                                                          | [servicePrincipal](servicePrincipal.md) collection                                      | List properties and relationships of a servicePrincipal object.                                                  |
| [Create servicePrincipal](../api/serviceprincipal-create.md)                                                      | [servicePrincipal](servicePrincipal.md)                                                 | Create a new servicePrincipal object.                                                                            |
| [Get servicePrincipal](../api/serviceprincipal-get.md)                                                            | [servicePrincipal](servicePrincipal.md)                                                 | Read properties and relationships of a servicePrincipal object.                                                  |
| [Update servicePrincipal](../api/serviceprincipal-update.md)                                                      | [servicePrincipal](servicePrincipal.md)                                                 | Update the properties of a servicePrincipal object.                                                              |
| [Delete servicePrincipal](../api/serviceprincipal-delete.md)                                                      |                                                                                         | Delete a servicePrincipal object.                                                                                |
| [checkMemberGroups](../api/serviceprincipal-checkMemberGroups.md)                                                 |                                                                                         |                                                                                                                  |
| [checkMemberObjects](../api/serviceprincipal-checkMemberObjects.md)                                               |                                                                                         |                                                                                                                  |
| [getByIds](../api/serviceprincipal-getByIds.md)                                                                   |                                                                                         |                                                                                                                  |
| [getMemberGroups](../api/serviceprincipal-getMemberGroups.md)                                                     |                                                                                         |                                                                                                                  |
| [getMemberObjects](../api/serviceprincipal-getMemberObjects.md)                                                   |                                                                                         |                                                                                                                  |
| [getUserOwnedObjects](../api/serviceprincipal-getUserOwnedObjects.md)                                             | [directoryObject](../resources/-directoryobject.md)                                     |                                                                                                                  |
| [restore](../api/serviceprincipal-restore.md)                                                                     | [directoryObject](../resources/-directoryobject.md)                                     |                                                                                                                  |
| [validateProperties](../api/serviceprincipal-validateProperties.md)                                               |                                                                                         |                                                                                                                  |
| [delta](../api/serviceprincipal-delta.md)                                                                         |                                                                                         |                                                                                                                  |
| [List appRoleAssignedTo](../api/serviceprincipal-list-approleassignedto.md)                                       | [appRoleAssignment](../resources/-approleassignment.md)                                 | Get the appRoleAssignment objects from an appRoleAssignedTo navigation property.                                 |
| [Create appRoleAssignedTo](../api/serviceprincipal-post-approleassignedto.md)                                     | [appRoleAssignment](../resources/-approleassignment.md)                                 | Create a new appRoleAssignment object.                                                                           |
| [Get appRoleAssignedTo](../api/serviceprincipal-get-approleassignedto.md)                                         | [appRoleAssignment](../resources/-approleassignment.md)                                 | Read the properties and relationships of an appRoleAssignment object.                                            |
| [Update appRoleAssignedTo](../api/serviceprincipal-update-approleassignedto.md)                                   | [appRoleAssignment](../resources/-approleassignment.md)                                 | Update the properties of an appRoleAssignment object.                                                            |
| [Delete appRoleAssignedTo](../api/serviceprincipal-delete-approleassignedto.md)                                   |                                                                                         | Delete an appRoleAssignment object.                                                                              |
| [List appRoleAssignments](../api/serviceprincipal-list-approleassignments.md)                                     | [appRoleAssignment](../resources/-approleassignment.md)                                 | Get the appRoleAssignment objects from an appRoleAssignments navigation property.                                |
| [Create appRoleAssignments](../api/serviceprincipal-post-approleassignments.md)                                   | [appRoleAssignment](../resources/-approleassignment.md)                                 | Create a new appRoleAssignment object.                                                                           |
| [Get appRoleAssignments](../api/serviceprincipal-get-approleassignments.md)                                       | [appRoleAssignment](../resources/-approleassignment.md)                                 | Read the properties and relationships of an appRoleAssignment object.                                            |
| [Update appRoleAssignments](../api/serviceprincipal-update-approleassignments.md)                                 | [appRoleAssignment](../resources/-approleassignment.md)                                 | Update the properties of an appRoleAssignment object.                                                            |
| [Delete appRoleAssignments](../api/serviceprincipal-delete-approleassignments.md)                                 |                                                                                         | Delete an appRoleAssignment object.                                                                              |
| [List claimsMappingPolicies](../api/serviceprincipal-list-claimsmappingpolicies.md)                               | [claimsMappingPolicy](../resources/-claimsmappingpolicy.md)                             | Get the claimsMappingPolicy objects from a claimsMappingPolicies navigation property.                            |
| [Add claimsMappingPolicies](../api/serviceprincipal-post-claimsmappingpolicies.md)                                | [claimsMappingPolicy](../resources/-claimsmappingpolicy.md)                             | Add claimsMappingPolicy by posting to the claimsMappingPolicy collection.                                        |
| [Get claimsMappingPolicies](../api/serviceprincipal-get-claimsmappingpolicies.md)                                 | [claimsMappingPolicy](../resources/-claimsmappingpolicy.md)                             | Read the properties and relationships of a claimsMappingPolicy object.                                           |
| [Update claimsMappingPolicies](../api/serviceprincipal-update-claimsmappingpolicies.md)                           | [claimsMappingPolicy](../resources/-claimsmappingpolicy.md)                             | Update the properties of a claimsMappingPolicy object.                                                           |
| [Remove claimsMappingPolicies](../api/serviceprincipal-delete-claimsmappingpolicies.md)                           |                                                                                         | Remove a claimsMappingPolicy object.                                                                             |
| [List createdObjects](../api/serviceprincipal-list-createdobjects.md)                                             | [directoryObject](../resources/-directoryobject.md)                                     | Get the directoryObject objects from a createdObjects navigation property.                                       |
| [Add createdObjects](../api/serviceprincipal-post-createdobjects.md)                                              | [directoryObject](../resources/-directoryobject.md)                                     | Add directoryObject by posting to the directoryObject collection.                                                |
| [Get createdObjects](../api/serviceprincipal-get-createdobjects.md)                                               | [directoryObject](../resources/-directoryobject.md)                                     | Read the properties and relationships of a directoryObject object.                                               |
| [Update createdObjects](../api/serviceprincipal-update-createdobjects.md)                                         | [directoryObject](../resources/-directoryobject.md)                                     | Update the properties of a directoryObject object.                                                               |
| [Remove createdObjects](../api/serviceprincipal-delete-createdobjects.md)                                         |                                                                                         | Remove a directoryObject object.                                                                                 |
| [List delegatedPermissionClassifications](../api/serviceprincipal-list-delegatedpermissionclassifications.md)     | [delegatedPermissionClassification](../resources/-delegatedpermissionclassification.md) | Get the delegatedPermissionClassification objects from a delegatedPermissionClassifications navigation property. |
| [Create delegatedPermissionClassifications](../api/serviceprincipal-post-delegatedpermissionclassifications.md)   | [delegatedPermissionClassification](../resources/-delegatedpermissionclassification.md) | Create a new delegatedPermissionClassification object.                                                           |
| [Get delegatedPermissionClassifications](../api/serviceprincipal-get-delegatedpermissionclassifications.md)       | [delegatedPermissionClassification](../resources/-delegatedpermissionclassification.md) | Read the properties and relationships of a delegatedPermissionClassification object.                             |
| [Update delegatedPermissionClassifications](../api/serviceprincipal-update-delegatedpermissionclassifications.md) | [delegatedPermissionClassification](../resources/-delegatedpermissionclassification.md) | Update the properties of a delegatedPermissionClassification object.                                             |
| [Delete delegatedPermissionClassifications](../api/serviceprincipal-delete-delegatedpermissionclassifications.md) |                                                                                         | Delete a delegatedPermissionClassification object.                                                               |
| [List endpoints](../api/serviceprincipal-list-endpoints.md)                                                       | [endpoint](../resources/-endpoint.md)                                                   | Get the endpoint objects from an endpoints navigation property.                                                  |
| [Create endpoints](../api/serviceprincipal-post-endpoints.md)                                                     | [endpoint](../resources/-endpoint.md)                                                   | Create a new endpoint object.                                                                                    |
| [Get endpoints](../api/serviceprincipal-get-endpoints.md)                                                         | [endpoint](../resources/-endpoint.md)                                                   | Read the properties and relationships of an endpoint object.                                                     |
| [Update endpoints](../api/serviceprincipal-update-endpoints.md)                                                   | [endpoint](../resources/-endpoint.md)                                                   | Update the properties of an endpoint object.                                                                     |
| [Delete endpoints](../api/serviceprincipal-delete-endpoints.md)                                                   |                                                                                         | Delete an endpoint object.                                                                                       |
| [List homeRealmDiscoveryPolicies](../api/serviceprincipal-list-homerealmdiscoverypolicies.md)                     | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md)                   | Get the homeRealmDiscoveryPolicy objects from a homeRealmDiscoveryPolicies navigation property.                  |
| [Add homeRealmDiscoveryPolicies](../api/serviceprincipal-post-homerealmdiscoverypolicies.md)                      | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md)                   | Add homeRealmDiscoveryPolicy by posting to the homeRealmDiscoveryPolicy collection.                              |
| [Get homeRealmDiscoveryPolicies](../api/serviceprincipal-get-homerealmdiscoverypolicies.md)                       | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md)                   | Read the properties and relationships of a homeRealmDiscoveryPolicy object.                                      |
| [Update homeRealmDiscoveryPolicies](../api/serviceprincipal-update-homerealmdiscoverypolicies.md)                 | [homeRealmDiscoveryPolicy](../resources/-homerealmdiscoverypolicy.md)                   | Update the properties of a homeRealmDiscoveryPolicy object.                                                      |
| [Remove homeRealmDiscoveryPolicies](../api/serviceprincipal-delete-homerealmdiscoverypolicies.md)                 |                                                                                         | Remove a homeRealmDiscoveryPolicy object.                                                                        |
| [List licenseDetails](../api/serviceprincipal-list-licensedetails.md)                                             | [licenseDetails](../resources/-licensedetails.md)                                       | Get the licenseDetails objects from a licenseDetails navigation property.                                        |
| [Create licenseDetails](../api/serviceprincipal-post-licensedetails.md)                                           | [licenseDetails](../resources/-licensedetails.md)                                       | Create a new licenseDetails object.                                                                              |
| [Get licenseDetails](../api/serviceprincipal-get-licensedetails.md)                                               | [licenseDetails](../resources/-licensedetails.md)                                       | Read the properties and relationships of a licenseDetails object.                                                |
| [Update licenseDetails](../api/serviceprincipal-update-licensedetails.md)                                         | [licenseDetails](../resources/-licensedetails.md)                                       | Update the properties of a licenseDetails object.                                                                |
| [Delete licenseDetails](../api/serviceprincipal-delete-licensedetails.md)                                         |                                                                                         | Delete a licenseDetails object.                                                                                  |
| [List memberOf](../api/serviceprincipal-list-memberof.md)                                                         | [directoryObject](../resources/-directoryobject.md)                                     | Get the directoryObject objects from a memberOf navigation property.                                             |
| [Add memberOf](../api/serviceprincipal-post-memberof.md)                                                          | [directoryObject](../resources/-directoryobject.md)                                     | Add directoryObject by posting to the directoryObject collection.                                                |
| [Get memberOf](../api/serviceprincipal-get-memberof.md)                                                           | [directoryObject](../resources/-directoryobject.md)                                     | Read the properties and relationships of a directoryObject object.                                               |
| [Update memberOf](../api/serviceprincipal-update-memberof.md)                                                     | [directoryObject](../resources/-directoryobject.md)                                     | Update the properties of a directoryObject object.                                                               |
| [Remove memberOf](../api/serviceprincipal-delete-memberof.md)                                                     |                                                                                         | Remove a directoryObject object.                                                                                 |
| [List oauth2PermissionGrants](../api/serviceprincipal-list-oauth2permissiongrants.md)                             | [oAuth2PermissionGrant](../resources/-oauth2permissiongrant.md)                         | Get the oAuth2PermissionGrant objects from an oauth2PermissionGrants navigation property.                        |
| [Add oauth2PermissionGrants](../api/serviceprincipal-post-oauth2permissiongrants.md)                              | [oAuth2PermissionGrant](../resources/-oauth2permissiongrant.md)                         | Add oAuth2PermissionGrant by posting to the oAuth2PermissionGrant collection.                                    |
| [Get oauth2PermissionGrants](../api/serviceprincipal-get-oauth2permissiongrants.md)                               | [oAuth2PermissionGrant](../resources/-oauth2permissiongrant.md)                         | Read the properties and relationships of an oAuth2PermissionGrant object.                                        |
| [Update oauth2PermissionGrants](../api/serviceprincipal-update-oauth2permissiongrants.md)                         | [oAuth2PermissionGrant](../resources/-oauth2permissiongrant.md)                         | Update the properties of an oAuth2PermissionGrant object.                                                        |
| [Remove oauth2PermissionGrants](../api/serviceprincipal-delete-oauth2permissiongrants.md)                         |                                                                                         | Remove an oAuth2PermissionGrant object.                                                                          |
| [List ownedObjects](../api/serviceprincipal-list-ownedobjects.md)                                                 | [directoryObject](../resources/-directoryobject.md)                                     | Get the directoryObject objects from an ownedObjects navigation property.                                        |
| [Add ownedObjects](../api/serviceprincipal-post-ownedobjects.md)                                                  | [directoryObject](../resources/-directoryobject.md)                                     | Add directoryObject by posting to the directoryObject collection.                                                |
| [Get ownedObjects](../api/serviceprincipal-get-ownedobjects.md)                                                   | [directoryObject](../resources/-directoryobject.md)                                     | Read the properties and relationships of a directoryObject object.                                               |
| [Update ownedObjects](../api/serviceprincipal-update-ownedobjects.md)                                             | [directoryObject](../resources/-directoryobject.md)                                     | Update the properties of a directoryObject object.                                                               |
| [Remove ownedObjects](../api/serviceprincipal-delete-ownedobjects.md)                                             |                                                                                         | Remove a directoryObject object.                                                                                 |
| [List owners](../api/serviceprincipal-list-owners.md)                                                             | [directoryObject](../resources/-directoryobject.md)                                     | Get the directoryObject objects from an owners navigation property.                                              |
| [Add owners](../api/serviceprincipal-post-owners.md)                                                              | [directoryObject](../resources/-directoryobject.md)                                     | Add directoryObject by posting to the directoryObject collection.                                                |
| [Get owners](../api/serviceprincipal-get-owners.md)                                                               | [directoryObject](../resources/-directoryobject.md)                                     | Read the properties and relationships of a directoryObject object.                                               |
| [Update owners](../api/serviceprincipal-update-owners.md)                                                         | [directoryObject](../resources/-directoryobject.md)                                     | Update the properties of a directoryObject object.                                                               |
| [Remove owners](../api/serviceprincipal-delete-owners.md)                                                         |                                                                                         | Remove a directoryObject object.                                                                                 |
| [List policies](../api/serviceprincipal-list-policies.md)                                                         | [directoryObject](../resources/-directoryobject.md)                                     | Get the directoryObject objects from a policies navigation property.                                             |
| [Add policies](../api/serviceprincipal-post-policies.md)                                                          | [directoryObject](../resources/-directoryobject.md)                                     | Add directoryObject by posting to the directoryObject collection.                                                |
| [Get policies](../api/serviceprincipal-get-policies.md)                                                           | [directoryObject](../resources/-directoryobject.md)                                     | Read the properties and relationships of a directoryObject object.                                               |
| [Update policies](../api/serviceprincipal-update-policies.md)                                                     | [directoryObject](../resources/-directoryobject.md)                                     | Update the properties of a directoryObject object.                                                               |
| [Remove policies](../api/serviceprincipal-delete-policies.md)                                                     |                                                                                         | Remove a directoryObject object.                                                                                 |
| [List tokenIssuancePolicies](../api/serviceprincipal-list-tokenissuancepolicies.md)                               | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)                             | Get the tokenIssuancePolicy objects from a tokenIssuancePolicies navigation property.                            |
| [Add tokenIssuancePolicies](../api/serviceprincipal-post-tokenissuancepolicies.md)                                | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)                             | Add tokenIssuancePolicy by posting to the tokenIssuancePolicy collection.                                        |
| [Get tokenIssuancePolicies](../api/serviceprincipal-get-tokenissuancepolicies.md)                                 | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)                             | Read the properties and relationships of a tokenIssuancePolicy object.                                           |
| [Update tokenIssuancePolicies](../api/serviceprincipal-update-tokenissuancepolicies.md)                           | [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md)                             | Update the properties of a tokenIssuancePolicy object.                                                           |
| [Remove tokenIssuancePolicies](../api/serviceprincipal-delete-tokenissuancepolicies.md)                           |                                                                                         | Remove a tokenIssuancePolicy object.                                                                             |
| [List tokenLifetimePolicies](../api/serviceprincipal-list-tokenlifetimepolicies.md)                               | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)                             | Get the tokenLifetimePolicy objects from a tokenLifetimePolicies navigation property.                            |
| [Add tokenLifetimePolicies](../api/serviceprincipal-post-tokenlifetimepolicies.md)                                | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)                             | Add tokenLifetimePolicy by posting to the tokenLifetimePolicy collection.                                        |
| [Get tokenLifetimePolicies](../api/serviceprincipal-get-tokenlifetimepolicies.md)                                 | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)                             | Read the properties and relationships of a tokenLifetimePolicy object.                                           |
| [Update tokenLifetimePolicies](../api/serviceprincipal-update-tokenlifetimepolicies.md)                           | [tokenLifetimePolicy](../resources/-tokenlifetimepolicy.md)                             | Update the properties of a tokenLifetimePolicy object.                                                           |
| [Remove tokenLifetimePolicies](../api/serviceprincipal-delete-tokenlifetimepolicies.md)                           |                                                                                         | Remove a tokenLifetimePolicy object.                                                                             |
| [List transitiveMemberOf](../api/serviceprincipal-list-transitivememberof.md)                                     | [directoryObject](../resources/-directoryobject.md)                                     | Get the directoryObject objects from a transitiveMemberOf navigation property.                                   |
| [Add transitiveMemberOf](../api/serviceprincipal-post-transitivememberof.md)                                      | [directoryObject](../resources/-directoryobject.md)                                     | Add directoryObject by posting to the directoryObject collection.                                                |
| [Get transitiveMemberOf](../api/serviceprincipal-get-transitivememberof.md)                                       | [directoryObject](../resources/-directoryobject.md)                                     | Read the properties and relationships of a directoryObject object.                                               |
| [Update transitiveMemberOf](../api/serviceprincipal-update-transitivememberof.md)                                 | [directoryObject](../resources/-directoryobject.md)                                     | Update the properties of a directoryObject object.                                                               |
| [Remove transitiveMemberOf](../api/serviceprincipal-delete-transitivememberof.md)                                 |                                                                                         | Remove a directoryObject object.                                                                                 |

## Properties

| Property                            | Type                                                                 | Description |
| :---------------------------------- | :------------------------------------------------------------------- | :---------- |
| accountEnabled                      | Boolean                                                              |             |
| addIns                              | [addIn](../resources/addin.md) collection                            |             |
| alternativeNames                    | String collection                                                    |             |
| api                                 | [apiServicePrincipal](../resources/apiserviceprincipal.md)           |             |
| appDescription                      | String                                                               |             |
| appDisplayName                      | String                                                               |             |
| appId                               | String                                                               |             |
| appOwnerOrganizationId              | Guid                                                                 |             |
| appRoleAssignmentRequired           | Boolean                                                              |             |
| appRoles                            | [appRole](../resources/approle.md) collection                        |             |
| applicationTemplateId               | String                                                               |             |
| deletedDateTime                     | DateTimeOffset                                                       |             |
| description                         | String                                                               |             |
| displayName                         | String                                                               |             |
| errorUrl                            | String                                                               |             |
| hasPermissionClassifications        | Boolean                                                              |             |
| homepage                            | String                                                               |             |
| id                                  | String                                                               | Read-only.  |
| info                                | [informationalUrl](../resources/informationalurl.md)                 |             |
| keyCredentials                      | [keyCredential](../resources/keycredential.md) collection            |             |
| loginUrl                            | String                                                               |             |
| logoutUrl                           | String                                                               |             |
| notes                               | String                                                               |             |
| notificationEmailAddresses          | String collection                                                    |             |
| passwordCredentials                 | [passwordCredential](../resources/passwordcredential.md) collection  |             |
| preferredSingleSignOnMode           | String                                                               |             |
| preferredTokenSigningKeyEndDateTime | DateTimeOffset                                                       |             |
| preferredTokenSigningKeyThumbprint  | String                                                               |             |
| publishedPermissionScopes           | [permissionScope](../resources/permissionscope.md) collection        |             |
| publisherName                       | String                                                               |             |
| replyUrls                           | String collection                                                    |             |
| samlMetadataUrl                     | String                                                               |             |
| samlSingleSignOnSettings            | [samlSingleSignOnSettings](../resources/samlsinglesignonsettings.md) |             |
| servicePrincipalNames               | String collection                                                    |             |
| servicePrincipalType                | String                                                               |             |
| signInAudience                      | String                                                               |             |
| tags                                | String collection                                                    |             |
| tokenEncryptionKeyId                | Guid                                                                 |             |

## Relationships

| Relationship                       | Type                                                                                              | Description |
| :--------------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| appRoleAssignedTo                  | [appRoleAssignment](../resources/approleassignment.md) collection                                 |             |
| appRoleAssignments                 | [appRoleAssignment](../resources/approleassignment.md) collection                                 |             |
| claimsMappingPolicies              | [claimsMappingPolicy](../resources/claimsmappingpolicy.md) collection                             |             |
| createdObjects                     | [directoryObject](../resources/directoryobject.md) collection                                     |             |
| delegatedPermissionClassifications | [delegatedPermissionClassification](../resources/delegatedpermissionclassification.md) collection |             |
| endpoints                          | [endpoint](../resources/endpoint.md) collection                                                   |             |
| homeRealmDiscoveryPolicies         | [homeRealmDiscoveryPolicy](../resources/homerealmdiscoverypolicy.md) collection                   |             |
| licenseDetails                     | [licenseDetails](../resources/licensedetails.md) collection                                       |             |
| memberOf                           | [directoryObject](../resources/directoryobject.md) collection                                     |             |
| oauth2PermissionGrants             | [oAuth2PermissionGrant](../resources/oauth2permissiongrant.md) collection                         |             |
| ownedObjects                       | [directoryObject](../resources/directoryobject.md) collection                                     |             |
| owners                             | [directoryObject](../resources/directoryobject.md) collection                                     |             |
| policies                           | [directoryObject](../resources/directoryobject.md) collection                                     |             |
| tokenIssuancePolicies              | [tokenIssuancePolicy](../resources/tokenissuancepolicy.md) collection                             |             |
| tokenLifetimePolicies              | [tokenLifetimePolicy](../resources/tokenlifetimepolicy.md) collection                             |             |
| transitiveMemberOf                 | [directoryObject](../resources/directoryobject.md) collection                                     |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.servicePrincipal",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.servicePrincipal",
  "accountEnabled": "Boolean",
  "addIns": [{"@odata.type": "microsoft.graph.addIn"}],
  "alternativeNames": ["String"],
  "api": {"@odata.type": "microsoft.graph.apiServicePrincipal"},
  "appDescription": "String",
  "appDisplayName": "String",
  "appId": "String",
  "appOwnerOrganizationId": "Guid",
  "appRoleAssignmentRequired": "Boolean",
  "appRoles": [{"@odata.type": "microsoft.graph.appRole"}],
  "applicationTemplateId": "String",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "errorUrl": "String",
  "hasPermissionClassifications": "Boolean",
  "homepage": "String",
  "id": "String (identifier)",
  "info": {"@odata.type": "microsoft.graph.informationalUrl"},
  "keyCredentials": [{"@odata.type": "microsoft.graph.keyCredential"}],
  "loginUrl": "String",
  "logoutUrl": "String",
  "notes": "String",
  "notificationEmailAddresses": ["String"],
  "passwordCredentials": [{"@odata.type": "microsoft.graph.passwordCredential"}],
  "preferredSingleSignOnMode": "String",
  "preferredTokenSigningKeyEndDateTime": "DateTimeOffset",
  "preferredTokenSigningKeyThumbprint": "String",
  "publishedPermissionScopes": [{"@odata.type": "microsoft.graph.permissionScope"}],
  "publisherName": "String",
  "replyUrls": ["String"],
  "samlMetadataUrl": "String",
  "samlSingleSignOnSettings": {"@odata.type": "microsoft.graph.samlSingleSignOnSettings"},
  "servicePrincipalNames": ["String"],
  "servicePrincipalType": "String",
  "signInAudience": "String",
  "tags": ["String"],
  "tokenEncryptionKeyId": "Guid"
}
```
