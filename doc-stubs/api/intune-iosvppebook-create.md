---
title: "Create iosVppEBook"
description: "Create a new iosVppEBook object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosVppEBook
Namespace: microsoft.graph

Create a new [iosVppEBook](../resources/intune-iosvppebook.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.graph.iosVppEBook not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVppEBook](../resources/intune-iosvppebook.md) object.

The following table shows the properties that are required when you create the [iosVppEBook](../resources/intune-iosvppebook.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|description|String|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|publisher|String|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|publishedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|largeCover|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|informationUrl|String|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|privacyInformationUrl|String|**TODO: Add Description** Inherited from [managedEBook](../resources/intune-managedebook.md)|
|vppTokenId|Guid|**TODO: Add Description**|
|appleId|String|**TODO: Add Description**|
|vppOrganizationName|String|**TODO: Add Description**|
|genres|String collection|**TODO: Add Description**|
|language|String|**TODO: Add Description**|
|seller|String|**TODO: Add Description**|
|totalLicenseCount|Int32|**TODO: Add Description**|
|usedLicenseCount|Int32|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [iosVppEBook](../resources/intune-iosvppebook.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosvppebook_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.iosVppEBook not found
Content-Type: application/json
Content-length: 606

{
  "@odata.type": "#microsoft.graph.iosVppEBook",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "publishedDateTime": "String (timestamp)",
  "largeCover": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "informationUrl": "String",
  "privacyInformationUrl": "String",
  "vppTokenId": "Guid",
  "appleId": "String",
  "vppOrganizationName": "String",
  "genres": [
    "String"
  ],
  "language": "String",
  "seller": "String",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosVppEBook"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.iosVppEBook",
  "id": "caaa89e0-89e0-caaa-e089-aacae089aaca",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "publishedDateTime": "String (timestamp)",
  "largeCover": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "informationUrl": "String",
  "privacyInformationUrl": "String",
  "vppTokenId": "Guid",
  "appleId": "String",
  "vppOrganizationName": "String",
  "genres": [
    "String"
  ],
  "language": "String",
  "seller": "String",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "roleScopeTagIds": [
    "String"
  ]
}
```

