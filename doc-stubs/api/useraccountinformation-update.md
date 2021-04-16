---
title: "Update userAccountInformation"
description: "Update the properties of a userAccountInformation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userAccountInformation
Namespace: microsoft.graph



Update the properties of a [userAccountInformation](../resources/useraccountinformation.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /me/profile/account/{userAccountInformationId}
PATCH /users/{usersId}/profile/account/{userAccountInformationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userAccountInformation](../resources/useraccountinformation.md) object.

The following table shows the properties that are required when you update the [userAccountInformation](../resources/useraccountinformation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowedAudiences|allowedAudiences|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md). Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|isSearchable|Boolean|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|ageGroup|String|**TODO: Add Description**|
|countryCode|String|**TODO: Add Description**|
|preferredLanguageTag|[localeInfo](../resources/localeinfo.md)|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userAccountInformation](../resources/useraccountinformation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_useraccountinformation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/profile/account/{userAccountInformationId}
Content-Type: application/json
Content-length: 525

{
  "@odata.type": "#microsoft.graph.userAccountInformation",
  "allowedAudiences": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "inference": {
    "@odata.type": "microsoft.graph.inferenceData"
  },
  "isSearchable": "Boolean",
  "source": {
    "@odata.type": "microsoft.graph.personDataSources"
  },
  "ageGroup": "String",
  "countryCode": "String",
  "preferredLanguageTag": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userAccountInformation",
  "id": "93c9c8ff-c8ff-93c9-ffc8-c993ffc8c993",
  "allowedAudiences": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "inference": {
    "@odata.type": "microsoft.graph.inferenceData"
  },
  "isSearchable": "Boolean",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "source": {
    "@odata.type": "microsoft.graph.personDataSources"
  },
  "ageGroup": "String",
  "countryCode": "String",
  "preferredLanguageTag": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "userPrincipalName": "String"
}
```

