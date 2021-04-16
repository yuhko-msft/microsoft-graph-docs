---
title: "Update sensitivityPolicySettings"
description: "Update the properties of a sensitivityPolicySettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sensitivityPolicySettings
Namespace: microsoft.graph



Update the properties of a [sensitivityPolicySettings](../resources/sensitivitypolicysettings.md) object.

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
PATCH /me/informationProtection/sensitivityPolicySettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sensitivityPolicySettings](../resources/sensitivitypolicysettings.md) object.

The following table shows the properties that are required when you update the [sensitivityPolicySettings](../resources/sensitivitypolicysettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicableTo|sensitivityLabelTarget|**TODO: Add Description**. Possible values are: `email`, `site`, `unifiedGroup`, `unknownFutureValue`.|
|downgradeSensitivityRequiresJustification|Boolean|**TODO: Add Description**|
|helpWebUrl|String|**TODO: Add Description**|
|isMandatory|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [sensitivityPolicySettings](../resources/sensitivitypolicysettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sensitivitypolicysettings"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/informationProtection/sensitivityPolicySettings
Content-Type: application/json
Content-length: 211

{
  "@odata.type": "#microsoft.graph.sensitivityPolicySettings",
  "applicableTo": "String",
  "downgradeSensitivityRequiresJustification": "Boolean",
  "helpWebUrl": "String",
  "isMandatory": "Boolean"
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
  "@odata.type": "#microsoft.graph.sensitivityPolicySettings",
  "id": "ea70d6f8-d6f8-ea70-f8d6-70eaf8d670ea",
  "applicableTo": "String",
  "downgradeSensitivityRequiresJustification": "Boolean",
  "helpWebUrl": "String",
  "isMandatory": "Boolean"
}
```

