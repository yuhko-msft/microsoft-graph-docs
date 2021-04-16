---
title: "directoryDefinition: discover"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# directoryDefinition: discover
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}/schema/directories/{directoryDefinitionId}/discover
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [directoryDefinition](../resources/directorydefinition.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "directorydefinition_discover"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}/schema/directories/{directoryDefinitionId}/discover
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.directoryDefinition"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.directoryDefinition",
    "id": "String (identifier)",
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
}
```

