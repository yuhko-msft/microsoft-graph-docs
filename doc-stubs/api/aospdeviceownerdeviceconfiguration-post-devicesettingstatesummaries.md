---
title: "Create settingStateDeviceSummary"
description: "Create a new settingStateDeviceSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create settingStateDeviceSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new settingStateDeviceSummary object.

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
POST /deviceManagement/deviceConfigurations/{deviceConfigurationId}/deviceSettingStateSummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) object.

The following table shows the properties that are required when you create the [settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|settingName|String|Name of the setting|
|instancePath|String|Name of the InstancePath for the setting|
|unknownDeviceCount|Int32|Device Unkown count for the setting|
|notApplicableDeviceCount|Int32|Device Not Applicable count for the setting|
|compliantDeviceCount|Int32|Device Compliant count for the setting|
|remediatedDeviceCount|Int32|Device Compliant count for the setting|
|nonCompliantDeviceCount|Int32|Device NonCompliant count for the setting|
|errorDeviceCount|Int32|Device error count for the setting|
|conflictDeviceCount|Int32|Device conflict error count for the setting|



## Response

If successful, this method returns a `201 Created` response code and a [settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_settingstatedevicesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/deviceConfigurations/{deviceConfigurationId}/deviceSettingStateSummaries
Content-Type: application/json
Content-length: 409

{
  "@odata.type": "#microsoft.management.services.api.settingStateDeviceSummary",
  "settingName": "String",
  "instancePath": "String",
  "unknownDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "compliantDeviceCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "conflictDeviceCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.settingStateDeviceSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.settingStateDeviceSummary",
  "id": "deac7889-7889-deac-8978-acde8978acde",
  "settingName": "String",
  "instancePath": "String",
  "unknownDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "compliantDeviceCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "conflictDeviceCount": "Integer"
}
```

