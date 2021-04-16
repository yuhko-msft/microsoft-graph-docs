---
title: "Update synchronizationTemplate"
description: "Update the properties of a synchronizationTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update synchronizationTemplate
Namespace: microsoft.graph



Update the properties of a [synchronizationTemplate](../resources/synchronizationtemplate.md) object.

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
PATCH /applications/{applicationsId}/synchronization/templates/{synchronizationTemplateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [synchronizationTemplate](../resources/synchronizationtemplate.md) object.

The following table shows the properties that are required when you update the [synchronizationTemplate](../resources/synchronizationtemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicationId|Guid|**TODO: Add Description**|
|default|Boolean|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|discoverable|Boolean|**TODO: Add Description**|
|factoryTag|String|**TODO: Add Description**|
|metadata|[metadataEntry](../resources/metadataentry.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [synchronizationTemplate](../resources/synchronizationtemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_synchronizationtemplate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/applications/{applicationsId}/synchronization/templates/{synchronizationTemplateId}
Content-Type: application/json
Content-length: 294

{
  "@odata.type": "#microsoft.graph.synchronizationTemplate",
  "applicationId": "Guid",
  "default": "Boolean",
  "description": "String",
  "discoverable": "Boolean",
  "factoryTag": "String",
  "metadata": [
    {
      "@odata.type": "microsoft.graph.metadataEntry"
    }
  ]
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
  "@odata.type": "#microsoft.graph.synchronizationTemplate",
  "id": "b0fca2b6-a2b6-b0fc-b6a2-fcb0b6a2fcb0",
  "applicationId": "Guid",
  "default": "Boolean",
  "description": "String",
  "discoverable": "Boolean",
  "factoryTag": "String",
  "metadata": [
    {
      "@odata.type": "microsoft.graph.metadataEntry"
    }
  ]
}
```

