---
title: "Update householdUser"
description: "Update the properties of a householdUser object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update householdUser
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [householdUser](../resources/householduser.md) object.

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
PATCH /householdUser
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [householdUser](../resources/householduser.md) object.

The following table shows the properties that are required when you update the [householdUser](../resources/householduser.md).

|Property|Type|Description|
|:---|:---|:---|
|netId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [householdUser](../resources/householduser.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_householduser"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/householdUser
Content-Type: application/json
Content-length: 155

{
  "@odata.type": "#microsoft.graph.householdUser",
  "netId": "String",
  "displayName": "String",
  "givenName": "String",
  "surname": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.householdUser",
  "netId": "String",
  "displayName": "String",
  "givenName": "String",
  "surname": "String"
}
```

