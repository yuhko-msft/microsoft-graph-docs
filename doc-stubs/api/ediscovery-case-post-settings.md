---
title: "Create settings"
description: "Create a new settings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create settings
Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new settings object.

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
POST /compliance/ediscovery/cases/{caseId}/settings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [settings](../resources/ediscovery-settings.md) object.

The following table shows the properties that are required when you create the [settings](../resources/ediscovery-settings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|ocr|[microsoft.graph.ediscovery.ocrSettings](../resources/ediscovery-ocrsettings.md)|**TODO: Add Description**|
|redundancyDetection|[microsoft.graph.ediscovery.redundancyDetectionSettings](../resources/ediscovery-redundancydetectionsettings.md)|**TODO: Add Description**|
|topicModeling|[microsoft.graph.ediscovery.topicModelingSettings](../resources/ediscovery-topicmodelingsettings.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [settings](../resources/ediscovery-settings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_settings_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/compliance/ediscovery/cases/{caseId}/settings
Content-Type: application/json
Content-length: 350

{
  "@odata.type": "#microsoft.graph.ediscovery.settings",
  "ocr": {
    "@odata.type": "microsoft.graph.ediscovery.ocrSettings"
  },
  "redundancyDetection": {
    "@odata.type": "microsoft.graph.ediscovery.redundancyDetectionSettings"
  },
  "topicModeling": {
    "@odata.type": "microsoft.graph.ediscovery.topicModelingSettings"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.settings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.settings",
  "id": "58950c7c-0c7c-5895-7c0c-95587c0c9558",
  "ocr": {
    "@odata.type": "microsoft.graph.ediscovery.ocrSettings"
  },
  "redundancyDetection": {
    "@odata.type": "microsoft.graph.ediscovery.redundancyDetectionSettings"
  },
  "topicModeling": {
    "@odata.type": "microsoft.graph.ediscovery.topicModelingSettings"
  }
}
```

