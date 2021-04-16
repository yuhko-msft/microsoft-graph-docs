---
title: "Update windowsOfficeClientConfiguration"
description: "Update the properties of a windowsOfficeClientConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsOfficeClientConfiguration
Namespace: microsoft.graph



Update the properties of a [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsOfficeClientConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object.

The following table shows the properties that are required when you update the [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|checkinStatuses|[officeClientCheckinStatus](../resources/officeclientcheckinstatus.md) collection|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|policyPayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|userCheckinSummary|[officeUserCheckinSummary](../resources/officeusercheckinsummary.md)|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|userPreferencePayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsofficeclientconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windowsOfficeClientConfiguration not found
Content-Type: application/json
Content-length: 430

{
  "@odata.type": "#microsoft.graph.windowsOfficeClientConfiguration",
  "checkinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "description": "String",
  "displayName": "String",
  "policyPayload": "Stream",
  "priority": "Integer",
  "userCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  },
  "userPreferencePayload": "Stream"
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
  "@odata.type": "#microsoft.graph.windowsOfficeClientConfiguration",
  "id": "12af7f8a-7f8a-12af-8a7f-af128a7faf12",
  "checkinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "description": "String",
  "displayName": "String",
  "policyPayload": "Stream",
  "priority": "Integer",
  "userCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  },
  "userPreferencePayload": "Stream"
}
```

