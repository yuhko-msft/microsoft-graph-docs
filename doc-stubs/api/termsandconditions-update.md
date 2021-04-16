---
title: "Update termsAndConditions"
description: "Update the properties of a termsAndConditions object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update termsAndConditions
Namespace: microsoft.graph



Update the properties of a [termsAndConditions](../resources/termsandconditions.md) object.

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
PATCH /deviceManagement/termsAndConditions/{termsAndConditionsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [termsAndConditions](../resources/termsandconditions.md) object.

The following table shows the properties that are required when you update the [termsAndConditions](../resources/termsandconditions.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|acceptanceStatement|String|Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&C policy. This is shown to the user on prompts to accept the T&C policy.|
|bodyText|String|Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&C policy.|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Administrator-supplied description of the T&C policy.|
|displayName|String|Administrator-supplied name for the T&C policy. |
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|modifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|title|String|Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&C policy.|
|version|Int32|Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&C policy.|



## Response

If successful, this method returns a `200 OK` response code and an updated [termsAndConditions](../resources/termsandconditions.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_termsandconditions"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/termsAndConditions/{termsAndConditionsId}
Content-Type: application/json
Content-length: 268

{
  "@odata.type": "#microsoft.graph.termsAndConditions",
  "acceptanceStatement": "String",
  "bodyText": "String",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "title": "String",
  "version": "Integer"
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
  "@odata.type": "#microsoft.graph.termsAndConditions",
  "id": "aa5b4b85-4b85-aa5b-854b-5baa854b5baa",
  "acceptanceStatement": "String",
  "bodyText": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "title": "String",
  "version": "Integer"
}
```

