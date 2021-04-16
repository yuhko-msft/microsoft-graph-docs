---
title: "Update managedDeviceOverview"
description: "Update the properties of a managedDeviceOverview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update managedDeviceOverview
Namespace: microsoft.graph



Update the properties of a [managedDeviceOverview](../resources/manageddeviceoverview.md) object.

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
PATCH /deviceManagement/managedDeviceOverview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceOverview](../resources/manageddeviceoverview.md) object.

The following table shows the properties that are required when you update the [managedDeviceOverview](../resources/manageddeviceoverview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceExchangeAccessStateSummary|[deviceExchangeAccessStateSummary](../resources/deviceexchangeaccessstatesummary.md)|Distribution of Exchange Access State in Intune|
|deviceOperatingSystemSummary|[deviceOperatingSystemSummary](../resources/deviceoperatingsystemsummary.md)|Device operating system summary.|
|dualEnrolledDeviceCount|Int32|The number of devices enrolled in both MDM and EAS|
|enrolledDeviceCount|Int32|Total enrolled device count. Does not include PC devices managed via Intune PC Agent|
|lastModifiedDateTime|DateTimeOffset|Last modified date time of device overview|
|managedDeviceModelsAndManufacturers|[managedDeviceModelsAndManufacturers](../resources/manageddevicemodelsandmanufacturers.md)|Models and Manufactures meatadata for managed devices in the account|
|mdmEnrolledCount|Int32|The number of devices enrolled in MDM|



## Response

If successful, this method returns a `200 OK` response code and an updated [managedDeviceOverview](../resources/manageddeviceoverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_manageddeviceoverview"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/managedDeviceOverview
Content-Type: application/json
Content-length: 527

{
  "@odata.type": "#microsoft.graph.managedDeviceOverview",
  "deviceExchangeAccessStateSummary": {
    "@odata.type": "microsoft.graph.deviceExchangeAccessStateSummary"
  },
  "deviceOperatingSystemSummary": {
    "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
  },
  "dualEnrolledDeviceCount": "Integer",
  "enrolledDeviceCount": "Integer",
  "managedDeviceModelsAndManufacturers": {
    "@odata.type": "microsoft.graph.managedDeviceModelsAndManufacturers"
  },
  "mdmEnrolledCount": "Integer"
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
  "@odata.type": "#microsoft.graph.managedDeviceOverview",
  "id": "52b7fc17-fc17-52b7-17fc-b75217fcb752",
  "deviceExchangeAccessStateSummary": {
    "@odata.type": "microsoft.graph.deviceExchangeAccessStateSummary"
  },
  "deviceOperatingSystemSummary": {
    "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
  },
  "dualEnrolledDeviceCount": "Integer",
  "enrolledDeviceCount": "Integer",
  "lastModifiedDateTime": "String (timestamp)",
  "managedDeviceModelsAndManufacturers": {
    "@odata.type": "microsoft.graph.managedDeviceModelsAndManufacturers"
  },
  "mdmEnrolledCount": "Integer"
}
```

