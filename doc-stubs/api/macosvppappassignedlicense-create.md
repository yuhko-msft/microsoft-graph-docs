---
title: "Create macOsVppAppAssignedLicense"
description: "Create a new macOsVppAppAssignedLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macOsVppAppAssignedLicense
Namespace: microsoft.graph



Create a new [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.

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
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.

The following table shows the properties that are required when you create the [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|The user email address.|
|userId|String|The user ID.|
|userName|String|The user name.|
|userPrincipalName|String|The user principal name.|



## Response

If successful, this method returns a `201 Created` response code and a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macosvppappassignedlicense_from_"
}
-->
``` http

```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOsVppAppAssignedLicense"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOsVppAppAssignedLicense",
  "id": "6c1022b9-22b9-6c10-b922-106cb922106c",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

