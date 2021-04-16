---
title: "Update groupPolicyPresentationValueBoolean"
description: "Update the properties of a groupPolicyPresentationValueBoolean object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationValueBoolean
Namespace: microsoft.graph



Update the properties of a [groupPolicyPresentationValueBoolean](../resources/grouppolicypresentationvalueboolean.md) object.

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
PATCH ** Entity URI for microsoft.graph.groupPolicyPresentationValueBoolean not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationValueBoolean](../resources/grouppolicypresentationvalueboolean.md) object.

The following table shows the properties that are required when you update the [groupPolicyPresentationValueBoolean](../resources/grouppolicypresentationvalueboolean.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the object was created. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|value|Boolean|An boolean value for the associated presentation.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationValueBoolean](../resources/grouppolicypresentationvalueboolean.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationvalueboolean"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.groupPolicyPresentationValueBoolean not found
Content-Type: application/json
Content-length: 100

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueBoolean",
  "value": "Boolean"
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
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueBoolean",
  "id": "8081cfb9-cfb9-8081-b9cf-8180b9cf8180",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "value": "Boolean"
}
```

