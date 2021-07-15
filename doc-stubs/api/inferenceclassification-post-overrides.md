---
title: "Create inferenceClassificationOverride"
description: "Create a new inferenceClassificationOverride object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create inferenceClassificationOverride
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new inferenceClassificationOverride object.

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
POST /users/{usersId}/inferenceClassification/overrides
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [inferenceClassificationOverride](../resources/inferenceclassificationoverride.md) object.

The following table shows the properties that are required when you create the [inferenceClassificationOverride](../resources/inferenceclassificationoverride.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|classifyAs|inferenceClassificationType|**TODO: Add Description**. Possible values are: `focused`, `other`.|
|senderEmailAddress|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [inferenceClassificationOverride](../resources/inferenceclassificationoverride.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_inferenceclassificationoverride_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/inferenceClassification/overrides
Content-Type: application/json
Content-length: 184

{
  "@odata.type": "#microsoft.graph.inferenceClassificationOverride",
  "classifyAs": "String",
  "senderEmailAddress": {
    "@odata.type": "microsoft.graph.emailAddress"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.inferenceClassificationOverride"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.inferenceClassificationOverride",
  "id": "77b2e887-e887-77b2-87e8-b27787e8b277",
  "classifyAs": "String",
  "senderEmailAddress": {
    "@odata.type": "microsoft.graph.emailAddress"
  }
}
```

