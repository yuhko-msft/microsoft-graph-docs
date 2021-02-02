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

Update the properties of a [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object.

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
In the request body, supply a JSON representation of the [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object.

The following table shows the properties that are required when you update the [managedDeviceOverview](../resources/intune-manageddeviceoverview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|enrolledDeviceCount|Int32|**TODO: Add Description**|
|mdmEnrolledCount|Int32|**TODO: Add Description**|
|dualEnrolledDeviceCount|Int32|**TODO: Add Description**|
|deviceOperatingSystemSummary|[deviceOperatingSystemSummary](../resources/intune-deviceoperatingsystemsummary.md)|**TODO: Add Description**|
|deviceExchangeAccessStateSummary|[deviceExchangeAccessStateSummary](../resources/intune-deviceexchangeaccessstatesummary.md)|**TODO: Add Description**|
|managedDeviceModelsAndManufacturers|[managedDeviceModelsAndManufacturers](../resources/intune-manageddevicemodelsandmanufacturers.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|partnerManagedDeviceSummary|[partnerManagedDeviceSummary](../resources/intune-partnermanageddevicesummary.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_manageddeviceoverview"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/managedDeviceOverview
Content-Type: application/json
Content-length: 635

{
  "@odata.type": "#microsoft.graph.managedDeviceOverview",
  "enrolledDeviceCount": "Integer",
  "mdmEnrolledCount": "Integer",
  "dualEnrolledDeviceCount": "Integer",
  "deviceOperatingSystemSummary": {
    "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
  },
  "deviceExchangeAccessStateSummary": {
    "@odata.type": "microsoft.graph.deviceExchangeAccessStateSummary"
  },
  "managedDeviceModelsAndManufacturers": {
    "@odata.type": "microsoft.graph.managedDeviceModelsAndManufacturers"
  },
  "partnerManagedDeviceSummary": {
    "@odata.type": "microsoft.graph.partnerManagedDeviceSummary"
  }
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
  "id": "b7e1d89f-d89f-b7e1-9fd8-e1b79fd8e1b7",
  "enrolledDeviceCount": "Integer",
  "mdmEnrolledCount": "Integer",
  "dualEnrolledDeviceCount": "Integer",
  "deviceOperatingSystemSummary": {
    "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
  },
  "deviceExchangeAccessStateSummary": {
    "@odata.type": "microsoft.graph.deviceExchangeAccessStateSummary"
  },
  "managedDeviceModelsAndManufacturers": {
    "@odata.type": "microsoft.graph.managedDeviceModelsAndManufacturers"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "partnerManagedDeviceSummary": {
    "@odata.type": "microsoft.graph.partnerManagedDeviceSummary"
  }
}
```

