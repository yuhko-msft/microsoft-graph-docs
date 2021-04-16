---
title: "Update synchronizationJob"
description: "Update the properties of a synchronizationJob object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update synchronizationJob
Namespace: microsoft.graph



Update the properties of a [synchronizationJob](../resources/synchronizationjob.md) object.

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
PATCH /applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [synchronizationJob](../resources/synchronizationjob.md) object.

The following table shows the properties that are required when you update the [synchronizationJob](../resources/synchronizationjob.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|schedule|[synchronizationSchedule](../resources/synchronizationschedule.md)|**TODO: Add Description**|
|status|[synchronizationStatus](../resources/synchronizationstatus.md)|**TODO: Add Description**|
|synchronizationJobSettings|[keyValuePair](../resources/keyvaluepair.md) collection|**TODO: Add Description**|
|templateId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [synchronizationJob](../resources/synchronizationjob.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_synchronizationjob"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}
Content-Type: application/json
Content-length: 361

{
  "@odata.type": "#microsoft.graph.synchronizationJob",
  "schedule": {
    "@odata.type": "microsoft.graph.synchronizationSchedule"
  },
  "status": {
    "@odata.type": "microsoft.graph.synchronizationStatus"
  },
  "synchronizationJobSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "templateId": "String"
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
  "@odata.type": "#microsoft.graph.synchronizationJob",
  "id": "4ed09b39-9b39-4ed0-399b-d04e399bd04e",
  "schedule": {
    "@odata.type": "microsoft.graph.synchronizationSchedule"
  },
  "status": {
    "@odata.type": "microsoft.graph.synchronizationStatus"
  },
  "synchronizationJobSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "templateId": "String"
}
```

