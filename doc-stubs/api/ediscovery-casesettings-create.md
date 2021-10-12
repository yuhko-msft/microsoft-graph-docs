---
title: "Create caseSettings"
description: "Create a new caseSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create caseSettings
Namespace: microsoft.graph.ediscovery



Create a new [caseSettings](../resources/ediscovery-casesettings.md) object.

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
POST ** Collection URI for microsoft.graph.ediscovery.caseSettings not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [caseSettings](../resources/ediscovery-casesettings.md) object.

The following table shows the properties that are required when you create the [caseSettings](../resources/ediscovery-casesettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|redundancyDetection|[microsoft.graph.ediscovery.redundancyDetectionSettings](../resources/ediscovery-redundancydetectionsettings.md)|**TODO: Add Description**|
|topicModeling|[microsoft.graph.ediscovery.topicModelingSettings](../resources/ediscovery-topicmodelingsettings.md)|**TODO: Add Description**|
|ocr|[microsoft.graph.ediscovery.ocrSettings](../resources/ediscovery-ocrsettings.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [caseSettings](../resources/ediscovery-casesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_casesettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.ediscovery.caseSettings not found
Content-Type: application/json
Content-length: 354

{
  "@odata.type": "#microsoft.graph.ediscovery.caseSettings",
  "redundancyDetection": {
    "@odata.type": "microsoft.graph.ediscovery.redundancyDetectionSettings"
  },
  "topicModeling": {
    "@odata.type": "microsoft.graph.ediscovery.topicModelingSettings"
  },
  "ocr": {
    "@odata.type": "microsoft.graph.ediscovery.ocrSettings"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.caseSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.caseSettings",
  "id": "bc3e089c-089c-bc3e-9c08-3ebc9c083ebc",
  "redundancyDetection": {
    "@odata.type": "microsoft.graph.ediscovery.redundancyDetectionSettings"
  },
  "topicModeling": {
    "@odata.type": "microsoft.graph.ediscovery.topicModelingSettings"
  },
  "ocr": {
    "@odata.type": "microsoft.graph.ediscovery.ocrSettings"
  }
}
```

