---
title: "Update directoryDefinition"
description: "Update the properties of a directoryDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update directoryDefinition
Namespace: microsoft.graph



Update the properties of a [directoryDefinition](../resources/directorydefinition.md) object.

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
PATCH /applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}/schema/directories/{directoryDefinitionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [directoryDefinition](../resources/directorydefinition.md) object.

The following table shows the properties that are required when you update the [directoryDefinition](../resources/directorydefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|discoverabilities|directoryDefinitionDiscoverabilities|**TODO: Add Description**. Possible values are: `None`, `AttributeNames`, `AttributeDataTypes`, `AttributeReadOnly`, `ReferenceAttributes`, `UnknownFutureValue`.|
|discoveryDateTime|DateTimeOffset|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|objects|[objectDefinition](../resources/objectdefinition.md) collection|**TODO: Add Description**|
|readOnly|Boolean|**TODO: Add Description**|
|version|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [directoryDefinition](../resources/directorydefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_directorydefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}/schema/directories/{directoryDefinitionId}
Content-Type: application/json
Content-length: 305

{
  "@odata.type": "#microsoft.graph.directoryDefinition",
  "discoverabilities": "String",
  "discoveryDateTime": "String (timestamp)",
  "name": "String",
  "objects": [
    {
      "@odata.type": "microsoft.graph.objectDefinition"
    }
  ],
  "readOnly": "Boolean",
  "version": "String"
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
  "@odata.type": "#microsoft.graph.directoryDefinition",
  "id": "f08f1330-1330-f08f-3013-8ff030138ff0",
  "discoverabilities": "String",
  "discoveryDateTime": "String (timestamp)",
  "name": "String",
  "objects": [
    {
      "@odata.type": "microsoft.graph.objectDefinition"
    }
  ],
  "readOnly": "Boolean",
  "version": "String"
}
```

