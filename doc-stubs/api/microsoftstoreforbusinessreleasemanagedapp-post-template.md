---
title: "Add microsoftStoreForBusinessReleaseManagedAppTemplate"
description: "Add template by posting to the template collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add microsoftStoreForBusinessReleaseManagedAppTemplate
Namespace: microsoft.graph

Add template by posting to the template collection.

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
POST ** Collection URI for microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate not found/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) object.

The following table shows the properties that are required when you create the [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|publisher|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|usedLicenseCount|Int32|**TODO: Add Description**|
|totalLicenseCount|Int32|**TODO: Add Description**|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsoftstoreforbusinessreleasemanagedapptemplate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate not found/$ref
Content-Type: application/json
Content-length: 317

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate",
  "id": "f9386632-6632-f938-3266-38f9326638f9",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  }
}
```

