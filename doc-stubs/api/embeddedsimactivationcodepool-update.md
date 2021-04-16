---
title: "Update embeddedSIMActivationCodePool"
description: "Update the properties of an embeddedSIMActivationCodePool object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update embeddedSIMActivationCodePool
Namespace: microsoft.graph



Update the properties of an [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object.

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
PATCH /deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object.

The following table shows the properties that are required when you update the [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activationCodeCount|Int32|The total count of activation codes which belong to this pool.|
|activationCodes|[embeddedSIMActivationCode](../resources/embeddedsimactivationcode.md) collection|The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.|
|createdDateTime|DateTimeOffset|The time the embedded SIM activation code pool was created. Generated service side.|
|displayName|String|The admin defined name of the embedded SIM activation code pool.|
|modifiedDateTime|DateTimeOffset|The time the embedded SIM activation code pool was last modified. Updated service side.|



## Response

If successful, this method returns a `200 OK` response code and an updated [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_embeddedsimactivationcodepool"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}
Content-Type: application/json
Content-length: 246

{
  "@odata.type": "#microsoft.graph.embeddedSIMActivationCodePool",
  "activationCodeCount": "Integer",
  "activationCodes": [
    {
      "@odata.type": "microsoft.graph.embeddedSIMActivationCode"
    }
  ],
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.embeddedSIMActivationCodePool",
  "id": "b207da26-da26-b207-26da-07b226da07b2",
  "activationCodeCount": "Integer",
  "activationCodes": [
    {
      "@odata.type": "microsoft.graph.embeddedSIMActivationCode"
    }
  ],
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "modifiedDateTime": "String (timestamp)"
}
```

