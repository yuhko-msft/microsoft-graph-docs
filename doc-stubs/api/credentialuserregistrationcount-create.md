---
title: "Create credentialUserRegistrationCount"
description: "Create a new credentialUserRegistrationCount object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create credentialUserRegistrationCount
Namespace: microsoft.graph



Create a new [credentialUserRegistrationCount](../resources/credentialuserregistrationcount.md) object.

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
POST ** Collection URI for microsoft.graph.credentialUserRegistrationCount not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [credentialUserRegistrationCount](../resources/credentialuserregistrationcount.md) object.

The following table shows the properties that are required when you create the [credentialUserRegistrationCount](../resources/credentialuserregistrationcount.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|totalUserCount|Int64|**TODO: Add Description**|
|userRegistrationCounts|[userRegistrationCount](../resources/userregistrationcount.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [credentialUserRegistrationCount](../resources/credentialuserregistrationcount.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_credentialuserregistrationcount_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.credentialUserRegistrationCount not found
Content-Type: application/json
Content-length: 218

{
  "@odata.type": "#microsoft.graph.credentialUserRegistrationCount",
  "totalUserCount": "Integer",
  "userRegistrationCounts": [
    {
      "@odata.type": "microsoft.graph.userRegistrationCount"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.credentialUserRegistrationCount"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.credentialUserRegistrationCount",
  "id": "532f19c7-19c7-532f-c719-2f53c7192f53",
  "totalUserCount": "Integer",
  "userRegistrationCounts": [
    {
      "@odata.type": "microsoft.graph.userRegistrationCount"
    }
  ]
}
```

