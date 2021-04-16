---
title: "Create restrictedAppsViolation"
description: "Create a new restrictedAppsViolation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create restrictedAppsViolation
Namespace: microsoft.graph



Create a new [restrictedAppsViolation](../resources/restrictedappsviolation.md) object.

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
POST /deviceManagement/deviceConfigurationRestrictedAppsViolations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [restrictedAppsViolation](../resources/restrictedappsviolation.md) object.

The following table shows the properties that are required when you create the [restrictedAppsViolation](../resources/restrictedappsviolation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceConfigurationId|String|Device configuration profile unique identifier, must be Guid|
|deviceConfigurationName|String|Device configuration profile name|
|deviceName|String|Device name|
|managedDeviceId|String|Managed device unique identifier, must be Guid|
|platformType|policyPlatformType|Platform type. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|restrictedApps|[managedDeviceReportedApp](../resources/manageddevicereportedapp.md) collection|List of violated restricted apps|
|restrictedAppsState|restrictedAppsState|Restricted apps state. Possible values are: `prohibitedApps`, `notApprovedApps`.|
|userId|String|User unique identifier, must be Guid|
|userName|String|User name|



## Response

If successful, this method returns a `201 Created` response code and a [restrictedAppsViolation](../resources/restrictedappsviolation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_restrictedappsviolation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurationRestrictedAppsViolations
Content-Type: application/json
Content-length: 423

{
  "@odata.type": "#microsoft.graph.restrictedAppsViolation",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

