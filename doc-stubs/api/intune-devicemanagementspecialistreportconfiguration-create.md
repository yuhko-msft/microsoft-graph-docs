---
title: "Create deviceManagementSpecialistReportConfiguration"
description: "Create a new deviceManagementSpecialistReportConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementSpecialistReportConfiguration
Namespace: microsoft.graph

Create a new [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.deviceManagementSpecialistReportConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|locales|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementspecialistreportconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.deviceManagementSpecialistReportConfiguration not found
Content-Type: application/json
Content-length: 123

{
  "@odata.type": "#microsoft.graph.deviceManagementSpecialistReportConfiguration",
  "locales": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementSpecialistReportConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementSpecialistReportConfiguration",
  "id": "67cf9734-9734-67cf-3497-cf673497cf67",
  "locales": [
    "String"
  ]
}
```

