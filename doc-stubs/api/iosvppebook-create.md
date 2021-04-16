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



Create a new [iosVppEBook](../resources/iosvppebook.md) object.

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
POST ** Collection URI for microsoft.graph.iosVppEBook not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVppEBook](../resources/iosvppebook.md) object.

The following table shows the properties that are required when you create the [iosVppEBook](../resources/iosvppebook.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time when the eBook file was created. Inherited from [managedEBook](../resources/managedebook.md)|
|description|String|Description. Inherited from [managedEBook](../resources/managedebook.md)|
|displayName|String|Name of the eBook. Inherited from [managedEBook](../resources/managedebook.md)|
|informationUrl|String|The more information Url. Inherited from [managedEBook](../resources/managedebook.md)|
|largeCover|[mimeContent](../resources/mimecontent.md)|Book cover. Inherited from [managedEBook](../resources/managedebook.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time when the eBook was last modified. Inherited from [managedEBook](../resources/managedebook.md)|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [managedEBook](../resources/managedebook.md)|
|publishedDateTime|DateTimeOffset|The date and time when the eBook was published. Inherited from [managedEBook](../resources/managedebook.md)|
|publisher|String|Publisher. Inherited from [managedEBook](../resources/managedebook.md)|
|appleId|String|The Apple ID associated with Vpp token.|
|genres|String collection|Genres.|
|language|String|Language.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|seller|String|Seller.|
|totalLicenseCount|Int32|Total license count.|
|usedLicenseCount|Int32|Used license count.|
|vppOrganizationName|String|The Vpp token's organization name.|
|vppTokenId|Guid|The Vpp token ID.|



## Response

If successful, this method returns a `201 Created` response code and an [iosVppEBook](../resources/iosvppebook.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosvppebook_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosVppEBook not found
Content-Type: application/json
Content-length: 606

{
  "@odata.type": "#microsoft.graph.iosVppEBook",
  "description": "String",
  "displayName": "String",
  "informationUrl": "String",
  "largeCover": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "privacyInformationUrl": "String",
  "publishedDateTime": "String (timestamp)",
  "publisher": "String",
  "appleId": "String",
  "genres": [
    "String"
  ],
  "language": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "seller": "String",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "vppOrganizationName": "String",
  "vppTokenId": "Guid"
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
  "id": "360fc3ab-c3ab-360f-abc3-0f36abc30f36",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "informationUrl": "String",
  "largeCover": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "privacyInformationUrl": "String",
  "publishedDateTime": "String (timestamp)",
  "publisher": "String",
  "appleId": "String",
  "genres": [
    "String"
  ],
  "language": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "seller": "String",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "vppOrganizationName": "String",
  "vppTokenId": "Guid"
}
```

