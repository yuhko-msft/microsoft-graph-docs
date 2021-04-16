---
title: "Get restrictedAppsViolation"
description: "Read the properties and relationships of a restrictedAppsViolation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get restrictedAppsViolation
Namespace: microsoft.graph



Read the properties and relationships of a [restrictedAppsViolation](../resources/restrictedappsviolation.md) object.

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
GET /deviceManagement/deviceConfigurationRestrictedAppsViolations/{restrictedAppsViolationId}
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

If successful, this method returns a `200 OK` response code and a [restrictedAppsViolation](../resources/restrictedappsviolation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_restrictedappsviolation"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurationRestrictedAppsViolations/{restrictedAppsViolationId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.restrictedAppsViolation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.restrictedAppsViolation",
    "id": "13736272-6272-1373-7262-731372627313",
    "deviceConfigurationId": "String",
    "deviceConfigurationName": "String",
    "deviceName": "String",
    "managedDeviceId": "String",
    "platformType": "String",
    "restrictedApps": [
      {
        "@odata.type": "microsoft.graph.managedDeviceReportedApp"
      }
    ],
    "restrictedAppsState": "String",
    "userId": "String",
    "userName": "String"
  }
}
```

