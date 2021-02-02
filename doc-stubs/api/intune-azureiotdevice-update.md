---
title: "Update azureIOTDevice"
description: "Update the properties of an azureIOTDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update azureIOTDevice
Namespace: microsoft.graph

Update the properties of an [azureIOTDevice](../resources/intune-azureiotdevice.md) object.

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
PATCH /deviceManagement/azureIOTDevices/{azureIOTDeviceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [azureIOTDevice](../resources/intune-azureiotdevice.md) object.

The following table shows the properties that are required when you update the [azureIOTDevice](../resources/intune-azureiotdevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|**TODO: Add Description**|
|desiredProperties|[azureIOTProperty](../resources/intune-azureiotproperty.md) collection|**TODO: Add Description**|
|reportedProperties|[azureIOTProperty](../resources/intune-azureiotproperty.md) collection|**TODO: Add Description**|
|tags|[azureIOTProperty](../resources/intune-azureiotproperty.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [azureIOTDevice](../resources/intune-azureiotdevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_azureiotdevice"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/azureIOTDevices/{azureIOTDeviceId}
Content-Type: application/json
Content-length: 378

{
  "@odata.type": "#microsoft.graph.azureIOTDevice",
  "deviceId": "String",
  "desiredProperties": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ],
  "reportedProperties": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ],
  "tags": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ]
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
  "@odata.type": "#microsoft.graph.azureIOTDevice",
  "id": "2699c61b-c61b-2699-1bc6-99261bc69926",
  "deviceId": "String",
  "desiredProperties": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ],
  "reportedProperties": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ],
  "tags": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ]
}
```

