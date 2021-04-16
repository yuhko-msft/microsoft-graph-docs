---
title: "Create printJob"
description: "Create a new printJob object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create printJob
Namespace: microsoft.graph



Create a new [printJob](../resources/printjob.md) object.

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
POST /printerBase/jobs
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [printJob](../resources/printjob.md) object.

The following table shows the properties that are required when you create the [printJob](../resources/printjob.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configuration|[printJobConfiguration](../resources/printjobconfiguration.md)|**TODO: Add Description**|
|createdBy|[userIdentity](../resources/useridentity.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|isFetchable|Boolean|**TODO: Add Description**|
|redirectedFrom|String|**TODO: Add Description**|
|redirectedTo|String|**TODO: Add Description**|
|status|[printJobStatus](../resources/printjobstatus.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [printJob](../resources/printjob.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_printjob_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/printerBase/jobs
Content-Type: application/json
Content-length: 376

{
  "@odata.type": "#microsoft.graph.printJob",
  "configuration": {
    "@odata.type": "microsoft.graph.printJobConfiguration"
  },
  "createdBy": {
    "@odata.type": "microsoft.graph.userIdentity"
  },
  "isFetchable": "Boolean",
  "redirectedFrom": "String",
  "redirectedTo": "String",
  "status": {
    "@odata.type": "microsoft.graph.printJobStatus"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.printJob"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.printJob",
  "id": "b98a11a0-11a0-b98a-a011-8ab9a0118ab9",
  "configuration": {
    "@odata.type": "microsoft.graph.printJobConfiguration"
  },
  "createdBy": {
    "@odata.type": "microsoft.graph.userIdentity"
  },
  "createdDateTime": "String (timestamp)",
  "isFetchable": "Boolean",
  "redirectedFrom": "String",
  "redirectedTo": "String",
  "status": {
    "@odata.type": "microsoft.graph.printJobStatus"
  }
}
```

