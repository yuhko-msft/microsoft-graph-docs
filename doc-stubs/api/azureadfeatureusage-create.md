---
title: "Create azureADFeatureUsage"
description: "Create a new azureADFeatureUsage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create azureADFeatureUsage
Namespace: microsoft.graph



Create a new [azureADFeatureUsage](../resources/azureadfeatureusage.md) object.

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
POST ** Collection URI for microsoft.graph.azureADFeatureUsage not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [azureADFeatureUsage](../resources/azureadfeatureusage.md) object.

The following table shows the properties that are required when you create the [azureADFeatureUsage](../resources/azureadfeatureusage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|featureName|String|**TODO: Add Description**|
|snapshotDateTime|DateTimeOffset|**TODO: Add Description**|
|usage|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [azureADFeatureUsage](../resources/azureadfeatureusage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_azureadfeatureusage_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.azureADFeatureUsage not found
Content-Type: application/json
Content-length: 157

{
  "@odata.type": "#microsoft.graph.azureADFeatureUsage",
  "featureName": "String",
  "snapshotDateTime": "String (timestamp)",
  "usage": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.azureADFeatureUsage"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.azureADFeatureUsage",
  "id": "fa97900f-900f-fa97-0f90-97fa0f9097fa",
  "featureName": "String",
  "snapshotDateTime": "String (timestamp)",
  "usage": "Integer"
}
```

