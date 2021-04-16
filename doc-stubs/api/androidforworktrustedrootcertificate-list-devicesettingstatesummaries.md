---
title: "List deviceSettingStateSummaries"
description: "Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceSettingStateSummaries
Namespace: microsoft.graph



Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.

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
GET /deviceManagement/deviceConfigurations/{deviceConfigurationId}/rootCertificate/deviceSettingStateSummaries
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [settingStateDeviceSummary](../resources/settingstatedevicesummary.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_settingstatedevicesummary"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurations/{deviceConfigurationId}/rootCertificate/deviceSettingStateSummaries
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.settingStateDeviceSummary)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.settingStateDeviceSummary",
      "id": "f10553d6-53d6-f105-d653-05f1d65305f1",
      "compliantDeviceCount": "Integer",
      "conflictDeviceCount": "Integer",
      "errorDeviceCount": "Integer",
      "instancePath": "String",
      "nonCompliantDeviceCount": "Integer",
      "notApplicableDeviceCount": "Integer",
      "remediatedDeviceCount": "Integer",
      "settingName": "String",
      "unknownDeviceCount": "Integer"
    }
  ]
}
```

